package com.jyy.cmd;

import com.alibaba.fastjson.JSONObject;
import com.jyy.JsonUtil;
import com.jyy.wifi.vo.request.Request;
import com.xunlei.jdbc.JdbcTemplate;
import com.xunlei.netty.httpserver.cmd.BaseCmd;
import com.xunlei.netty.httpserver.cmd.CmdMapper;
import com.xunlei.netty.httpserver.component.XLHttpRequest;
import com.xunlei.netty.httpserver.component.XLHttpResponse;
import com.xunlei.util.CharsetTools;
import com.xunlei.util.Log;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//统计接口
@CmdMapper({"/wificount"})
@Service
public class WifiCountCmd extends BaseCmd {
    private final Logger runningLog = Log.getLogger("com.wifi.count");

    @Override
    public Object process(XLHttpRequest request, XLHttpResponse response) throws Exception {

        String requestStr = request.getParameter("data");
        Request req = JSONObject.parseObject(requestStr, Request.class);
        String id = req.getId();//路由器唯一标识 请求id
        String caller = req.getClient().getCaller();
        String ver = req.getClient().getVer();//固件的版本号
        String uuid = req.getClient().getUuid();//固件mac
        String model = req.getClient().getEx().getModel();
        String requestVersion = req.getClient().getEx().getCv();//前端wifi请求的版本号
        String sid = req.getClient().getEx().getSid();
        String smsg = req.getClient().getEx().getSmsg();

        response.setStatus(HttpResponseStatus.OK);

        Object[] result = new Object[]{System.currentTimeMillis(),getIp(request)
                        ,id,caller,ver,uuid,model,requestVersion,sid,smsg};

        runningLog.info("{}->{}->{}->{}->{}->{}->{}->{}->{}->{}", result);

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
