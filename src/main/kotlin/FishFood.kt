import java.util.*

fun main(args: Array<String>) {
    feedingFish()
}

fun feedingFish(){
    var day=day()
    var  feed=fishFood(day)
    print(" $day  day fish eats $feed " )
}
fun day():String{
    var week= listOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday")
    return week[Random().nextInt(7)]
}
fun fishFood(day :String):String{
    return when(day) {
        "sunday" -> "flakes"
        "monday" -> "pellets"
        "tuesday" -> "red worms"
        "thursday" -> "granules"
       // "friday" -> "mosquitoes"
        "saturday" -> "lettuce"
        "wednesday" -> "plankton"
        else -> "fasting"
    }
}