package com.jyy.wifi.vo.response;

/**
 * Created by jyy on 5/21/15 2:31 PM.
 */
public class Response {
    private String id;
    private State state;
    private ResponseData data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }

}
