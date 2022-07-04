package com.example.kotlinday1.Assignment

/*
* Task 2: Write a program that input a two-digit integer number.
* Convert and printout the value of inputted number in binary and hexadecimal.
* */


fun main() {
    val number = 18

    if(checkInput(number)){
        println("so nhi phan cua $number la : ${Integer.toBinaryString(number)}")
        print("so hex cua $number la : ${Integer.toHexString(number)}")
    }else{
        println("Định dạng sai vui lòng nhập lại số có 2 chữ số")
    }

}

//dau vao la 1 so co 2 chu so
fun checkInput(number: Int) : Boolean{
    if(number in 10..99 || number>=-99 && number<=-10){
        return true
    }
    return false
}

//fun decToBinary(number : Int) {
//    if(number == 0) return
//    else{
//        var result : Int = number % 2
//        decToBinary(number / 2)
//        print("$result")
//    }
//}
