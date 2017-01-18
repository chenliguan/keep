package com.example.keep.keep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.keep.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = new Intent(this, MyService.class);
		startService(intent);//开启服务
	}
	
	public void jump(View v){
		Intent intent = new Intent(this, KeepLiveActivity.class);
		startActivity(intent);//跳转
		finish();
	}

}
