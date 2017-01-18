package com.example.keep.keep;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

public class KeepLiveActivity extends Activity {

	private static final String TAG = "ricky";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		Log.i(TAG, "KeepLiveActivity----onCreate!!!");

		//显示窗体
		Window window = getWindow();
		window.setGravity(Gravity.LEFT|Gravity.TOP);
		LayoutParams params = window.getAttributes();
		params.height = 1;
		params.width = 1;
		params.x = 0;
		params.y = 0;
		window.setAttributes(params);
		
		KeepLiveActivityManager.getInstance(this).setKeepLiveActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "KeepLiveActivity----onDestroy!!!");
	}
	
}
