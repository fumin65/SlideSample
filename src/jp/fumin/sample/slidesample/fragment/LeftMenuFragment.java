package jp.fumin.sample.slidesample.fragment;

import java.util.ArrayList;

import jp.fumin.sample.slidesample.R;
import jp.fumin.sample.slidesample.adapter.LeftMenuAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * ç∂ÇÃÉÅÉjÉÖÅ[
 * 
 * @author abemasafumi
 *
 */
public class LeftMenuFragment extends Fragment {
	
	private static final String TAG = "LeftMenuFragment";
	
	private ListView listView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View contentView = inflater.inflate(R.layout.left_menu_fragment, container, false);
		
		listView = (ListView) contentView.findViewById(R.id.listview);
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 40; i++) {
			list.add("Left " + (i + 1));
		}
		
		ArrayAdapter<String> adapter = 
				new LeftMenuAdapter(getActivity(), R.layout.left_menu_row, list);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) 
			{
				Log.i(TAG, "clicked");
			}
		});
		
		return contentView;
	}
	
	
}
