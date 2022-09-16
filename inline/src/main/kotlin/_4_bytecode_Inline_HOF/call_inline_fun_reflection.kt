package _4_bytecode_Inline_HOF

import kotlin.random.Random

fun main(args: Array<String>) {
    /**
     * Придумать, как вызвать через рефлексию стат. функцию (не оборачивая её в класс).
     * */
}

inline fun inlineFun(input: Int, block: (Int) -> Int): Int = block(input)
