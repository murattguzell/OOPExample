package com.muratguzel.kotlinoop

class SuperMusician(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {
    fun sign(){
        println("nothing else matters")
    }
}