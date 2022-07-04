package com.example.kotlinday1.Assignment

/*
* Task 4 : Enter an string. Count the number of words in the string.
*  Capitalize the first letter of the word if it begins for a sentence.
* */


fun main() {
    val str : String = "I am very very happy right now"

    println("so tu trong chuoi la : ${wordCount(str)}")
    println()
    println("in hoa chu cai dau cua moi tu trong chuoi : ${capitalizeWord(str)}")
}

fun wordCount(str: String): Int {
    val trimmedStr = str.trim()
    return if (trimmedStr.isEmpty()) {
        0
    } else {
        trimmedStr.split("\\s+".toRegex()).size
    }
}

fun capitalizeWord(str : String) : String{
    val words : List<String> = str.split("\\s+".toRegex())
    var newString = ""
    for(w in words){
        val first = w.substring(0,1)
        val rest = w.substring(1);
        newString+= first.uppercase()+rest+" "
    }
    return newString.trim()
}