package com.jyy.dsp.vo.request;

import java.util.Arrays;

/**
 * Created by jyy on 5/18/15.
 */
public class Impression {

    private String impid;//唯一 id,由 AMAX 生成
    private int bidfloor;//底价,单位为 0.0001 元/CPM,例如底 价为 0.6 元,则 0.6*10000=6000
    private String bidfloorcur;//底价的币种,使用 ISO-4217 编码,目前 值为 CNY
    private int w;//广告位的宽度,单位为点(dpi),全插 屏广告不包含
    private int h;//广告位的高度,单位为点(dpi),全插 屏广告不包含
    private int pos;//广告位在屏幕上的位置,参考附录 8.7
    private String[] btype;//拒绝的广告类型,参考附录 8.2
    private String[] battr;//拒绝的广告创意属性,参考附录 8.3
    private int instl;//是否全插屏广告,0:不是,1:是
    private int splash;//是否开屏广告,0:不是,1:是

    @Override
    public String toString() {
        return "Impression{" +
                "impid='" + impid + '\'' +
                ", bidfloor=" + bidfloor +
                ", bidfloorcur='" + bidfloorcur + '\'' +
                ", w=" + w +
                ", h=" + h +
                ", pos=" + pos +
                ", btype=" + Arrays.toString(btype) +
                ", battr=" + Arrays.toString(battr) +
                ", instl=" + instl +
                ", splash=" + splash +
                '}';
    }

    public String getImpid() {
        return impid;
    }

    public void setImpid(String impid) {
        this.impid = impid;
    }

    public int getBidfloor() {
        return bidfloor;
    }

    public void setBidfloor(int bidfloor) {
        this.bidfloor = bidfloor;
    }

    public String getBidfloorcur() {
        return bidfloorcur;
    }

    public void setBidfloorcur(String bidfloorcur) {
        this.bidfloorcur = bidfloorcur;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String[] getBtype() {
        return btype;
    }

    public void setBtype(String[] btype) {
        this.btype = btype;
    }

    public String[] getBattr() {
        return battr;
    }

    public void setBattr(String[] battr) {
        this.battr = battr;
    }

    public int getInstl() {
        return instl;
    }

    public void setInstl(int instl) {
        this.instl = instl;
    }

    public int getSplash() {
        return splash;
    }

    public void setSplash(int splash) {
        this.splash = splash;
    }
}
