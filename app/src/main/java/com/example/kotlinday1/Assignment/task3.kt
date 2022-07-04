package com.example.kotlinday1.Assignment

/*
* Task 3: Enter an array of integer numbers a0, a1, a2, ..., an-1.
* Do not use any other array, print the above array screen in ascending order.
* */
fun main() {
    val arr = arrayOf<Int>(1,5,2,10,6,20,-5,4)
    sortArray(arr)
}

fun sortArray(arr : Array<Int>){
    arr.sort()
    for(i in arr.indices) {
        print("${arr[i]} ")
    }
}