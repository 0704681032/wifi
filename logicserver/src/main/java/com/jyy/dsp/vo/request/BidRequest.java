package com.jyy.dsp.vo.request;

import java.util.Arrays;

/**
 * Created by jyy on 5/18/15.
 */
public class BidRequest {
    private String id;//bid request 的唯一 id,由 AMAX 生成
    private Impression[] imp;//Impression 对象数组,但仅包含一个 com.jyy.dsp.vo.request.Impression 对象,描述广告位
    private App app;//App 对象,描述 com.jyy.dsp.vo.request.App 信息
    private Device device;//Device 对象,描述设备信息
    private String[] bcat;//广告行业黑名单,参考附录 8.1
    private String[] badv;//广告主黑名单,采用域名标注广告主

    @Override
    public String toString() {
        return "BidRequest{" +
                "id='" + id + '\'' +
                ", imp=" + Arrays.toString(imp) +
                ", app=" + app +
                ", device=" + device +
                ", bcat=" + Arrays.toString(bcat) +
                ", badv=" + Arrays.toString(badv) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Impression[] getImp() {
        return imp;
    }

    public void setImp(Impression[] imp) {
        this.imp = imp;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String[] getBcat() {
        return bcat;
    }

    public void setBcat(String[] bcat) {
        this.bcat = bcat;
    }

    public String[] getBadv() {
        return badv;
    }

    public void setBadv(String[] badv) {
        this.badv = badv;
    }



}
