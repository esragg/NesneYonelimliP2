package com.example.nesnetabanliprogramlama2.odev

fun main() {

    val ogretmen:Personel = Ogretmen()
    val isci:Personel = Isci()

    val mudur = Mudur()
    mudur.terfiEttir(ogretmen)
    mudur.terfiEttir(isci)
}