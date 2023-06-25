package com.example.nesnetabanliprogramlama2.override

import com.example.nesnetabanliprogramlama2.override.Hayvan
import com.example.nesnetabanliprogramlama2.override.Kedi
import com.example.nesnetabanliprogramlama2.override.Kopek
import com.example.nesnetabanliprogramlama2.override.Memeli

fun main() {

    val hayvan = Hayvan()
    hayvan.sesCikar()

    val memeli = Memeli()
    memeli.sesCikar()

    val kedi = Kedi()
    kedi.sesCikar()

    val kopek = Kopek()
    kopek.sesCikar()
}