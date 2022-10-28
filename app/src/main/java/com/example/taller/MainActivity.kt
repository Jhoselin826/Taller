package com.example.taller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edad()
        multiplicar()
        listado()
        propietario()
        iva()
        validador()
    }
    //Validar si una persona es mayor o menor de edad
    fun edad(){
        val edad = 18
        val edad2=3
        // < > <= >= != ==

        if (edad < 18){
            println("Ud es menor de edad")
        }else{
            println ("Ud es mayor de edad")
        }

        if (edad2 < 18){
            println("Ud es menor de edad")
        }else{
            println ("Ud es mayor de edad")
        }
    }

    //Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    fun multiplicar(){
        val n = 8
        println("Ascendente")
        for (i in 1..10){
            val resultado = n * i
            println(resultado)
        }
        println("Descendente")
        for (i in 10 downTo 0){
            val resultado2 = n * i
            println(resultado2)
        }
    }

    //Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por
    //proyectos (Mostrar los resultados ordenados).
    fun listado(){
        val lista = listOf<String>("Joselo Ordoñez", "Daniela Espinoza", "David Jimenez","Karina Nuñez")
        val ordenar = lista.sorted()
        println("Lista de Estudiantes")
        for (lista in ordenar){
            println(lista)
        }

        val grupo = mutableMapOf("Joselo Ordoñez" to "Computacion", "Daniela Espinoza" to "Finanzas",
            "David Jimenez" to "Ingenieria Industrial","Karina Nuñez" to "Medicina")

        val ordenGrupo = grupo.toSortedMap()
        println("Listado de estudiantes por Proyecto")
        for (x in ordenGrupo){
            println("${x.key} - ${x.value}")
        }

    }

    //Presentar las propiedades de un vehículo utilizando clases, como tracción, motor,
    // tipo de vehículo, capacidad
    fun propietario(){
        val carro = NuevaClase(arrayOf(NuevaClase.traction.Delantera),motor = "V8",
        tipo = "Motorizado", capacidad= "4 personas")
        carro.vehiculo()
        println(carro.motor)
        println(carro.tipo)
        println(carro.capacidad)
    }

    //Algoritomo de cálculo de IVA 12%
    fun iva(){
        val precio = 10
        val iva = precio * 0.12
        val total = precio * iva
        println("El precio total es:" +total)
    }

    //Validación de la cedula
    fun validador(){
        val id = arrayListOf<Int>(1,1,0,5,0,2,0,5,7,0)
        var total =0
        var contador=0
        val numeroF = id.last()
        for(i in id.indices){
            contador=id[i]
            if(i%2==0){
                contador=(id[i]*2)
                if (contador>9){
                    contador = contador-9
                }
                total = total+contador
            }else{
                total = total+contador
            }
        }
        total = total - numeroF
        val primerNumero = total.toString().substring(0,1)
        val decena = (primerNumero.toInt()+1)*10
        if (decena-total==numeroF||decena-total==10){
            println("Cedula -/ $id -/ valida.")
        }else{
            println("Cedula -/ $id -/ no valida.")
        }

    }

}