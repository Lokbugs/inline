package _6_non_local_return

/**
 * Напишем свою реализацию forEach функции
 * */
inline fun <T> Collection<T>.customForEach(block: (T) -> Unit): Unit {
    for (item in this) block(item)
}

fun existsNegative(list: List<Int>): Boolean {
    list.customForEach {
        if (it < 0) return true // return@customForEach выйдет из цикла, но не выйдет из функции existsNegative
    }

    return false
}

fun main(args: Array<String>) {

}