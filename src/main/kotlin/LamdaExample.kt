fun main(){
    swim()
    lamdaWithArguments(25)
    tankChange(dirty)
    tankChange(40)
}
val swim={
    println("  example of swimming without arguments ...i know swimming")
    println("we created lamda function with curly braces  and inside function w are printing and we are assigning this function to variable by using variable name we are calling  lamda function  by using variable ")
}
val  lamdaWithArguments={
    age:Int->
    println("inside lamda left side we are taking arguments and arrow right side performing some operations ")
    println("age is   $age  on 03 june because 03 is my birthday ")
}
var dirty=20
val tankChange={
    dirty:Int->
    println(dirty/2)
}
