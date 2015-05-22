package com.jyy.wifi.vo.request;

/**
 * Created by jyy on 5/21/15 2:48 PM.
 */
public class Ex {

    private String model;//型号

    private  String cv;//配置⽂文件版本号


    private String sid;//统计项编号

    private String smsg;//统计项内容

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSmsg() {
        return smsg;
    }

    public void setSmsg(String smsg) {
        this.smsg = smsg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
