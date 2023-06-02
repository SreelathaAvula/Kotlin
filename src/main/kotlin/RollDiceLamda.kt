import java.util.Random
fun main(){
   //rollDice(0)
   //rollDice(4)
   // println(rollDice2(3))
    println("game play")
   // gamePlay(::rollDices)

}
val rollDice={
    sides:Int->
    if(sides==0)  println(0 )
    else println(Random().nextInt(1,13))
    }
val rollDice2:(Int)->Int={
        sides:Int->
    if(sides==0)  0 else Random().nextInt(1,13)
}
/*fun rollDices(){
    println(Random().nextInt(1,13))
}*/
