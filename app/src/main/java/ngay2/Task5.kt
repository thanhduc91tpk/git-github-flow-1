package ngay2

fun main() {
    //test : 4523454545862103 (Visa) , 5223434884682841

    val numberAcc = "4523454545862103"
    if (inputAccountNumbers(numberAcc) && checkValidateAccount(numberAcc)) {
        displayCardType(numberAcc)
    } else {
        println("chuoi sai dinh dang")
    }

//    println(checkValidateAccount(numberAcc))

}

fun inputAccountNumbers(accountNumbers: String): Boolean {
    if (accountNumbers.length < 12 || accountNumbers.length > 19) {
        return false
    } else if (!accountNumbers.matches("-?\\d+(\\.\\d+)?".toRegex())) {
        return false
    }
    return true
}

fun checkValidateAccount(accountNumber: String): Boolean {
    var sum = 0
    var check = false
    for (i in accountNumber.length - 1 downTo 0) {
        var n = accountNumber.substring(i, i + 1).toInt()
        if (check) {
            n *= 2
            if (n > 9) {
                n = (n % 10) + 1
            }
        }
        sum += n
        check = !check
    }
    return (sum % 10 == 0)
}

fun displayCardType(accountNumber: String) {
    if (accountNumber.substring(0, 1).toInt() == 4) {
        println("VISA Card")
    } else if (accountNumber.substring(0, 2).toInt() in (50..69) || accountNumber.substring(0, 4)
            .toInt() in (2221..2720)
    ) {
        println("Master Card")
    }
    else if(accountNumber.substring(0, 4)
            .toInt() in (3528..3589)){
        println("JCB Card")
    }else{
        println("Unknown Card")
    }
}



