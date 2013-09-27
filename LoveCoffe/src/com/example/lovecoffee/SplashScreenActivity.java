package com.example.lovecoffee;

import com.example.lovecoffee.R;
import com.google.android.maps.MapActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class SplashScreenActivity extends Activity {

	/** Progress bar - shown when database updates are being made */
	private ProgressBar 			updateDbBar_;
	
	/** Splash screen loading time in milliseconds*/
	private static final int SPLASH_TIME = 4000;
	
	/**
	 * onCreate
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Set the default view 
		setContentView( R.layout.splash_screen );

		ActionBar actionBar = getActionBar();
		actionBar.hide();
		
		// Bind the progress bar
		updateDbBar_ = (ProgressBar) this.findViewById(R.id.updateDbBar);
		updateDbBar_.setIndeterminate(true);

		// Set up a callback to let me know when the Splash screen could be dismissed
		new Handler().postDelayed(new Runnable() {
			public void run() {
				splashScreenTimedOut();
			}
		}, SPLASH_TIME);
	}
	
	/**
	 * Callback to dismiss Splash Screen and move to next screen
	 */
	private void splashScreenTimedOut( ) {
		
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Now transition
		startActivity(new Intent(this, WelcomeActivity.class));
		//startActivity(new Intent(this, MapActivity.class));
		finish();

	}
}
