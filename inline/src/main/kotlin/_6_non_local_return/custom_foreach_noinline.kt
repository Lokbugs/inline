package _6_non_local_return


fun main(args: Array<String>) {
    /**
     * Напишем свою реализацию forEach функции
     * */
    fun <T> Collection<T>.customForEach(block: (T) -> Unit): Unit {
        for (item in this) block(item)
    }

    fun existsNegative(list: List<Int>): Boolean {
        list.customForEach {
            if (it < 0)  true // return@customForEach выйдет из цикла, но не выйдет из функции existsNegative
        }

        return false
    }
}