package com.jyy.wifi.vo.request;

/**
 * Created by jyy on 5/21/15 2:44 PM.
 */
public class Client {
    private String caller;
    private String ver;//固件版本号
    private String uuid;//固件mac
    private Ex ex ;

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Ex getEx() {
        return ex;
    }

    public void setEx(Ex ex) {
        this.ex = ex;
    }
}
