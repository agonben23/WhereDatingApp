package com.example.wheredatingapp.model

import com.example.wheredatingapp.Punto


data class Ciudad(val nombre: String = "",val provincia : String = "", val tier : Int = 5, val latitud : Double = 0.0, val longitud : Double = 0.0) {


fun punto() : Punto{
    return Punto(latitud,longitud)
}

}