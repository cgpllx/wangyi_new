package com.kubeiwu.wangyi.service;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Localservice extends Service {
	DownloadManager manager;
	long downId;

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@SuppressLint("InlinedApi")
	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return Service.START_STICKY;
	}



}
