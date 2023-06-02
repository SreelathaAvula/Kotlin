fun main(){
dirtyProcessor()
}
var dirt=20
//var day="sun"

//lamda function which takes int and returns int
val waterFilter:(Int)->Int={dirt:Int->dirt/2 }


// compactFunction which we can write in one line
fun feedFish(dirt :Int)=dirt+10


//high order function taking one int arg and second argument as function
fun updateDirtyTank(dirt: Int,operation:(Int)->Int) :Int{
    return operation(dirt)
}


fun dirtyProcessor(){
    //passing lamda function
    dirt=updateDirtyTank(dirt,waterFilter)
    println(dirt)

    //passing named function using two colons
    dirt=updateDirtyTank(dirt,::feedFish)
    println(dirt)

    //passing lamda as a n argument for parameter operation..lamda paseed as a last parameter so no need to put inside function paranthesis
    dirt=updateDirtyTank(dirt) { dirt -> dirt + 50 }
    println(dirt)
}