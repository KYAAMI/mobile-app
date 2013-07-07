package com.kyaami.mobileapp.www;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Music_a extends TabActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_music_a);
		
TabHost tabHost = getTabHost();
        
        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Songs");
        photospec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs));
        Intent photosIntent = new Intent(this, Songs.class);
        photospec.setContent(photosIntent);
        
        // Tab for Songs
        TabSpec songspec = tabHost.newTabSpec("Albums");
        // setting Title and Icon for the Tab
        songspec.setIndicator("Albums", getResources().getDrawable(R.drawable.icon_album));
        Intent songsIntent = new Intent(this, Albums.class);
        songspec.setContent(songsIntent);
        
        // Tab for Videos
        TabSpec videospec = tabHost.newTabSpec("Artists");
        videospec.setIndicator("Artists", getResources().getDrawable(R.drawable.icon_artists));
        Intent videosIntent = new Intent(this, Artists.class);
        videospec.setContent(videosIntent);
        
        // Tab for Genres
        TabSpec genrespec = tabHost.newTabSpec("Genres");
        genrespec.setIndicator("Genres", getResources().getDrawable(R.drawable.genre));
        Intent genresIntent = new Intent(this, GenreActivity.class);
        genrespec.setContent(genresIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab
        tabHost.addTab(genrespec); // Adding genres tab
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.music_a, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    
	            // app icon in action bar clicked; go home
	            Intent intent = new Intent(this, Literature_a.class);
	            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	            startActivity(intent);
	            return true;
	    }
}
