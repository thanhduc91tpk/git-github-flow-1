package ngay4

fun main() {
    var array = arrayOf<Int>(1,2,3,4,5)
    println("mang truoc khi thay doi : ")
    for (element in array) {
        print("$element ")
    }
    println()
    swap(array,2,3)
    println("mang sau khi thay doi : ")
    for (element in array) {
        print("$element ")
    }
}

fun<T> swap(array : Array<T>,left : Int,right : Int) {
    var temp : T = array[left]
    array[left] = array[right]
    array[right] = temp
}