package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.GridView
import android.widget.Toast

class SelectPathActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_path)
        //setSupportActionBar(toolbar)

        val gridview = findViewById<View>(R.id.gridview) as GridView
        gridview.adapter = ImageAdapter(this)

        val button = findViewById<Button>(R.id.button10)
        button.setOnClickListener({
            val intent = Intent(this@SelectPathActivity, MapActivity::class.java)
            startActivity(intent)

        })
    }

}
