package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Layout2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout2)

        val t1: TextView = findViewById(R.id.t2)
        val t2: TextView = findViewById(R.id.t1)

        val bun : Bundle? = intent.extras

        if (bun !== null){
            t1.text = bun.getString("nim")
            t2.text = bun.getString("nama")
        }





    }
}