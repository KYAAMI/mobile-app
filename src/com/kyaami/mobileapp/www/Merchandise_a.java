package com.kyaami.mobileapp.www;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class Merchandise_a extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_merchandise_a);
		
		GridView gridview = (GridView) findViewById(R.id.gridview);
	    gridview.setAdapter(new ImageAdapter(this));

	    gridview.setOnItemClickListener(new OnItemClickListener(){
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            Toast.makeText(Merchandise_a.this, "" + position, Toast.LENGTH_SHORT).show();
	        }
	    });
		
	}
}


