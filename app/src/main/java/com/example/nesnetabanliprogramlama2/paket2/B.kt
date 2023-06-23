package com.example.nesnetabanliprogramlama2.paket2

import com.example.nesnetabanliprogramlama2.paket1.A

class B : A() {
    override fun fonksiyon() {

        println(varsayilanDegisken)
        println(publicDegisken)
        //println(privateDegisken) //erisilemez
        println(internalDegisken)
        println(protectedDegisken)
    }
}