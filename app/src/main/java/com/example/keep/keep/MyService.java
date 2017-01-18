package com.example.keep.keep;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        ScreenListener screenListener = new ScreenListener(this);
        screenListener.begin(listener);//开始监听screen状态
    }

    /**
     * ScreenListener.ScreenStateListener监听接口方法实现
     */
    private ScreenListener.ScreenStateListener listener = new ScreenListener.ScreenStateListener() {
        @Override
        public void onScreenOn() {
            //开屏---finish这个一个像素的Activity
            KeepLiveActivityManager.getInstance(MyService.this).finishKeepLiveActivity();
        }

        @Override
        public void onScreenOff() {
            //锁屏---启动一个像素的Activity
            KeepLiveActivityManager.getInstance(MyService.this).startKeepLiveActivity();

            //startActivity(intent);
        }

        @Override
        public void onUserPresent() {

        }
    };
}
