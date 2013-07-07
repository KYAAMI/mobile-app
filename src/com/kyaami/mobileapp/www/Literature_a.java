package com.kyaami.mobileapp.www;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Literature_a extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_a);
         
        TabHost tabHost = getTabHost();
         
        // Tab for Books
        TabSpec bookspec = tabHost.newTabSpec("Books");
        // setting Title and Icon for the Tab
        bookspec.setIndicator("Books", getResources().getDrawable(R.drawable.books));
        Intent photosIntent = new Intent(this, BooksActivity.class);
        bookspec.setContent(photosIntent);
         
        // Tab for Authors
        TabSpec authorspec = tabHost.newTabSpec("Authors");        
        authorspec.setIndicator("Authors", getResources().getDrawable(R.drawable.users));
        Intent songsIntent = new Intent(this, AuthorsActivity.class);
        authorspec.setContent(songsIntent);
         
        // Tab for Tags
        TabSpec tagspec = tabHost.newTabSpec("Tags");
        tagspec.setIndicator("Tags", getResources().getDrawable(R.drawable.lit));
        Intent videosIntent = new Intent(this, TagsActivity.class);
        tagspec.setContent(videosIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(bookspec); // Adding Books tab
        tabHost.addTab(authorspec); // Adding Authors tab
        tabHost.addTab(tagspec); // Adding Tags tab
    }

}
