package _3_bytecode_noInline_HOF

fun callHOF_fun_refer() {
    var result = 0

    /**
     * Создает внутренний синтетический класс
     * наследующий класс kotlin/jvm/internal/FunctionReferenceImpl
     * реализующий интерфейс kotlin/jvm/functions/Function1
     *
     * final synthetic class _3_bytecode_noInline_HOF/Noinline_HOF_fun_referKt$callHOF_fun_refer$result$1 extends kotlin/jvm/internal/FunctionReferenceImpl implements kotlin/jvm/functions/Function1
     *
     * Получение экземпляра
     * GETSTATIC _3_bytecode_noInline_HOF/NoInline_HOF_func_varKt$callHOF$funToRefer$1.INSTANCE
     *  : L_3_bytecode_noInline_HOF/NoInline_HOF_func_varKt$callHOF$funToRefer$1;
     * CHECKCAST kotlin/jvm/functions/Function1
     * */

    result = _4_bytecode_Inline_HOF.inlineHighOrderFun_fun_refer(2, ::funToRefer)
}

fun funToRefer(i: Int): Int = i * i

fun noinlineHighOrderFun_fun_refer(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

