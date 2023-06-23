package com.example.nesnetabanliprogramlama2

fun main() {
    val adres = Adres("Bursa","Osmangazi")

    val kisi = Kisiler2("Ahmet",18, adres)

    println("Kisi ad : ${kisi.ad}")
    println("Kisi yas : ${kisi.yas}")
    println("Kisi il :  ${kisi.adres.il}")
    println("Kisi ilce  : ${kisi.adres.ilce}")
}