package com.Aquarium

fun main(){
    println( binarySearchExample()
    )
}

fun binarySearchExample() :String{
    var arr= arrayOf(1,4,7,8)
    var start=0
    var end=arr.size-1
    var key=0
   while (start<end){
        var mid=(start+end)/2
        if(key==arr[mid]) return "key found at $mid"
        else if(key<arr[mid])
            end=mid-1
        else start=mid+1
    }
    return "key not found"
}
