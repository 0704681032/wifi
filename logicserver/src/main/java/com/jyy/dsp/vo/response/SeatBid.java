package com.jyy.dsp.vo.response;

/**
 * Created by jyy on 5/19/15 3:29 PM.
 */
public class SeatBid {
    private Bid[] bid;//DSP的出价
    private String seat;//seat bid id,由 DSP 生成

    public Bid[] getBid() {
        return bid;
    }

    public void setBid(Bid[] bid) {
        this.bid = bid;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
