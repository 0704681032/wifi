package com.jyy.dsp.vo.response;

/**
 * Created by jyy on 5/19/15 3:12 PM.
 */
public class Bid {
    public String getImpid() {
        return impid;
    }

    public void setImpid(String impid) {
        this.impid = impid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }

    public String getNurl() {
        return nurl;
    }

    public void setNurl(String nurl) {
        this.nurl = nurl;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public int getAdw() {
        return adw;
    }

    public void setAdw(int adw) {
        this.adw = adw;
    }

    public int getAdh() {
        return adh;
    }

    public void setAdh(int adh) {
        this.adh = adh;
    }

    public String getIurl() {
        return iurl;
    }

    public void setIurl(String iurl) {
        this.iurl = iurl;
    }

    public String getCurl() {
        return curl;
    }

    public void setCurl(String curl) {
        this.curl = curl;
    }

    public String[] getCturl() {
        return cturl;
    }

    public void setCturl(String[] cturl) {
        this.cturl = cturl;
    }

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCrid() {
        return crid;
    }

    public void setCrid(String crid) {
        this.crid = crid;
    }

    public int getCtype() {
        return ctype;
    }

    public void setCtype(int ctype) {
        this.ctype = ctype;
    }

    public String getCbundle() {
        return cbundle;
    }

    public void setCbundle(String cbundle) {
        this.cbundle = cbundle;
    }

    public String[] getAttr() {
        return attr;
    }

    public void setAttr(String[] attr) {
        this.attr = attr;
    }

    public String getAdomain() {
        return adomain;
    }

    public void setAdomain(String adomain) {
        this.adomain = adomain;
    }

    public Ext getExt() {
        return ext;
    }

    public void setExt(Ext ext) {
        this.ext = ext;
    }

    private String impid;//出价的 Impression 的唯一 ID
    private int price;//出价,单位为 0.0001 元/CPM, 例如出 价为 0.6 元,则 0.6*10000=6000。 注:非 RTB 可以不返回价格
    private String adid;//广告 ID
    private String nurl;//Win Notice URL 注:非 RTB 不返回 nurl
    private String adm;//广告物料,值为 HTML 片段 如果是开屏广告,仅包含 URL 地址 img 标签中 width, height 设置为 100%
    private int adw;//广告物料宽度,仅当全插屏广告时有效
    private int adh;//广告物料高度,仅当全插屏广告时有效
    private String  iurl;//广告展示监播地址,当 adm 中不包括 DSP 展示监播地址或第三方监播地址时 使用
    private String  curl;//广告点击目标 URL,用于 adm 的 #CLICK_URL#宏,作为广告被点击时 的目标 URL
    private String[] cturl;//广告点击监播地址,用户 adm 的 #CLICK_URL#宏,作为广告被点击时 的监播消息地址,URL 必须支持重定向
    private String aurl;//激活效果地址,用于 CPA 广告的激活效 果回调
    private String cid;//Campaign ID
    private String crid;//广告物料 ID
    private int ctype;//点击目标类型,参考附录 8.8
    private String  cbundle;//点击后下载 App 的包名,仅当 ctype 为 2 – 下载App时有效
    private String[] attr;//广告属性,参考附录 8.3
    private String adomain;///广告主域名
    private Ext ext;//扩展对象,定义一些特殊的属性




}
