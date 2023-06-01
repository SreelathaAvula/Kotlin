fun main(args: Array<String>) {
    println(whatShouldIDoToday(mood="happy",weather="rainy"))
    println(whatShouldIDoToday(mood="sad"))
    println(whatShouldIDoToday(mood="happy", weather = "sunny", temperature = 24))


}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        mood == "sad" && weather == "Sunny" -> "stay home and read"
        mood == "happy" && weather == "rainy" && temperature==24 -> "go for a walk"
        mood == "sad" && weather == "Sunny" && temperature==40 -> "stay home and read"
        mood=="happy"&& weather=="rainy"->"go  and dance in rain"
        else -> "Stay home and read."

    }
}
