package ngay2

fun main() {
    reverseFibonacci(7)
}

fun reverseFibonacci(n : Int){
    val arr = mutableListOf<Int>(0,1)
    arr.add(0,0)
    arr.add(1,1)

    for(i in 2 until n){
        arr.add(i,arr[i - 2] + arr[i - 1])
    }

    for(i in n-1 downTo 0){
        println("${arr[i]} ")
    }

}