package beyondBsicsPrograms

fun main() {
    val allBooks = setOf(
        "Othello",
        "Romeo and Juliet",
        "Hamlet",
        "Macbeth",
        "The Merchant of Venice",
        " A Midsummer Nights Dream",
        "Julius Caesar"
    )
    var library = mapOf("William Shakespeare " to allBooks)
    // println(library.keys)
    // println(library.values)
    //Returns true if map has at least one entry
    println(library.any {
        it.value.contains("Hamlet")
    })
    var moreBooks = mutableMapOf("To Kill a Mockingbird" to "Harper Lee")
    //getOrPut() is a handy function that will check whether a key is in a map,
    // and if it is, will return the value. Otherwise, it will add the key with
    // the supplied value to the map.
    println(moreBooks.getOrPut("Lord of the Flies") { "William Golding" })
    println(moreBooks.getOrPut("Hamlet") { "Shakespeare" })
    println(moreBooks.getOrPut("Lord of the Flies") { "William Golding" })


    println(moreBooks)

}

