import java.util.*

fun main(args: Array<String>) {
    shouldChangeWater();
    shouldChangeWater(dirty=10);
    shouldChangeWater(temp=8);
//default values

}
fun shouldChangeWater(dirty: Int =50,temp :Int=50){
    if(dirty<20 || temp in 25..34) {
        println("no need to change water")
    }
    else{
        println("you need to change water for fish")
    }
}
