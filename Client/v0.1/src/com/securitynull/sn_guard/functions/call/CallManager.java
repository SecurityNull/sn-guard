package com.securitynull.sn_guard.functions.call;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.CallLog;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class CallManager {

    private ContentResolver cr;

    public CallManager() {
        super();
    }

    public CallManager(ContentResolver cr) {
        super();

        this.cr = cr;
    }

    public ContentResolver getContentRes() {
        return cr;
    }

    public void setContentRes(ContentResolver cr) {
        this.cr = cr;
    }

    public ArrayList<Call> getAllCalls() {
        ArrayList<Call> callList = new ArrayList<Call>();
        Cursor cur = this.cr.query(CallLog.Calls.CONTENT_URI, null, null, null, null);

        int numIndex = cur.getColumnIndex(CallLog.Calls.NUMBER);
        int typeIndex = cur.getColumnIndex(CallLog.Calls.TYPE);
        int dateIndex = cur.getColumnIndex(CallLog.Calls.DATE);
        int durIndex = cur.getColumnIndex(CallLog.Calls.DURATION);

        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                String number = cur.getString(numIndex);
                String callDate = cur.getString(dateIndex);
                String callDuration = cur.getString(durIndex);
                String callType = cur.getString(typeIndex);

                if (Integer.parseInt(callType) == CallLog.Calls.INCOMING_TYPE) {
                    callList.add(new Call(number, new Date(Long.valueOf(callDate)), callDuration, true));
                } else if (Integer.parseInt(callType) == CallLog.Calls.OUTGOING_TYPE) {
                    callList.add(new Call(number, new Date(Long.valueOf(callDate)), callDuration, false));
                }
            }
        }

        cur.close();

        return callList;
    }
}
