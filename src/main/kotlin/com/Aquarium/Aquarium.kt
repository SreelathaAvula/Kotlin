package com.Aquarium

class Aquarium(var length:Int=2,
               var width :Int=40,
               var height:Int=20)
{
    var volume:Int
        get() =length*width*height/100
        set(value){ length=23 }
    //different constructor for setting values to it and starts with name constructor
var waterInTank=volume*0.9

constructor(numberOfFish:Int): this(){
    val waterInTank :Int=numberOfFish*2000
    val tank:Double=waterInTank*waterInTank*0.1
    height=(tank/(length*width)).toInt()

}
}