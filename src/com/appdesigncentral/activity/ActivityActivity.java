package com.appdesigncentral.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.appdesigncentral.adapter.GalleryAdapter;

public class ActivityActivity extends BuddyRooActivity {
	private TextView tvdesciption, tvtitle;
	private HorizontialListView lvgallery;
	private Button btactivity;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		tvdesciption = (TextView) findViewById(R.id.tvdesciption);
		tvtitle = (TextView) findViewById(R.id.tvnameapp);
		btactivity = (Button) findViewById(R.id.btactivity);
		btactivity.setBackgroundResource(R.drawable.button_selected);
		Typeface font = Typeface.createFromAsset(this.getAssets(),
				"Lobster.otf");
		tvtitle.setTypeface(font);
		lvgallery = (HorizontialListView) findViewById(R.id.lvgallery);
		init();
	}

	private void init() {
		tvdesciption
				.setText("Lorem ipsim dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		int[] gallery = new int[10];
		for (int i = 0; i < gallery.length; i++) {
			gallery[i] = R.drawable.activity_gal1;
		}
		GalleryAdapter adapter = new GalleryAdapter(getBaseContext(), gallery);
		lvgallery.setAdapter(adapter);
	}
}