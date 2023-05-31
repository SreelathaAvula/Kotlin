import java.util.Calendar

fun main(args: Array<String>) {
    dayOfWeek()
}
fun  dayOfWeek() {
    println("What day is it today?")
    val day=Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
      print(" $day  is ")
    when(day){
        1-> print("sunday")
        2-> print("monday")
        3-> print("tuesday")
        4-> print("wednesday")
        5-> print("thursday")
        6-> print("friday")
        7-> print("saturday")

    }

}
