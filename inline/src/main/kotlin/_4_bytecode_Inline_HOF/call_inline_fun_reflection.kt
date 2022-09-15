package _4_bytecode_Inline_HOF

fun main(args: Array<String>) {
}

inline fun inlineFun(input: Int, block: (Int) -> Int): Int = block(input)
