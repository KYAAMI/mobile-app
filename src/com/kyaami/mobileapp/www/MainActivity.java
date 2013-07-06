package com.kyaami.mobileapp.www;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();    
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    
    public void startActivityMusic(View view) {
    	Intent intent;
        intent = new Intent(this, Music_a.class);
        startActivity(intent);
    }

    public void startActivityEvents(View v) {
        Intent intent = new Intent(this, Events_a.class);
        startActivity(intent);
    }

    public void startActivityLiterature(View v) {
        Intent intent = new Intent(MainActivity.this, Literature_a.class);
        startActivity(intent);
    }
    
    public void startActivityMerchandise(View v) {
        Intent intent = new Intent(MainActivity.this, Merchandise_a.class);
        startActivity(intent);
    }
    
    public void startActivityRadio(View v) {
        Intent intent = new Intent(MainActivity.this, Radio_a.class);
        startActivity(intent);
    }

}
