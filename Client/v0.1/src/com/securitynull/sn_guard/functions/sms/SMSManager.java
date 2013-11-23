package com.securitynull.sn_guard.functions.sms;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class SMSManager {

    //private static final Uri SMS = Uri.parse("content://sms");
    private static final Uri SMS_INBOX = Uri.parse("content://sms/inbox");
    //private static final Uri URI_SENT = Uri.parse("content://sms/sent");

    private ContentResolver cr;

    public SMSManager() {
        super();
    }

    public SMSManager(ContentResolver cr) {
        super();

        this.cr = cr;
    }

    public ContentResolver getContentRes() {
        return cr;
    }

    public void setContentRes(ContentResolver cr) {
        this.cr = cr;
    }

    public ArrayList<SMS> getAllSMS() {
        ArrayList<SMS> smsList = new ArrayList<SMS>();

        Cursor cur = this.cr.query(this.SMS_INBOX, null, null, null, "date DESC");

        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                SMS sms = new SMS();

                sms.setMessageID(String.valueOf(cur.getLong(cur.getColumnIndex("_id"))));
                sms.setThreadID(String.valueOf(cur.getLong(cur.getColumnIndex("thread_id"))));
                sms.setAddress(cur.getString(cur.getColumnIndex("address")));
                sms.setContactID(String.valueOf(cur.getLong(cur.getColumnIndex("person"))));
                sms.setTimestamp(String.valueOf(new SimpleDateFormat("hh:mm:ss MM/dd/yyyy").format(cur.getLong(cur.getColumnIndex("date")))));
                sms.setSubject(cur.getString(cur.getColumnIndex("subject")));
                sms.setBody(cur.getString(cur.getColumnIndex("body")));
                sms.setReaded(cur.getInt(cur.getColumnIndex("read")));
                sms.setDeleted(cur.getInt(cur.getColumnIndex("deleted")));
                sms.setLocked(cur.getInt(cur.getColumnIndex("locked")));

                smsList.add(sms);
            }
        }

        cur.close();

        return smsList;
    }

    public void setMessageReadStatus(int messageID) {
        ContentValues values = new ContentValues();
        values.put("read", true);
        this.cr.update(this.SMS_INBOX, values, "_id= " + messageID, null);
    }

    public int getUnReadMessageCount() {
        Cursor c = this.cr.query(this.SMS_INBOX, null, "read = 0", null, null);
        int count = c.getCount();
        c.close();

        return count;
    }

    public int getMessageCount() {
        Cursor c = this.cr.query(this.SMS_INBOX, null, null, null, null);
        int count = c.getCount();
        c.close();

        return count;
    }
}
