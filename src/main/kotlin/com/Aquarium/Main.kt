package com.Aquarium

fun main(){
buildAquarium()
}

fun buildAquarium() {
    val myAquarium= Aquarium()
    println("length is ${myAquarium.length} width is ${myAquarium.width} height is ${myAquarium.height}")
    myAquarium.length=90
    myAquarium.width=60
    println(" updated length is ${myAquarium.length} width is ${myAquarium.width} height is ${myAquarium.height}")
}
