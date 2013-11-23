package com.securitynull.sn_guard.functions.sms;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class SMS {

    private String messageID;
    private String threadID;
    private String address;
    private String contactID;
    private String timestamp;
    private String subject;
    private String body;
    private int isReaded;
    private int isDeleted;
    private int isLocked;

    public SMS() {
        super();
    }

    public SMS(String messageID, String threadID, String address, String contactID, String timestamp, String subject, String body, int isReaded, int isDeleted, int isLocked) {
        super();

        this.messageID = messageID;
        this.threadID = threadID;
        this.address = address;
        this.contactID = contactID;
        this.timestamp = timestamp;
        this.subject = subject;
        this.body = body;
        this.isReaded = isReaded;
        this.isDeleted = isDeleted;
        this.isLocked = isLocked;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getThreadID() {
        return threadID;
    }

    public void setThreadID(String threadID) {
        this.threadID = threadID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int isReaded() {
        return isReaded;
    }

    public void setReaded(int isReaded) {
        this.isReaded = isReaded;
    }

    public int isDeleted() {
        return isDeleted;
    }

    public void setDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int isLocked() {
        return isLocked;
    }

    public void setLocked(int isLocked) {
        this.isLocked = isLocked;
    }
}
