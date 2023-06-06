package com.Aquarium
//singleton class created using object keyword it has only one object oir instance throught the program
object College{

    //have properties ,methods,these classes can implement interfaces also
var name="Mits"
    fun printName(){
        println("mca from  $name college")
    }
}
fun main(){
    //obj 1 and obj2 are references  not objects
    var obj=College
    println(    obj.name
    )
    obj.printName()
    var obj2=College
    obj2.printName()
    // if we make any changes using one reference it will effect both the variables output and give same content

    obj.name="madanapalle institute of technology and science"
    println( obj.name)
    println( obj2.name)
    obj.printName()
    obj2.printName()
    //accessing with class name
    College.name
    College.printName()
}