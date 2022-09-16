package _6_non_local_return

inline fun transformNumber(input: Int, block: (Int) -> Int): Int = block(input)

fun multEachOnTen(numbers: MutableList<Int>): Unit {
    numbers.forEachIndexed { index, number ->
        numbers[index] = transformNumber(number) {
            if ()
        }
    }
}

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    println(numbers)

    increaseEven(numbers)

    println(numbers)
}

