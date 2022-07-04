package ngay2

/*
* Create a function, input is a hexadecimal string, the size of this string must be 4 byte.
*  Convert this string to binary string. Turn-off the bit 2 of byte 3 to 0.
* The result of function is a hexadecimal string after turn-off B3b2.
*  The function could be extension function or normal function.
*
* */

fun main() {
    val str = "1f3f5678"
    val flag = checkInput(str)

    if (flag) {
        println(turnOffB3b2(str))
    } else {
        println("sai dinh dang")
    }
}
/*
* oldHexStr : String luc ban dau
* byte3Str : String of byte 3
* binaryStr : binary covert from byte3Str
* newHexByte3Str : hex string convert from binaryStr
* */
fun turnOffB3b2(oldHexStr: String): String {
    val byte3Str = oldHexStr.substring(0, 2)
    var binaryStr = byte3Str.hexToBin()

    binaryStr = (binaryStr.reversed().substring(0, 2) + "0"
            + binaryStr.reversed().substring(3, binaryStr.length)).reversed()

    val newHexByte3Str: String = binaryStr.toInt(2).toString(16)

    return newHexByte3Str + oldHexStr.substring(2)

}

fun checkInput(str: String): Boolean {
    if (str.length == 8) {
        if (str.matches("^[a-fA-F0-9]+".toRegex())) {
            return true
        }
    }
    return false
}
