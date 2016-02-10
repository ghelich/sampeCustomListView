package com.example.samplecustomlist.adapter;


import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.samplecustomlist.R;
import com.example.samplecustomlist.model.Titel;

public class CustomListAdapter extends BaseAdapter {
	private Activity activity;
	private LayoutInflater inflater;
	private List<Titel> Items;

	public CustomListAdapter(Activity activity, List<Titel> titel) {
		this.activity = activity;
		this.Items = titel;
	}

	@Override
	public int getCount() {
		return Items.size();
	}

	@Override
	public Object getItem(int location) {
		return Items.get(location);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (inflater == null)
			inflater = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null)
			convertView = inflater.inflate(R.layout.list_row, null);


		TextView title = (TextView) convertView.findViewById(R.id.title);

		Titel m = Items.get(position);

		title.setText(m.getName());
		
		return convertView;
	}

}