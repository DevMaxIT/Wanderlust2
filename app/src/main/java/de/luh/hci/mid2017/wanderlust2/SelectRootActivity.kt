package de.luh.hci.mid2017.wanderlust2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_select_root.*

class SelectRootActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_root)
        setSupportActionBar(toolbar)


        val buttonCard1 = findViewById<Button>(R.id.button40)
        buttonCard1.setOnClickListener({
            val intent = Intent(this@SelectRootActivity, MapActivity::class.java)
            startActivity(intent)

        })

        val buttonCard2 = findViewById<Button>(R.id.button43)
        buttonCard2.setOnClickListener({
            val intent = Intent(this@SelectRootActivity, MapActivity::class.java)
            startActivity(intent)

        })


        val buttonCard3 = findViewById<Button>(R.id.button4)
        buttonCard3.setOnClickListener({
            val intent = Intent(this@SelectRootActivity, MapActivity::class.java)
            startActivity(intent)

        })

        val buttonCardOwnRoute = findViewById<Button>(R.id.buttonOwnRoute)
        buttonCardOwnRoute.setOnClickListener({
            val intent = Intent(this@SelectRootActivity, SelectPathActivity::class.java)
            startActivity(intent)

        })


    }

}
