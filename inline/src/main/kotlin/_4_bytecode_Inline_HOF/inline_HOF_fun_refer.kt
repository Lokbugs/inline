package _4_bytecode_Inline_HOF

fun callHOF_fun_refer() {
    var result = 0

    /**
     * Не создается доп. класс
     * Просто вызывается функция funToRefer
     * INVOKESTATIC _4_bytecode_Inline_HOF/Inline_HOF_fun_referKt.funToRefer (I)I
     *
     * функция inlineHighOrderFun_fun_refer не используется
     * */

    result = inlineHighOrderFun_fun_refer(2, ::funToRefer)
}

fun funToRefer(i: Int): Int = i * i

inline fun inlineHighOrderFun_fun_refer(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

