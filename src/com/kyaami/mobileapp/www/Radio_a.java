package com.kyaami.mobileapp.www;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Radio_a extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_a);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio_a, menu);
		return true;
	}

}
