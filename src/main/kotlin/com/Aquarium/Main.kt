package com.Aquarium

fun main(){
//buildAquarium()
    fishExample()
    makeFishDefault()
}

fun buildAquarium() {
    //first default constructor
    val myAquarium= Aquarium()
    println("length is ${myAquarium.length} width is ${myAquarium.width} height is ${myAquarium.height}")
    myAquarium.length=90
    myAquarium.width=60
  /*  println(" updated length is ${myAquarium.length} width is ${myAquarium.width} height is ${myAquarium.height}")

println(" volume for aquarium  ${myAquarium.volume} liters")
    val smallAquarium= Aquarium(length =20, width = 15, height = 30 )

    println(" small aquarium volume  ${smallAquarium.volume} liters")
    println(" small aquarium length is ${smallAquarium.length} width is ${smallAquarium.width} height is ${smallAquarium.height}")
*/
    val aquarium2= Aquarium(numberOfFish = 9 )

    println("  aquarium2 volume  ${aquarium2.volume} liters")
    println("  aquarium 2length is ${aquarium2.length} width is ${aquarium2.width} height is ${aquarium2.height}")




}

