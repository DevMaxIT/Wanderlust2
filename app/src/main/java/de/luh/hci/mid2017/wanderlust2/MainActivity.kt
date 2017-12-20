package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener({
                val intent = Intent(this@MainActivity, SelectRootActivity::class.java)
                startActivity(intent)

            })



    }
}
