package com.example.lovecoffee;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapViewActivity extends Activity {

	static final LatLng LONDON = new LatLng(51.512198,-0.056413);
	static final LatLng TEDDINGTON = new LatLng(51.426066, -0.332855);
	static final LatLng HACKNEYROAD = new LatLng(51.531894, -0.060707);
	
	// 51.531894,-0.060707 Treadway st, Hackney road
	// 51.426066,-0.332855 Station Rd, Teddington
	// 51.512198,-0.056413 LONDON Kelday Heights

	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_view);
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		
		Marker london = map.addMarker(new MarkerOptions()
				.position(LONDON)
				.title("Kelday Heights")
				.snippet("The HEART of the world :P")
				.icon(BitmapDescriptorFactory
				.fromResource(R.drawable.we)));
		
		Marker teddington = map.addMarker(new MarkerOptions()
				.position(TEDDINGTON)
				.title("Teddington")
				.snippet("Teddington is cool")
				.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.me)));
		
		Marker hackneyRoad = map.addMarker(new MarkerOptions()
				.position(HACKNEYROAD)
				.title("Hacney Road")
				.snippet("My babies place :P")
				.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.baby)));

		// Move the camera instantly to London with a zoom of 15.
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(LONDON, 15));
		
		// Zoom in, animating the camera.
		map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
		
		
	}

	/*public void onSetHome(View v) {
		startActivity(new Intent(MapViewActivity.this, WelcomeActivity.class));
	}

	public void onSetAboutUs(View v) {
		startActivity(new Intent(MapViewActivity.this, WelcomeActivity.class));
	}

	public void onSetMap(View v) {
		Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
	}

	// Search Button Click
	public void onSearch(View v) {
		onSearchRequested();
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.love_coffee, menu);
		return true;
	}
}
