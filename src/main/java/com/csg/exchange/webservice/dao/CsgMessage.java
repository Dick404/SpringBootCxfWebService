package com.csg.exchange.webservice.dao;


import java.io.Serializable;

public class CsgMessage implements Serializable{

    private String data;   //定制节点信息
    private String token;  //认证token
    private String vssid;  //交换定制协议数据唯一标识

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getVssid() {
        return vssid;
    }

    public void setVssid(String vssid) {
        this.vssid = vssid;
    }

    @Override
    public String toString() {
        return "CsgMessage{" +
                "data='" + data + '\'' +
                ", token='" + token + '\'' +
                ", vssid='" + vssid + '\'' +
                '}';
    }
}
