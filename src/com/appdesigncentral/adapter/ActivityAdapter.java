package com.appdesigncentral.adapter;

import java.util.ArrayList;

import com.appdesigncentral.activity.R;
import com.appdesigncentral.bean.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityAdapter extends BaseAdapter {
	private ArrayList<Activity> list;
	private LayoutInflater mInflater;

	public ActivityAdapter(Context context, ArrayList<Activity> list) {
		this.list = list;
		this.mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.row_profile, null);
			holder = new ViewHolder();
			holder.ivavatar = (ImageView) convertView
					.findViewById(R.id.ivavatar);
			holder.ivpost = (ImageView) convertView.findViewById(R.id.ivposted);
			holder.tvname = (TextView) convertView.findViewById(R.id.tvname);
			holder.tvcomment = (TextView) convertView
					.findViewById(R.id.tvcomment);
			holder.tvtime = (TextView) convertView.findViewById(R.id.tvtime);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tvname.setText(list.get(position).getName());
		holder.tvcomment.setText(list.get(position).getComment());
		holder.tvtime.setText(list.get(position).getTime());
		if (position == 0 || position == 2)
			holder.ivpost.setVisibility(View.GONE);
		return convertView;
	}

	private static class ViewHolder {
		private ImageView ivavatar, ivpost;
		private TextView tvname, tvcomment, tvtime;
	}
}