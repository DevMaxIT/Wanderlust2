package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val buttonEditPath = findViewById<Button>(R.id.button3)
        buttonEditPath.setOnClickListener({
            val intent = Intent(this@MapActivity, SelectPathActivity::class.java)
            startActivity(intent)

        })
    }
}
