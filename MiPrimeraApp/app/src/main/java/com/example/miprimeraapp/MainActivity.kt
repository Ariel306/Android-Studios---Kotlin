package com.example.miprimeraapp

import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //probando algo de la red
        val connectivityManager = getSystemService(ConnectivityManager::class.java)
        val currentNetwork = connectivityManager.getActiveNetwork()
        val caps = connectivityManager.getNetworkCapabilities(currentNetwork)
        val linkProperties = connectivityManager.getLinkProperties(currentNetwork)


        //Toast.makeText(this, "Red, $currentNetwork",Toast.LENGTH_LONG).show()
        //Toast.makeText(this, "Red2, $caps",Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Red3, $linkProperties",Toast.LENGTH_LONG).show()





        //creo una variable donde le asigno el button
        val saludar = findViewById<Button>(R.id.button)

        //creo una valiable donde guardo el nombre
        val mNombre = findViewById<EditText>(R.id.editText1)

        //creo una valiable donde guardo el checkbox
        val check1 = findViewById<CheckBox>(R.id.checkBox)
        val check2 = findViewById<CheckBox>(R.id.checkBox2)

        //luego le digo que al hacerle click va a realizar la siguiente accion
        saludar.setOnClickListener(View.OnClickListener {

            if(validaDatos()){
                if(check1.isChecked){
                    //solo hay que poner this,"Hola",Toast.LENGTH_LONG lo demas se pone solo
                    Toast.makeText(this,"Hola, " + mNombre.text + ", podes pasar al local",Toast.LENGTH_LONG).show()
                }else{
                    if(check2.isChecked){
                        //solo hay que poner this,"Hola",Toast.LENGTH_LONG lo demas se pone solo
                        Toast.makeText(this,"Hola, " + mNombre.text + ", no podes pasar al local",Toast.LENGTH_LONG).show()
                    }else{
                        //solo hay que poner this,"Hola",Toast.LENGTH_LONG lo demas se pone solo
                        Toast.makeText(this,"Hola, " + mNombre.text + ", selecciona una opcion para pasar al local",Toast.LENGTH_LONG).show()
                    }
                }



            }else{
                //solo hay que poner this,"Hola",Toast.LENGTH_LONG lo demas se pone solo
                Toast.makeText(this,"Escribe tu nombre para entrar al local ",Toast.LENGTH_LONG).show()
            }

        })
    }

    //esto va a validar si el campo donde se coloca el nombre tiene un nombre escrito o no
    fun validaDatos(): Boolean{
        val nombre = findViewById<EditText>(R.id.editText1)
        val nombreUsuario = nombre.text

        if(nombreUsuario.isNullOrEmpty()){
            return false
        }
        return true
    }
}