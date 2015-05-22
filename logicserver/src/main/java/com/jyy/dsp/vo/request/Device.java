package com.jyy.dsp.vo.request;

/**
 * Created by jyy on 5/18/15.
 */
public class Device {
    private String did;
    private String dpid;
    private String mac;
    private String ua;
    private String ip;
    private String country;
    private String carrier;
    private String language;
    private String make;
    private String model;
    private String os;
    private String osv;
    private int connectiontype;
    private int devicetype;
    private String loc;
    private float density;
    private int sw;
    private int sh;
    private int orientation;


    @Override
    public String toString() {
        return "Device{" +
                "did='" + did + '\'' +
                ", dpid='" + dpid + '\'' +
                ", mac='" + mac + '\'' +
                ", ua='" + ua + '\'' +
                ", ip='" + ip + '\'' +
                ", country='" + country + '\'' +
                ", carrier='" + carrier + '\'' +
                ", language='" + language + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", osv='" + osv + '\'' +
                ", connectiontype=" + connectiontype +
                ", devicetype=" + devicetype +
                ", loc='" + loc + '\'' +
                ", density=" + density +
                ", sw=" + sw +
                ", sh=" + sh +
                ", orientation=" + orientation +
                '}';
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsv() {
        return osv;
    }

    public void setOsv(String osv) {
        this.osv = osv;
    }

    public int getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(int connectiontype) {
        this.connectiontype = connectiontype;
    }

    public int getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(int devicetype) {
        this.devicetype = devicetype;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public int getSh() {
        return sh;
    }

    public void setSh(int sh) {
        this.sh = sh;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }


}

