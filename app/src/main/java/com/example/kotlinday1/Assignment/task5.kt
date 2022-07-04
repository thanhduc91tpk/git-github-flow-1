package com.example.kotlinday1.Assignment

/*
* Task 5: Write a program input month and year, print out the number of days that month.
* */

fun main() {
    val month = 2
    val year = 2005

    numberOfDay(month,year)
}

fun numberOfDay(month: Int, year: Int) {
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        println("so ngay : 31")
    else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
        println("so ngay : 29")
    } else if (month == 2) {
        println("so ngay : 28")
    } else {
        println("so ngay : 30")
    }
}
