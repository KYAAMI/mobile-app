package com.kyaami.mobileapp.www;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TagsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tags_layout);    
        
        ListView listView1 = (ListView) findViewById(R.id.tag_list);
        
        String[] items = { "Action & Adventure", "Contemporary", "Fiction", "Non-Fiction", "Philosophy", "Romance","Short Stories" };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView1.setAdapter(adapter);
    
    }
}