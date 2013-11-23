package com.securitynull.sn_guard.ui;

import com.securitynull.sn_guard.R;
import com.securitynull.sn_guard.functions.sms.SMSManager;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnStart = (Button) findViewById(R.id.button1);
		
		btnStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            	 

                SMSManager smsManager = new SMSManager(MainActivity.this.getContentResolver());
                Log.v("SMS", "CUENTA: " + String.valueOf(smsManager.getMessageCount()));
                
                Toast.makeText(MainActivity.this, String.valueOf(smsManager.getMessageCount()), Toast.LENGTH_SHORT).show();
            }
        });
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
