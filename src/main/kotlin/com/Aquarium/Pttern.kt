package com.Aquarium
fun main(){
    patternPrint()
}
fun patternPrint(){
    for(i in 1 ..5) {
        for (j in i..5) {
            print("* ")
        }
        println()
    }
    for(i in 1 ..4) {
        for (j in 1..i+1) {
            print("* ")
        }
        println()
    }
}