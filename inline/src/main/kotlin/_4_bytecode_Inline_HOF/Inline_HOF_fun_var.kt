package _4_bytecode_Inline_HOF

fun callHOF_fun_var() {
    var result = 0

    /**
     * Создает синтетический внутренний класс
     * наследующий класс kotlin/jvm/internal/Lambda
     * реализующий интерфейс kotlin/jvm/functions/Function1
     *
     * final class _4_bytecode_Inline_HOF/Inline_HOF_fun_varKt$callHOF_fun_var$f$1 extends kotlin/jvm/internal/Lambda implements kotlin/jvm/functions/Function1
     *
     * Получение экземпляра
     * GETSTATIC _4_bytecode_Inline_HOF/Inline_HOF_fun_varKt$callHOF_fun_var$f$1.INSTANCE
     *  : L_4_bytecode_Inline_HOF/Inline_HOF_fun_varKt$callHOF_fun_var$f$1;
     * CHECKCAST kotlin/jvm/functions/Function1
     *
     * */
    val f: (Int) -> Int = { it * it }

    /**
     * НО! в месте вызова будет вызван инстанс класса _4_bytecode_Inline_HOF/Inline_HOF_fun_varKt$callHOF_fun_var$f$1,
     * а не функция [inlineHighOrderFun_fun_var]
     * через  INVOKEINTERFACE kotlin/jvm/functions/Function1.invoke
     *      + CHECKCAST java/lang/Number
     *      + INVOKEVIRTUAL java/lang/Number.intValue
     * */
    result = inlineHighOrderFun_fun_var(2, f)
}

inline fun inlineHighOrderFun_fun_var(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

