package beyondBsicsPrograms

class Book(var title: String, var author: String, var year: Int) {
    fun printingPair(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)

    }

    //constant concept
    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(ConstantsUrl.BASE_URL + title + ".html")

    }

    object ConstantsUrl {
        const val BASE_URL = "https://appscrip.com/"
    }

    companion object {
        val BASE_URL = "https://appscrip.com/"
    }
    //Extension function
    var pages:Int=1

}
//To create a top-level constant in Kotlin, you can define it outside of any class or function

const val MAX_NUMBER_BOOKS = 20
//Extension Function


fun main() {
    var book = Book("To Kill a Mockingbird", "Harper Lee", 1960)
    val bookTitleAuthor = book.printingPair()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} written by ${bookTitleAuthor.second}")

    println(
        "Here is your book ${bookTitleAuthorYear.first} written  " +
                "by ${bookTitleAuthorYear.second} written in the year ${bookTitleAuthorYear.third}"
    )

    //constant concept
    book.printUrl()
    println(book.canBorrow(30))
    println(book.canBorrow(10))

}