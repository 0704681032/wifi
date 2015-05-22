package com.jyy.dsp.vo.request;

import java.util.Arrays;

/**
 * Created by jyy on 5/18/15.
 */
public class App {

    private String aid;//App 唯一 id,由 AMAX 生成 -- required
    private String name;//App 名称
    private String[] cat;//App 类型,参考附录 8.4
    private String ver;//App 版本
    private String bundle;//包名或 BundleID
    private String itid;//iOS App iTunes ID
    private int paid;//是否是付费App:0:不是,1:是
    private String storeurl;//App的市场下载地址
    private String Keywords;//App关键字,可多个,逗号隔离
    private String pid;//Publisher id
    private String pub;//Publisher 名称

    @Override
    public String toString() {
        return "App{" +
                "aid='" + aid + '\'' +
                ", name='" + name + '\'' +
                ", cat=" + Arrays.toString(cat) +
                ", ver='" + ver + '\'' +
                ", bundle='" + bundle + '\'' +
                ", itid='" + itid + '\'' +
                ", paid=" + paid +
                ", storeurl='" + storeurl + '\'' +
                ", Keywords='" + Keywords + '\'' +
                ", pid='" + pid + '\'' +
                ", pub='" + pub + '\'' +
                '}';
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String[] getCat() {
        return cat;
    }

    public void setCat(String[] cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public String getItid() {
        return itid;
    }

    public void setItid(String itid) {
        this.itid = itid;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public String getStoreurl() {
        return storeurl;
    }

    public void setStoreurl(String storeurl) {
        this.storeurl = storeurl;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }
}
