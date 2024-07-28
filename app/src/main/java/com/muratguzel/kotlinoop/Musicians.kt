package com.muratguzel.kotlinoop

open class Musicians(name :String, instrument :String, age :Int) {

    //property

    //Encapsulation
    var name: String? = name
        private set
        get

    private var instrument: String? = instrument
    var age : Int? = age
        private set
        get
    private val bandName : String = "Metalica"
    fun returnBandName(password: String) :String {
        if(password == "Atıl") {
            return bandName
    } else {
        return "wrong password!"
    }

    }

    //inheritance


}