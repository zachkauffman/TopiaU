package com.appdesigncentral.activity;

import java.util.ArrayList;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.appdesigncentral.activity.R;
import com.appdesigncentral.adapter.PhotoAdapter;
import com.appdesigncentral.bean.Photo;

public class PhotosActivity extends BuddyRooActivity {
	private ListView lvdata;
	private Button btphoto;
	private TextView tvtitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photos);
		lvdata = (ListView) findViewById(R.id.lvdata);
		btphoto = (Button) findViewById(R.id.btphoto);
		btphoto.setBackgroundResource(R.drawable.button_selected);
		tvtitle = (TextView) findViewById(R.id.tvnameapp);
		Typeface font = Typeface.createFromAsset(this.getAssets(),
				"Lobster.otf");
		tvtitle.setTypeface(font);
		init();
		lvdata.setDivider(null);
		lvdata.setDividerHeight(0);
	}

	private void init() {
		Photo p1 = new Photo(R.drawable.data1, R.drawable.data2,
				R.drawable.data3, R.drawable.data4);
		Photo p2 = new Photo(R.drawable.data5, R.drawable.data6,
				R.drawable.data7, R.drawable.data8);
		Photo p3 = new Photo(R.drawable.data9, R.drawable.data10,
				R.drawable.data11, R.drawable.data12);
		Photo p4 = new Photo(R.drawable.data1, R.drawable.data2,
				R.drawable.data3, R.drawable.data4);
		Photo p5 = new Photo(R.drawable.data5, R.drawable.data6,
				R.drawable.data7, R.drawable.data8);
		Photo p6 = new Photo(R.drawable.data9, R.drawable.data10,
				R.drawable.data11, R.drawable.data12);
		ArrayList<Photo> list = new ArrayList<Photo>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		PhotoAdapter adapter = new PhotoAdapter(getBaseContext(), list);
		lvdata.setAdapter(adapter);
		lvdata.setDivider(null);
		lvdata.setDividerHeight(0);
	}
}
