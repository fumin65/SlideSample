package jp.fumin.sample.slidesample.fragment;

import jp.fumin.sample.slidesample.R;
import jp.fumin.slidemenu.SlideMenuActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View contentView = inflater.inflate(R.layout.main, container, false);

		ListView listView = (ListView) contentView.findViewById(R.id.listview);
		ArrayAdapter<String> adapter 
		= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);

		for (int i = 0; i < 20; i++) {
			adapter.add("Main " + (i + 1));
		}

		listView.setAdapter(adapter);

		View leftBtn  = contentView.findViewById(R.id.left_btn);
		View rightBtn = contentView.findViewById(R.id.right_btn);

		leftBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				((SlideMenuActivity) getActivity()).openLeftMenu();
			}
		});

		rightBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				((SlideMenuActivity) getActivity()).openRightMenu();
			}
		});


		return contentView;
	}

}
