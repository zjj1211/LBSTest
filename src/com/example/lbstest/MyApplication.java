package com.example.lbstest;

import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

import com.baidu.location.service.LocationService;;

public class MyApplication extends Application{

	public LocationService locationService;
	public Vibrator mVibrator;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		locationService = new LocationService(getApplicationContext());
		mVibrator = (Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
	}
}
