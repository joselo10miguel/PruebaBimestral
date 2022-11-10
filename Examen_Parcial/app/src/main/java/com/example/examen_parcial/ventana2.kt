package com.example.examen_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_ventana2.*

class ventana2 : AppCompatActivity() {

    private var seleccion: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        button4.setOnClickListener {
        //peso
        var  Peso:String= t_peso.text.toString()
        var  peso = Integer.parseInt(Peso)
        //altura
        var  Altura:String= t_altura.text.toString()
        var  altura = Integer.parseInt(Altura)
        // base
        var  Base:String=t_base.text.toString()
        var  base = Integer.parseInt(Base)
         // nombre
        var nombre:String=t_nombre.text.toString()

        // Envio de variables



            val generos:Spinner = findViewById(R.id.spinner1)
            val razas:Spinner= findViewById(R.id.spinner2)
            val tipocalculo:Spinner = findViewById(R.id.spinner3)
            val listageneros = arrayOf("Genero", "Macho", "Hembra")
            val listarazas = arrayOf("Raza", "Mini toy", "Pequeña", "Mediana", "Grande", "Gigante")
            val listacalculo = arrayOf("Tipo calculo", "Calculo Hembra", "Calculo Macho")

        var adaptor1: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listageneros)
        generos?.adapter=adaptor1

        var adaptor2: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listarazas)
        razas?.adapter=adaptor2

        var adaptor3: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listacalculo)
        tipocalculo?.adapter=adaptor3
            val saltar: Intent = Intent(this, ventana3::class.java)
            saltar.putExtra("peso", peso)
            saltar.putExtra("altura", altura)
            saltar.putExtra("base",base)
            saltar.putExtra("nombre",nombre)

            startActivity(saltar)
        }
    }
}


