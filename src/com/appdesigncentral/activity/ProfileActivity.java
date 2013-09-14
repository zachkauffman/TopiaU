package com.appdesigncentral.activity;

import java.util.ArrayList;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.appdesigncentral.activity.R;
import com.appdesigncentral.adapter.ActivityAdapter;
import com.appdesigncentral.bean.Activity;

public class ProfileActivity extends BuddyRooActivity {
	private Button btprofile;
	private ListView lvdata;
	private ArrayList<Activity> list = new ArrayList<Activity>();
	private TextView tvtitle;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		lvdata = (ListView) findViewById(R.id.lvdata);
		tvtitle = (TextView) findViewById(R.id.tvnameapp);
		Typeface font = Typeface.createFromAsset(this.getAssets(),
				"Lobster.otf");
		tvtitle.setTypeface(font);

		btprofile = (Button) findViewById(R.id.btprofile);
		btprofile.setBackgroundResource(R.drawable.button_selected);
		init();
		ActivityAdapter adapter = new ActivityAdapter(getBaseContext(), list);
		lvdata.setAdapter(adapter);
	}

	public void init() {
		Activity activity1 = new Activity(
				1,
				1,
				"Emilly @ Caffe Bistro",
				"Lorem ipsum dolor sit amet, consectetur adipsisicing elit, sed do eiusmod",
				"3min ago");
		Activity activity2 = new Activity(
				1,
				1,
				"Remmy @ Eiffel Tower",
				"Lorem ipsum dolor sit amet, consectetur adipsisicing elit, sed do eiusmod",
				"5min ago");
		Activity activity3 = new Activity(
				1,
				1,
				"Virgil @ Bucharest",
				"Lorem ipsum dolor sit amet, consectetur adipsisicing elit, sed do eiusmod",
				"1 hour ago");
		list.add(activity1);
		list.add(activity2);
		list.add(activity3);
	}
}