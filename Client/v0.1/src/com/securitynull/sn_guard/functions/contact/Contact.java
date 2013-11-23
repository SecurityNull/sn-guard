package com.securitynull.sn_guard.functions.contact;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class Contact {

    private String id;
    private String displayName;
    private String number;
    private String numberType;

    public Contact() {
        super();
    }

    public Contact(String id, String displayName, String number, String numberType) {
        super();

        this.id = id;
        this.displayName = displayName;
        this.number = number;
        this.numberType = numberType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberType() {
        return numberType;
    }

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }
}
