package com.Aquarium

open class Book(title:String,author:String) {
     private  var currentPage=1
   open fun readPage(){
        currentPage++
println(currentPage)
    }
}
class Ebook(title:String,author:String, var format:String="text"):Book(title , author ){

    var wordCount=0;
    override fun readPage() {
        wordCount=wordCount+250
        println(wordCount)
    }
}
fun main(){
    var ebookObj=Ebook("Maha Bharath","vyasa")
    ebookObj.readPage()
    ebookObj.readPage()

}