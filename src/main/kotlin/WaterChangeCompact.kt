fun main(args:Array<String>){
    println(shouldChangeWaterInTank(temperature = 40, dirty = 80))
    println(shouldChangeWaterInTank(temperature = 20, dirty = 10))
    println(shouldChangeWaterInTank())


}
fun shouldChangeWaterInTank(temperature:Int=20,dirty:Int=20):Boolean{
   /* val isHot=temperature>30
    val isDirty=dirty>20*/
    return when{
        isHot(temperature )->true
        isDirty(dirty  )->true
        else->false
    }
}
fun isHot(temperature:Int)=temperature>30
fun isDirty(dirty:Int)=dirty>30
