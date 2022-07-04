package ngay4

fun main() {
    val collection: Collection<Int> = arrayListOf(1, 2, 3, 4)
    val count: Int = Algorithm.countIf(collection, OddPredicate())
    println("Number of odd integer = $count")
}

/*
* interface nơi để các class khác có thể imple triển khai các thuật toán cần thiết cho đề bài
* */
interface UnaryPredicate<T> {
    fun test(obj: T): Boolean
}

/*
* class để triển khai tìm số phù hợp theo thuật toán cho vào param
* */
class Algorithm {
    companion object {
        fun <T> countIf(c: Collection<T>, p: UnaryPredicate<T>): Int {
            var count = 0
            for (i in c) {
                if (p.test(i)) {
                    count++
                }
            }
            return count
        }
    }
}

/*
* class OddPredicate imple interface UnaryPredicate để triển khai thuật toán của riêng nó
* */
class OddPredicate : UnaryPredicate<Int> {
    override fun test(obj: Int): Boolean {
        return obj % 2 != 0
    }

}