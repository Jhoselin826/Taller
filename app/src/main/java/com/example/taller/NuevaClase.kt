package com.example.taller

class NuevaClase (val traccion: Array<traction>,val motor: String, val tipo: String, val capacidad:String) {
    enum class traction{
        Delantera,
        Trasera
    }
    fun vehiculo(){
        for(traction in traccion){
            println("La tracción del vehiculo es: "+traction)
        }
    }
}