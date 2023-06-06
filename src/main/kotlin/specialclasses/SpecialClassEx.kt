package specialclasses

abstract sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
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
    var color: Color
}

object YellowSpiceColor : SpiceColor {
    override var color = Color.YELLOW

}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

fun main() {
    var obj = Curry("curry", "mild")
    obj.prepareSpice()

    var obj1 = Curry("curry", "more spicy")
    println("obj1 has name ${obj1.name} and spiceness ${obj1.spiciness} and color is ${obj1.color}")

    obj1.prepareSpice()


}

