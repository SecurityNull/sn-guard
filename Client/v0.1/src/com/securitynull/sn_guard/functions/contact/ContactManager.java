package com.securitynull.sn_guard.functions.contact;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class ContactManager {

    private ContentResolver cr;

    public ContactManager() {
        super();
    }

    public ContactManager(ContentResolver cr) {
        super();

        this.cr = cr;
    }

    public ContentResolver getContentRes() {
        return cr;
    }

    public void setContentRes(ContentResolver cr) {
        this.cr = cr;
    }

    public ArrayList<Contact> getAllContacts() {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        Cursor cur = this.cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);

        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                Contact contact = new Contact();

                contact.setId(cur.getString(cur.getColumnIndex(ContactsContract.Contacts._ID)));
                contact.setDisplayName(cur.getString(cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));

                Cursor cur2 = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?", new String[] { contact.getId() }, null);

                if (cur2.getCount() > 0) {
                    while (cur2.moveToNext()) {
                        contact.setNumber(cur2.getString(cur2.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));
                        contact.setNumberType(cur2.getString(cur2.getColumnIndex(ContactsContract.CommonDataKinds.Phone.TYPE)));
                    }
                }

                cur2.close();
                contactList.add(contact);
            }
        }

        cur.close();

        return contactList;
    }

    public int countContacts() {
        Cursor cur = this.cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        int count = cur.getCount();
        cur.close();

        return count;
    }
}
