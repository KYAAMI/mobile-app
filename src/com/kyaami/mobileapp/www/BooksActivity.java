package com.kyaami.mobileapp.www;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BooksActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_layout);
        
        ListView listView1 = (ListView) findViewById(R.id.book_list);
        
        String[] items = { "Nhamo Dzenyika", "Road To Freedom", "ANC Youth League Manifesto", "Remember When It Rained", "Neria", "Tsuro naGudo","Nyambo Dzejoni" };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView1.setAdapter(adapter);
    }
}
