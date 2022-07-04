package review

fun main() {

}

class StackUsingArray(size: Int) {
    private var stackSize = size
    private var stackArr = IntArray(stackSize)
    private var top = -1

    fun push(entry: Int) {
        if (isStackFull()) {
            println("stack full. increasing the capacity")
            increaseStackCapacity()
        }
        top += 1
        println("Adding: $entry")
        stackArr[top] = entry
    }

    fun pop() : Any{
        if(stackArr.isEmpty()){
            println("stack is empty. can not remove element")
        }
        var entry = stackArr[top--]
        println("remove entry : $entry")
        return entry
    }

    private fun increaseStackCapacity() {
        val newStack = IntArray(stackSize * 2)
        for (i in 0 until stackSize) {
            newStack[i] = stackArr[i]
        }
        stackArr = newStack
        stackSize *= 2
    }

    private fun isStackFull(): Boolean {
        return top == stackSize - 1
    }
}