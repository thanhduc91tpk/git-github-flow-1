package review

fun main() {
    val stacklist  = StackWithList()
    println("is Stack empty : "+stacklist.isStackEmpty())
    stacklist.push("karthiq")
    println("peek is : " +stacklist.peek())
    stacklist.push(false)
    stacklist.push(5)
    stacklist.push(12.22)
    println("the pop elements is : " +stacklist.pop())
    println("the size is : " +stacklist.size())
    println("is Stack empty : " +stacklist.isStackEmpty())
}

class StackWithList {
    val elements = mutableListOf<Any>()

    fun isStackEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun push(item: Any) = elements.add(item)

    fun pop(): Any? {
        val item = elements.lastOrNull()
        if (!isStackEmpty()) {
            elements.removeAt(elements.size - 1)
        }
        return item
    }

    fun peek(): Any? = elements.lastOrNull()

    override fun toString(): String {
        return elements.toString()
    }
}