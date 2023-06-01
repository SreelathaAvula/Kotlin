fun main(args: Array<String>) {
    print(printTakeItEsy())
}
fun printTakeItEsy():String{
    var fortunes= listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well."
        ,"Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune." )

   for(i in 1..10 ){
       if(i==5){
           return "${fortunes[i]}"
       }
   }
return "null"
}