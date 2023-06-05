package com.Aquarium

class Fish (val friendlyFish:Boolean =true,volumeNeeded:Int){
    val size:Int
    //crating secondary constructor
    init {
        //second
        println("first init block")
    }
    constructor():this(true,5){
        println("running secondary constructor")
    }
    init {
        println("last init block")
    }

    init {
        //first
        if (friendlyFish)
        {
            size=volumeNeeded
        }
        else{
            size=volumeNeeded*2
        }
    }
}
fun makeFishDefault()=Fish(true,50)
fun fishExample(){
    val fish=Fish(true,20)
    println(" in the fish friendly ${fish.friendlyFish} it needs volume ${fish.size}")
    val fish1=Fish(false,40)
    println(" in the fish1 friendly ${fish1.friendlyFish} it needs volume ${fish1.size}")


}