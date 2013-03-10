package jp.fumin.sample.slidesample;

import jp.fumin.sample.slidesample.fragment.LeftMenuFragment;
import jp.fumin.sample.slidesample.fragment.MainFragment;
import jp.fumin.slidemenu.SlideMenuActivity;
import android.os.Bundle;


public class MainActivity extends SlideMenuActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setLeftMenuFragment(new LeftMenuFragment());
		setMainFragment(new MainFragment());
		setCanOpenRight(false);
	}

}
