package com.example.androide.citycleaner;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng latlang;
        latlang = new LatLng(24.8944128, 91.846422);
        mMap.addMarker(new MarkerOptions().position(latlang).title("BaghBari"));

        latlang = new LatLng(24.9066299, 91.8562281);
        mMap.addMarker(new MarkerOptions().position(latlang).title("SubidBazar"));

        latlang = new LatLng(24.9055181, 91.8573868);
        mMap.addMarker(new MarkerOptions().position(latlang).title("Blue Bird School"));

        latlang = new LatLng(24.9068586, 91.8393356);
        mMap.addMarker(new MarkerOptions().position(latlang).title("Nehari Para"));

        latlang = new LatLng(24.9138799, 91.834714);
        mMap.addMarker(new MarkerOptions().position(latlang).title("SUST"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlang,14));
    }
}
