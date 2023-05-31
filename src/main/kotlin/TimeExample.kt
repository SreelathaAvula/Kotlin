
fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val time = args[0].toIntOrNull()
        if (time!=null){
            if(time<12) {
                println("good morning")
            }
            else{
                println("good night")
            }
        }
        else{
            println("Invalid time format")
        }
    }
}
