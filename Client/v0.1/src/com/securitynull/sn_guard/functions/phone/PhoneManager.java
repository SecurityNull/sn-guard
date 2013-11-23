package com.securitynull.sn_guard.functions.phone;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class PhoneManager {

    Context c;
    ContentResolver cr;

    public PhoneManager() {
        super();
    }

    public PhoneManager(Context c, ContentResolver cr) {
        super();

        this.c = c;
        this.cr = cr;
    }

    public Phone getPhoneInfo() {
        TelephonyManager tm = (TelephonyManager) this.c.getSystemService(Context.TELEPHONY_SERVICE);
        Phone phone = new Phone();

        if (tm != null) {
            phone.setImei(tm.getDeviceId());

            if (phone.getImei() == null || phone.getImei().length() == 0)
                phone.setImei(Settings.Secure.getString(this.cr, Settings.Secure.ANDROID_ID));

            switch (tm.getPhoneType()) {
                case TelephonyManager.PHONE_TYPE_NONE:
                    phone.setType("NONE");
                case TelephonyManager.PHONE_TYPE_GSM:
                    phone.setType("GSM");
                case TelephonyManager.PHONE_TYPE_CDMA:
                    phone.setType("CDMA");
                default:
                    phone.setType("Unknown");
            }
        }

        return phone;
    }
}
