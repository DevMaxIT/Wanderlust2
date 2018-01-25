package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory
import android.text.method.TextKeyListener.clear
import com.google.android.gms.maps.GoogleMap.OnMapClickListener
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.GoogleMap


/*class MapActivity : FragmentActivity(), OnMapReadyCallback*/
class MapActivity: AppCompatActivity() {

    //private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val buttonEditPath = findViewById<Button>(R.id.button3)
        buttonEditPath.setOnClickListener({
            val intent = Intent(this@MapActivity, SelectPathActivity::class.java)
            startActivity(intent)
        })
        val buttonstartRoute = findViewById<Button>(R.id.button2)
         buttonstartRoute.setOnClickListener({
             Toast.makeText(this, "Navigation wird auf der Uhr gestartet.",
                     Toast.LENGTH_SHORT).show()
         })/*
         val mapFragment = fragmentManager
                 .findFragmentById(R.id.map) as MapFragment
         mapFragment.getMapAsync(this)*/
    }

    /*override fun onMapReady(map: GoogleMap) {
        mMap = map
        val han = LatLng(52.4, 9.7)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(han, 15F))
        }*/
}

