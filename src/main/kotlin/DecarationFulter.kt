fun main(){

    eagerFiltering()
    lazyFiltering()

}
fun  eagerFiltering(){
val decorations= listOf<String>("rock","plastic plant","water","flower pot","alligator","pagoda","rock")
println("if we give true it  will print all dec items ${decorations.filter { true }}")
    println("if we give false it  will not print${decorations.filter { false }}")
    println("it refers each element of list and check first character and print ${decorations.filter { it[0]=='p'}}")
    println("it refers each element of list and check  element  and print ${decorations.filter { it=="rock"}}")
//lazy filtering

}
fun  lazyFiltering(){
    val decorations= listOf<String>("rock","plastic plant","water","flower pot","alligator","pagoda","rock")
   println("lazy filtering ")
    val filtered=decorations.asSequence().filter { it[0]=='p'}
    println("it hold the list reference $filtered")
    println("to get in elements in sequence use toList()")
    println(filtered.toList())
    //apply map lazily
    val lazymap=decorations.asSequence().map { println("map $it")}
println(" it does not return anything $lazymap   ")
    println("first ${ lazymap.first()}")
    println("last will print all elements  ${ lazymap.last()} elemrnt")

  //  println(lazymap.toList())

}