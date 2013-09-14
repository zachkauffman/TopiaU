package com.appdesigncentral.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.appdesigncentral.activity.R;

public class BuddyRooActivity extends Activity {
	AlertDialog.Builder dialog;

	public void onClick(View v) {
		if (v.getId() == R.id.btactivity) {
			Intent it = new Intent(getBaseContext(), ActivityActivity.class);
			startActivity(it);
			finish();
		} else if (v.getId() == R.id.btphoto) {
			Intent it = new Intent(getBaseContext(), PhotosActivity.class);
			startActivity(it);
			finish();
		} else if (v.getId() == R.id.btelement) {
			Intent it = new Intent(getBaseContext(), ElementsActivity.class);
			startActivity(it);
			finish();
		} else if (v.getId() == R.id.btsetting) {
			Toast.makeText(getBaseContext(), "Setting", 1).show();
		} else if (v.getId() == R.id.btprofile) {
			Intent it = new Intent(getBaseContext(), ProfileActivity.class);
			startActivity(it);
			finish();
		} else
			Toast.makeText(getBaseContext(), "Login", 1).show();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
			show();
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}

	public void show() {
		dialog = new AlertDialog.Builder(this);
		dialog.setTitle("BuddyRoo");
		dialog.setMessage("Are you sure exit ?");
		dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});
		dialog.setNeutralButton("No", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
			}
		});
		dialog.setIcon(R.drawable.ic_launcher);
		dialog.show();
	}
}
