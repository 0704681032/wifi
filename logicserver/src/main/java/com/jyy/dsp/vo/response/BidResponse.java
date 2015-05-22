package com.jyy.dsp.vo.response;

/**
 * Created by jyy on 5/19/15 3:31 PM.
 */
public class BidResponse {
    private String id;//响应的 Bid Request 的唯一 ID
    private String bidid;//bid response id,由 DSP 生成
    private int nbr;//不参与竞价的原因,默认是 0:未 知,当参与竞价时,不包含此域
    private SeatBid[] seatbid;//该 seat 的 0 或多组 bids

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBidid() {
        return bidid;
    }

    public void setBidid(String bidid) {
        this.bidid = bidid;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public SeatBid[] getSeatbid() {
        return seatbid;
    }

    public void setSeatbid(SeatBid[] seatbid) {
        this.seatbid = seatbid;
    }
}
