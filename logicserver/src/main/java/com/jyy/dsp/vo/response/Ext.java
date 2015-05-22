package com.jyy.dsp.vo.response;

/**
 * Created by jyy on 5/18/15.
 */
public class Ext {
    private int instl;//仅在全插屏广告时返回,插屏:1,全屏:2
    private int adt;//仅在开屏广告时返回,标识开屏广告的播 放时长(秒)
    private String ade;//仅在开屏广告时返回,标识开屏广告的过 期 时 间 , 格 式 :YYYYMMdd , 例 如 20140730,广告展示到 2014 年 7 月 29 日结束,7 月 30 日不再展示
    private String apkname;//下载 APP 的名称,下载时会显示此名称

    public String getApkname() {
        return apkname;
    }

    public void setApkname(String apkname) {
        this.apkname = apkname;
    }

    public String getAde() {
        return ade;
    }

    public void setAde(String ade) {
        this.ade = ade;
    }

    public int getAdt() {
        return adt;
    }

    public void setAdt(int adt) {
        this.adt = adt;
    }

    public int getInstl() {
        return instl;
    }

    public void setInstl(int instl) {
        this.instl = instl;
    }


}
