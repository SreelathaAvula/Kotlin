package com.spices

/* However, color is actually a property common to all spices, so you can move it to the parent class.
Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.*/
abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color),
    Grinder {
    override fun prepareSpice() {
        println("Spice class preparedSpice() is override in the  sub class of curry")
        println("name $name and spiceness $spiciness and color $color")
    }

    override fun grind() {
        println("grinding spices")
    }

}

interface Grinder {
    fun grind()

}

interface SpiceColor {
    var color: String
}

object YellowSpiceColor : SpiceColor {
    override var color = "yellow"

}

//data class
data class SpiceContainer(var spices: Spice) {
    var label = spices.name
    var label1 = spices.spiciness
}

fun main() {
    var obj = Curry("curry", "mild")
    obj.prepareSpice()

    var obj1 = Curry("curry", "more spicy")
    println("obj1 has name ${obj1.name} and spiceness ${obj1.spiciness} and color is ${obj1.color}")

    obj1.prepareSpice()


    //data class*/
    val spicelist = listOf(
        SpiceContainer(Curry("yellow curry", "mild")),
        SpiceContainer(Curry("red Curry", "more spicy")),
        SpiceContainer(Curry("curry", "medium"))
    )
    for (i in spicelist) {
        println(i.label)
    }
    for (i in spicelist) {
        println(i.label1)
    }
}

