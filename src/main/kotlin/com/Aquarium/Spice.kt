package com.Aquarium

class Spice (var name:String,
             var spiciness:String="mild"){
    val heat:Int
        get() {return when(spiciness){
            "mild"->2
            "spicy"->7
            "more spicy"->10
            "medium"->5
            else->0 }
        }
    init {
        println("the spice details of curry is $name and $spiciness and level of spice is  $heat")
    }
}
//helper function created outside the class helper function is also called as utili

fun makeSalt(): Spice {
    return Spice("Salt")
}
fun main(){
    val spices = listOf<Spice>(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "spicy"),
    Spice("ginger", "mild"),
    Spice("red curry", "more spicy"),
    Spice("green curry", "mild"),
)

  val lesspicy= spices.filter {
       it.heat < 5}
    val spicy= spices.filter {
        it.heat>=5
    }
  /*  println(lesspicy.toList() )
    println(spicy.toList())*/
    println("less spiy")
for (i in lesspicy){
    println("${i.name} and ${i.spiciness} and ${i.heat}")
}
    println(" spiy")

    for (i in spicy){
        println("${i.name} and ${i.spiciness} and ${i.heat}")
    }


    //remakeSalt()
       //fun makeSalt() = Spice("Salt")
   //}
}