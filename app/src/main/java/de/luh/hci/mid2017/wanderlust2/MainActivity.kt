package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback


class MainActivity : FragmentActivity(), OnMapReadyCallback, GoogleMap.OnMapClickListener {
    private lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener({
                val intent = Intent(this@MainActivity, SelectRootActivity::class.java)
                startActivity(intent)

            })

        val mapFragment = fragmentManager
                .findFragmentById(R.id.map) as MapFragment
        mapFragment.getMapAsync(this)



    }

    override fun onMapReady(map: GoogleMap) {
        mMap = map
        val han = LatLng(52.4, 9.7)
        //mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(han))
        mMap.setOnMapClickListener(this)
    }

    override fun onMapClick(pos:LatLng){

        val markerOptions = MarkerOptions()

        // Setting the position for the marker
        markerOptions.position(pos)

        // Setting the title for the marker.
        // This will be displayed on taping the marker
        markerOptions.title("Zielpunkt")

        // Clears the previously touched position
        mMap.clear()

        // Animating to the touched position
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pos))

        // Placing a marker on the touched position
        mMap.addMarker(markerOptions)


    }
}
