package com.Aquarium

open class InheritanceExample {
    open var name="Avula"
    open fun printDetails(){
        println(name)
    }

}
class SubClass():InheritanceExample(){
override  var name="Avula Sreelatha"
    override fun printDetails(){
        println("my name is $name ")
    }
}
fun main(){
    var sup=InheritanceExample()
    sup.printDetails()

    var sub=SubClass()
    sub.printDetails()
    sub.name



}