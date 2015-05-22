package com.jyy.wifi.vo.request;

/**
 * Created by jyy on 5/21/15 2:31 PM.
 */
public class Request {
    private String id;//mac+timestamp
    private Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
