package com.Aquarium
fun main(){
    patternPrint()
}
fun patternPrint(){
    for(i in 1 ..5) {
        for (j in 5 downTo 1 step 1) {
            print("* ")
        }
        println()
    }
}