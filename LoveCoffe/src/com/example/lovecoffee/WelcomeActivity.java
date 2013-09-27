package com.example.lovecoffee;

import com.example.lovecoffee.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.love_coffee);
		
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		actionBar.show();
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.love_coffee, menu);
		createMenu(menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		return menuChoice(item);
	}
	
	private boolean menuChoice(MenuItem item) {
	
		switch (item.getItemId()) {
			case 0:
				Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
				return true;
			case 1:
				Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_LONG).show();
				return true;
			case 2:
				Toast.makeText(this, "You clicked on Item 3", Toast.LENGTH_LONG).show();
				return true;
			case 3:
				Toast.makeText(this, "You clicked on Item 4", Toast.LENGTH_LONG).show();
				return true;
			case 4:
				Toast.makeText(this, "You clicked on Item 5", Toast.LENGTH_LONG).show();
				return true;
		}
		return false;
	}
	
	private void createMenu(Menu menu) {
	
		MenuItem mnu1 = menu.add(0, 0, 0, "Item 1");
		{
			mnu1.setIcon(R.drawable.ic_action_search);
			mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
		MenuItem mnu2 = menu.add(0, 1, 1, "Item 2");
		{
			mnu2.setIcon(R.drawable.ic_action_refresh);
			mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
		MenuItem mnu3 = menu.add(0, 2, 2, "Item 3");
		{
			mnu3.setIcon(R.drawable.logo);
			mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
		MenuItem mnu4 = menu.add(0, 3, 3, "Item 4");
		{
			mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
		MenuItem mnu5 = menu.add(0, 4, 4, "Item 5");
		{
			mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}
	}
	
	public void onSetMap(View v){
		startActivity(new Intent(WelcomeActivity.this, MapViewActivity.class));
	}
}
