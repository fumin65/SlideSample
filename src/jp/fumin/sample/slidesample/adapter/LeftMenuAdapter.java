package jp.fumin.sample.slidesample.adapter;

import java.util.List;

import jp.fumin.sample.slidesample.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class LeftMenuAdapter extends ArrayAdapter<String> {
	
	private LayoutInflater inflayter;

	public LeftMenuAdapter(Context context, int textViewResourceId,
			List<String> objects) {
		super(context, textViewResourceId, objects);
		
		inflayter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View view = convertView;
		
		if (view == null) {
			view = inflayter.inflate(R.layout.left_menu_row, null);
		}
		
		TextView text = (TextView) view.findViewById(R.id.text);
		text.setText(getItem(position));
		
		return view;
	}
	
	

}
