package com.lit.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ImageView;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);

		setTitle("HolidayMaster");

		ImageView image1 = (ImageView) findViewById(R.id.image1);
		Handler hdl = new Handler();
		hdl.postDelayed(new splashHandler(), 1500);
		image1.setImageResource(R.drawable.splash_1);

	}

	class splashHandler implements Runnable {
		public void run() {
			Intent intent1 = new Intent(getApplication(),
					MainMainActivity.class);
			startActivity(intent1);
		}
	}
}
