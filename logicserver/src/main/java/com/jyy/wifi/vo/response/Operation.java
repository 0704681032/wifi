package com.jyy.wifi.vo.response;

/**
 * Created by jyy on 5/21/15 3:13 PM.
 */
public class Operation {

    public enum OperationType {
        REDIRECT("redirect"),//使⽤用内容重定向url
        REPLACE("replace"),//使⽤用内容直接替换返回内容(返回头保持不变)
        JSAPPENDpend("jsappend");//将内容添加⾄至</body>|</BODY>之后(必要条件),</html>|</HTML>之前(紧贴),
                                // 如果 找不到body,html标签则默认添加到⻚页⾯面尾部
        private String type;
        OperationType(String type){
            this.type = type;
        }
    }

    private String id;//url正则
    private String m;//url正则
    private String p;//url正则
    private String c;//内容,需要宏替换处理

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
