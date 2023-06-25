package com.example.nesnetabanliprogramlama2.interface2

open class Elma : Squeezable, Eatable {

    override fun howToEat() {
        println("Dilimle ve ye")
    }

    override fun howToSqueeze() {
        println("Blendir ile sik")
    }
}