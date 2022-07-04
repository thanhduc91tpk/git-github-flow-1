package com.example.kotlinday1.Assignment

/*
* Write a program to find all numbers divisible by 7 but not multiples of 5, between 10 and 200
* (counting 10 and 200).
*  The resulting numbers will be printed as strings on a line, separated by commas
* */

fun main() {
    val startNumber : Int = 10
    val endNumber : Int = 200

    checkNumber(startNumber,endNumber)
}

fun checkNumber(startNumber : Int,endNumber : Int) {
    for(i in startNumber..endNumber){
        if(i % 7 == 0 && i % 5 != 0){
            print("$i ")
        }
    }
}