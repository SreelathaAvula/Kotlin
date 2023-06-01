
fun main(args: Array<String>) {
    println(canAddFish(size = 10.0, listOf(3,3,3)))
    println(canAddFish(size = 8.0, listOf(2,2,2), hasDec = false))
    println(canAddFish(size = 9.0, listOf(1,1,3), fishSize = 3))
    print(canAddFish(size = 10.0, listOf(), fishSize = 7, hasDec=true))
}
fun canAddFish(size: Double,currentFish : List<Int>,fishSize:Int=2,hasDec: Boolean=true):Boolean{
var tanklength:Double
var fishlength=currentFish.sum()+fishSize
    if (hasDec==true) {
        tanklength= size * 0.8
    }
    else{
        tanklength=size*1.0
    }
    println(fishlength)
    println(tanklength)
    return fishlength<=tanklength
}