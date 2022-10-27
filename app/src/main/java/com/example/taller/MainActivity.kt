package com.example.taller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.System.console


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //edad()
        multiplicar()
        //listado()
        //propietario()
        //iva()
        //validador()
    }
    //Validar si una persona es mayor o menor de edad
    fun edad(){
        val edad1 = "8"
        val edad2 = "20"

        if(edad2 >= "18"){
            println("Usted es mayor de edad")
        }else
            println("Usted es menor de edad")
    }

    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    fun multiplicar(){
        val n = "8"
        for (i in 1..10 step 2){

        }
    }

    //Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por
    //proyectos (Mostrar los resultados ordenados).
    fun listado(){
        val estudiante1 ="Erik Alvarado"
        val estudiante2 ="Miguel Caraguay"
        val estudiante3 ="Anthony Espinoza"
        val estudiante4 ="Jhoselin Guachizaca"
        val estudiante5 =""
        val estudiante6 =""
        val estudiante7 =""
        val estudiante8 =""

    }

    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor,
    // tipo de vehículo, capacidad
    fun propietario(){

    }

    //Algoritomo de cálculo de IVA 12%
    fun iva(){
        var precio = "15"
        if (precio > "100"){
            precio += (precio * "0.15")
        }
        print("El precio total es:" +precio)
    }

    //Validación de la cedula
    fun validador(){
        val suma = 0
    }

}