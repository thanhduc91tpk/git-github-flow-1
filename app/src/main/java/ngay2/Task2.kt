package ngay2

import java.math.BigInteger

fun main() {
    val result = "c8".hexToBin()
    println(result)
}

fun String.hexToBin() : String{
    return BigInteger(this,16).toString(2)
}
