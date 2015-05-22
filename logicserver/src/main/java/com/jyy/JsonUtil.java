package com.jyy;

import com.alibaba.fastjson.JSONObject;
import com.jyy.wifi.vo.response.Operation;
import com.jyy.wifi.vo.response.Response;
import com.jyy.wifi.vo.response.ResponseData;
import com.jyy.wifi.vo.response.State;
import com.xunlei.jdbc.JdbcTemplate;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jyy on 5/19/15 4:10 PM.
 */
public class JsonUtil {
    public static void main(String[] args) {
        String path = "/Users/jyy/Documents/dsp/logicserver/src/main/java/com/jyy/wifi/vo/response/ResponseExample.json";
        String result =  getJsonStrFromFile(path);
        System.out.println(result);

        //返回内容使用如下几种方式
        //都是先从文件中读取通用的json字符串
        //1.每次替换字符串返回前端
        //2.调用对象的set方法 然后序列化


    }

    public static String getJsonStrFromFile(String filePath) {
        File file = new File(filePath);
        List<String> lines = new ArrayList<String>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            while(( line = br.readLine())!=null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String lineSeparator = System.getProperty("line.separator", "/n");
        String json = StringUtils.join(lines.iterator(), lineSeparator);

        return json;
    }

    //当wifi不需要更新文件的时候返回的内容模板
    public static String getTemplateNoUpdateJson() {

        Response response = new Response();
        response.setId(Constants.REQUEST_MACRO);
        State state = new State();
        state.setCode(Constants.WIFI_NOUPDATE);
        state.setMsg("配置文件无更改!");
        response.setState(state);
        String result = JSONObject.toJSONString(response);
        return result;
    }

    /**
     * 从数据库读取配置,生成wifi操作指令文件
     * @param jdbcTemplate
     * @return
     */
    public static String generateTemplateJson(JdbcTemplate jdbcTemplate)  {

        Response response = new Response();
        response.setId(Constants.REQUEST_MACRO);

        State state = new State();
        state.setCode(Constants.WIFI_NEEDUPDATE);
        state.setMsg("配置文件有更新!");
        response.setState(state);

        ResponseData data = new ResponseData();

        //TODO下面的变成配置 不要写死
        data.setKey("aabbcc");
        data.setCfgSvr("http://www.a.com/ur/c");
        data.setRenewTime(360);
        data.setStatSvr("http://www.a.com/ur/st");

        data.setVesion("13758498374");//TODO 配置文件的版本

        List<Operation> urlRedirects = jdbcTemplate.queryForList("select * from wifi.urlredirects",Operation.class);
        data.setUrlRedirect(urlRedirects.toArray(new Operation[urlRedirects.size()]));
        response.setData(data);

        String result = JSONObject.toJSONString(response);
        return result;
    }
}
