fun main(){
    spicesFiltering()
}
fun spicesFiltering(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter { it.contains("curry") }.sortedBy { it.length }
    )
println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') } )
    //println(spices.take(3).filter{it.startsWith('c'))
    println(spices.take(3).filter { it.startsWith('c') })
}

