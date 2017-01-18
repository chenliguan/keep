package com.example.keep.keeplive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.keep.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		startService(new Intent(this, LocalService.class));
		startService(new Intent(this, RemoteService.class));//双进程守护

		//JobScheduler来执行一些需要满足特定条件但不紧急的后台任务，APP利用JobScheduler来执行这些特殊的后台任务时来减少电量的消耗。
		startService(new Intent(this, JobHandleService.class));//JobService启动LocalService和RemoteService
	}
}
