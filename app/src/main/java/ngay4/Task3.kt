package ngay4

fun main() {
    val arr = arrayOf(41,6,1,5,100,9)
    println("so lon nhat trong mang la : ${maximalElement(arr,0,arr.size)}")
}

fun maximalElement(arr: Array<Int>, from: Int, to: Int): Int {
    var max = arr[from]
    for (i in from + 1 until to) {
        var element1 = arr[i]
        if (max < element1) max = element1
    }
    return max
}
