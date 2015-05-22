package com.jyy.wifi.vo.response;

/**
 * Created by jyy on 5/21/15 3:11 PM.
 */
public class ResponseData {
    private String vesion;//⽤用于⽐比较版本,版本相同泽⽆无需更新
    private int renewTime;//⾃自动更新时间,单位秒,默认10分钟
    private String key;//统计服务器接⼝口地址
    private String statSvr;//统计服务器接⼝口地址

    public String getCfgSvr() {
        return cfgSvr;
    }

    public void setCfgSvr(String cfgSvr) {
        this.cfgSvr = cfgSvr;
    }

    public Operation[] getUrlRedirect() {
        return urlRedirect;
    }

    public void setUrlRedirect(Operation[] urlRedirect) {
        this.urlRedirect = urlRedirect;
    }

    public String getStatSvr() {
        return statSvr;
    }

    public void setStatSvr(String statSvr) {
        this.statSvr = statSvr;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getRenewTime() {
        return renewTime;
    }

    public void setRenewTime(int renewTime) {
        this.renewTime = renewTime;
    }

    public String getVesion() {
        return vesion;
    }

    public void setVesion(String vesion) {
        this.vesion = vesion;
    }

    private String cfgSvr;//配置服务器接⼝口地址
    private Operation[] urlRedirect;
}
