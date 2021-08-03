package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Creo las variables para los Txt del .xml
    var LosGrados:TextView? = null
    var LaCiudad:TextView? = null
    var ElClima:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ahora asociamos las variables creadas con los compenentes graficos
        LosGrados = findViewById(R.id.textView)
        LaCiudad = findViewById(R.id.textView2)
        ElClima = findViewById(R.id.textView3)


        //Aca llamo a esa constante con la palabra que le asignamos y la guardo en otra constante (ciudades.kt)
        val ciudad = intent.getStringExtra("CIUDAD")

        //esto ya no hace falta, era para saber que traica ciudad
        //Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()

        //De esta manera se crean objetos de la clase CIudadClase.kt
        val ciudadMdz = CiudadClase("Ciudad de Mendoza", 38, "Soleado")
        val ciudadSls = CiudadClase("Ciudad de San Luis", 22, "Nublado")

        //Creo las validaciones para correr el programa
        //Si ciudad (variable que trae el valor de la clase ciudades.kt al precionar un boton, es igual
        // a ciudad-mendoza va a hacer lo siguiente
        if(ciudad == "ciudad-mendoza"){

            //convierto los grados en String porque estaban en Int
            LosGrados?.text = ciudadMdz.grados.toString() + "°"
            LaCiudad?.text = ciudadMdz.nombre
            ElClima?.text = ciudadMdz.estatus

        }else if(ciudad == "ciudad-sanluis"){

            LosGrados?.text = ciudadSls.grados.toString() + "°"
            LaCiudad?.text = ciudadSls.nombre
            ElClima?.text = ciudadSls.estatus

        }else{
            Toast.makeText(this, "No se encuentra la provincia", Toast.LENGTH_SHORT).show()
        }

    }
}