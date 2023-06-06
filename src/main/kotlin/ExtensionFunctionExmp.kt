import java.util.*

class Book(var title: String, var author: String, var year: Int,   var pages:Int) {

}

//Extension Function
fun Book.weight():Double{
    return pages*1.5
}
fun Book.tornPages(noOfTornPages:Int){
if (pages>=noOfTornPages )
    pages=pages-noOfTornPages
    else
        pages=0

}
class Puppy{
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}
fun main() {

    val puppy = Puppy()
    val book= Book("To Kill a Mockingbird","Harper Lee", 1960, 100)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("no more pages in ${book.title}. ")

}