package com.example.nesnetabanliprogramlama2.odev

class Mudur:Personel() {

    fun iseAl(p:Personel) {
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel) {
        if(p is Ogretmen) {
            p.maasArttir()
        }
        if(p is Isci) {
            println("Isciler terfi alamaz")
        }
    }
}