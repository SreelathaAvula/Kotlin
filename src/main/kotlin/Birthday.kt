fun main(args: Array<String>) {
    print("your fortune is ${getFortune(::getBirthday)}")
}
fun getFortune(getBirthday:()->Int):String{
    return when(getBirthday()){
        in 1..7->"Be humble and all will turn out well."
        15->"be kind"
        10->" Look how far you've come."
        in 20..30->"Things will go well for you today."
        13->"new beginnings"
        14->"Take it easy and enjoy life!"
        9->"help someone you will receive good news"
        11->"your parents wii be proud"
        else->"all is well"
    }
}
fun getBirthday():Int{
    print("enter your birthday")
    var day:String?= readLine()
    var birthday: Int=day?.toIntOrNull()?:1
    return birthday
}