package com.jyy.cmd;

import com.alibaba.fastjson.JSONObject;
import com.jyy.JsonUtil;
import com.jyy.util.CpmDataPool;
import com.jyy.wifi.vo.request.Request;
import com.xunlei.jdbc.JdbcTemplate;
import com.xunlei.netty.httpserver.cmd.BaseCmd;
import com.xunlei.netty.httpserver.cmd.CmdMapper;
import com.xunlei.netty.httpserver.component.XLHttpRequest;
import com.xunlei.netty.httpserver.component.XLHttpResponse;
import com.xunlei.util.CharsetTools;
import com.xunlei.util.Log;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by jyy on 5/18/15.
 */
@CmdMapper({"/wifirequest"})
@Service
public class WifiRequestCmd extends BaseCmd {

    private static final String BEGIN = "(";

    private static final String END = ")";

    protected final Logger runningLog = Log.getLogger("com.wifi.running");

    @Autowired
    private CpmDataPool cpmDataPool;


    /**
     * 广告请求入口，主要工作是解析请求参数
     */
    @Override
    public Object process(XLHttpRequest request, XLHttpResponse response) throws Exception {

        String requestStr = request.getParameter("data");
        Request req = JSONObject.parseObject(requestStr, Request.class);
        String id = req.getId();//路由器唯一标识 请求id

        String result ; //返回的内容

        //判断是否需要更新配置文件
        String requestVersion = req.getClient().getEx().getCv();//前端wifi请求的版本号
        String ver = req.getClient().getVer();//固件的版本号
        String latestVersion = cpmDataPool.getLatestVersion();//最新版本号

        if ( latestVersion.equals(requestVersion) ) { //不需要更新
            result = cpmDataPool.NOUPDATE_TEMPLATECONTENT;
        } else {
            result = cpmDataPool.getTemplateContent();
            String uuid = req.getClient().getUuid();//固件mac
            result = result.replace("[UR_MAC]",uuid);
        }
        //宏替换
        result = result.replace("[REQUEST_ID]",id);//替换请求id

        //第二种方式:jsonp
        String callback = request.getParameter("callback","callback");
        StringBuilder sb = new StringBuilder();
        sb.append(callback).append(BEGIN).append(result).append(END);

        response.setContentCharset(CharsetTools.UTF_8);
        response.setContentStr(sb.toString());


        runningLog.info("{}->{}", new Object[]{getIp(request), System.currentTimeMillis()});

        return null;
    }

    public static String getIp(XLHttpRequest request) {
        String ip = request.getHeader("X-Real-IP");
        // 如果不是代理形式,直接取IP
        if (ip == null) {
            ip = request.getRemoteIP();
        }
        return ip;
    }


}
