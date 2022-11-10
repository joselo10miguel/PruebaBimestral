package com.example.examen_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ventana3.*

class ventana3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana3)
        val extras = intent.extras
        val peso = extras?.getInt("peso")?:""
        val altura = extras?.getInt("peso")?:""
        val base = extras?.getInt("peso")?:""
        val genero = extras?.getString("genero")?:"sin "
        val nombre = extras?.getString("nombre")?: "sin nombre"
        val raza = extras?.getString("raza")?: "sin "

        l_peso.setText( "El IMC de "+ nombre + " : ")
        pesoL.setText("El peso es de "+peso)
        button5.setOnClickListener {
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}