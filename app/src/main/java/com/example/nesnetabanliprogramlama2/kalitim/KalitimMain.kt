package com.example.nesnetabanliprogramlama2.kalitim

import com.example.nesnetabanliprogramlama2.kalitim.Araba
import com.example.nesnetabanliprogramlama2.kalitim.Nissan

fun main() {
    val araba = Araba("Kirmizi","otomatik","sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    val nissan = Nissan("Beyaz","manuel","sedan","micra")

    println(nissan.model)
    println(nissan.renk)
    println(nissan.kasaTipi)
}
