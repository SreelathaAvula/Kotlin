fun main(args: Array<String>) {
    print("your fortune is ${getFortuneCookie()}")
}
fun getFortuneCookie():String{
    var fortunes= listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well."
        ,"Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune." )
    print("enter your birthday")
    var day:String?= readLine()
    var birthday: Int=day?.toIntOrNull()?:1
   // print(birthday)
    var ind=birthday % fortunes.size
   // print(ind)
    return fortunes[ind]
    /*    var day:String?= readLine()
    var birthday=day?.toIntOrNull()
    print( birthday)
    if(birthday!=null){
        var ind=birthday % fortunes.size
        return "your fortune is ${fortunes[ind]}"
    }
    else{
        return "your fortune is ${fortunes[1]}"

    }*/
}