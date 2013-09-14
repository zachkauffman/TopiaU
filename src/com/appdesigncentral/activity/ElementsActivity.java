package com.appdesigncentral.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ElementsActivity extends BuddyRooActivity {
	private ProgressBar pb;
	private TextView tvstatus, tvtitle;
	private int progressBarStatus = 0;
	private Handler progressBarHandler = new Handler();
	private Button btprofile, btelement;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.elements);
		pb = (ProgressBar) findViewById(R.id.pb);
		tvstatus = (TextView) findViewById(R.id.tvstatus);
		tvtitle = (TextView) findViewById(R.id.tvnameapp);
		btelement = (Button) findViewById(R.id.btelement);
		btprofile = (Button) findViewById(R.id.btprofile);
		btelement.setBackgroundResource(R.drawable.button_selected);
		btprofile.setBackgroundResource(R.drawable.button_profile_drop);
		Typeface font = Typeface.createFromAsset(this.getAssets(),
				"Lobster.otf");
		tvtitle.setTypeface(font);
		run();
	}

	private void run() {
		new Thread(new Runnable() {
			public void run() {
				while (progressBarStatus < 100) {
					progressBarStatus++;
					// your computer is too fast, sleep 1 second
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					// Update the progress bar
					progressBarHandler.post(new Runnable() {
						public void run() {
							pb.setProgress(progressBarStatus);
							tvstatus.setText(progressBarStatus + "%");
						}
					});
				}
			}
		}).start();

	}
}
