package com.example.examen_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val saltar: Intent = Intent(this, ventana2::class.java)
            startActivity(saltar)
        }
       /*button2.setOnClickListener {
            val saltar2 : Intent = Intent(this, ventana4::class.java)
            startActivity(saltar2)
        }
        button3.setOnClickListener {
            val saltar3 : Intent = Intent(this, ventana4::class.java)
            startActivity(saltar3)
        }
    */
    }

}