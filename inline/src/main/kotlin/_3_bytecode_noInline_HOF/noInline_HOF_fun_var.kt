package _3_bytecode_noInline_HOF

fun callHOF_fun_var() {
    var result = 0

    /**
     * Создает синтетический внутренний класс
     * наследующий класс kotlin/jvm/internal/Lambda
     * реализующий интерфейс kotlin/jvm/functions/Function1
     *
     * final class _3_bytecode_noInline_HOF/NoInline_HOF_fun_varKt$callHOF_fun_var$f$1 extends kotlin/jvm/internal/Lambda implements kotlin/jvm/functions/Function1
     *
     * Получение экземпляра
     * GETSTATIC _3_bytecode_noInline_HOF/NoInline_HOF_fun_varKt$callHOF_fun_var$f$1.INSTANCE
     *  : L_3_bytecode_noInline_HOF/NoInline_HOF_fun_varKt$callHOF_fun_var$f$1;
     * CHECKCAST kotlin/jvm/functions/Function1
     * */

    val f: (Int) -> Int = { it * it }

    result = _4_bytecode_Inline_HOF.inlineHighOrderFun_fun_var(2, f)
}

fun noinlineHighOrderFun_fun_var(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

