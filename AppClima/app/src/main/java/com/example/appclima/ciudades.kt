package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ciudades : AppCompatActivity() {

    //Para pasar datos a la hora de apretar un BOTON
    //esta constante TAG nos va a permitir recoger la informacion
    val TAG = "CIUDAD" //el nombre que le ponemos es para hacer referencia en otra clase y llamarlo
    //Ahora tenemos que decirle que al hacer click en tal boton, le vamos a mandar una informacion al TAG

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        //vamos a crear un Intent que al hacerle click a un boton me mande a otro pantalla
        //Creamos las variables para los 2 botones que tenemos
        val bMendoza = findViewById<Button>(R.id.button)
        val bSanluis = findViewById<Button>(R.id.button2)

        //Luego le decimos que al hacer click en el boton vaya a otra pantalla
        bMendoza.setOnClickListener(View.OnClickListener {
            //Con this le decimos de donde partimos, y el MainActivity es a donde queremos ir
            val pasarPantalla = Intent(this, MainActivity::class.java)
            pasarPantalla.putExtra(TAG, "ciudad-mendoza")
            //Ahora corremos la variable de pasar la pantalla.
            startActivity(pasarPantalla)
        })

        //Luego le decimos que al hacer click en el boton vaya a otra pantalla
        bSanluis.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-sanluis")
            startActivity(intent)
        })
    }
}