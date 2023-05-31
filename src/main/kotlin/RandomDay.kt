import java.util.*

fun main(args: Array<String>) {
    feedFish()
}
fun feedFish(){
    var day=randomDay()
    var  feed="pellets"
    print(" $day  day fish eats $feed " )
}
fun randomDay():String{
    var week= listOf("sunday","amaonday","tuesday","thursday","friday","saturday")
    return week[Random().nextInt(7)]
}
