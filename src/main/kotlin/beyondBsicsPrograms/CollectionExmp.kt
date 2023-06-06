package beyondBsicsPrograms

fun main() {
    var symptoms = mutableListOf("white spots", "red spots", "not eating", " cough", "cold")
    symptoms.add("white fungus")
    println(symptoms)
    symptoms.remove("white fungus")

    println(symptoms)
    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))
    println(symptoms.size)
    symptoms.reverse()
    println(symptoms)
    println(symptoms.isEmpty())

    println(symptoms.subList(2, symptoms.size))
    symptoms.clear()
    println(symptoms)


    println(
        listOf(1, 5, 2).sum()

    )
    //print thr count of characters
    println(listOf("aa", "bffd", "dad").sumBy { it.length }
    )


    //Mapping in collections
    val cures = mapOf("white spots" to "ich", "red sores " to "hole disease")
    println(cures["white spots"])
    println(cures.get("white spots"))
//there is no key give defaukt value
    println(cures.getOrDefault("cold", "I don't know which disease"))
    // if key is found it will give value or else default value


    println(cures.getOrDefault("white spots", "I don't know which disease"))
    println(cures.getOrElse("bloating", { "no treatment" }))


    //mutable map

val equipment= mutableMapOf("fish net" to 1,"tank scrubber" to 3)
    equipment["stones"] = 30
    println(equipment)
}