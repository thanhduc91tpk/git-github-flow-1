package ngay2

import java.math.BigInteger

fun main() {
    val hexStr = 200.toHexString()
    println(hexStr)
}

fun Int.toHexString() : String{
    return Integer.toHexString(this)
}
