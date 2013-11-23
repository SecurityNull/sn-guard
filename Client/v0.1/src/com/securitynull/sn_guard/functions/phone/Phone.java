package com.securitynull.sn_guard.functions.phone;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class Phone {

    private String imei;
    private String type;

    public Phone() {
        super();
    }

    public Phone(String imei, String type) {
        super();

        this.imei = imei;
        this.type = type;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
