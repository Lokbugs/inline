package _4_bytecode_Inline_HOF

fun callHOF_lambda_optimize() {
    /**
     * L4
     *  LINENUMBER 9 L4
     *  NOP
     * */
    inlineHighOrderFun_lambda_optimize(2) { it }
}

inline fun inlineHighOrderFun_lambda_optimize(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

