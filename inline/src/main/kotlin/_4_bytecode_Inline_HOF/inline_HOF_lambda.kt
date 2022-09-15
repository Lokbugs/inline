package _4_bytecode_Inline_HOF

fun callHOF_lambda() {
    var result = 0

    /**
     * НЕ создает синтетических классов
     * Просто вставляет инструкции, как если бы они были в исходном коде
     *
     * L5
     *  LINENUMBER 17 L5
     *  ILOAD 3
     *  ILOAD 3
     *  IMUL
     * */
    result = inlineHighOrderFun_lambda(2) {
        it * it
    }
}

inline fun inlineHighOrderFun_lambda(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

