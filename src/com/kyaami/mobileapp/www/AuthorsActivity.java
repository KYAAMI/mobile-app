package com.kyaami.mobileapp.www;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AuthorsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authors_layout);
        
        ListView listView1 = (ListView) findViewById(R.id.author_list);
        
        String[] items = { "Anesu Jairosi", "Jiro Jairosi", "Khanyo West"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView1.setAdapter(adapter);
    }
}