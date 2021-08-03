package com.example.appclima

//Creo una clase haciando click a la carpeta, new, kotlin class, class y nombre

class CiudadClase(nombre:String, grados:Int, estatus:String) {

    //creo las variables (atributos)
    var nombre:String = ""
    var grados:Int = 0
    var estatus:String = ""

    //esto seria el constructor
    init {

        this.nombre = nombre
        this.grados = grados
        this.estatus = estatus
    }
}