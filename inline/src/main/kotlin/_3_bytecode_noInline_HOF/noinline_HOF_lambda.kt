package _3_bytecode_noInline_HOF

fun callHOF_lambda() {
    var result = 0

    /**
     * Создает внутренний синтетический класс
     * наследующий класс kotlin/jvm/internal/Lambda
     * реализующий интерфейс kotlin/jvm/functions/Function1
     *
     * final class _3_bytecode_noInline_HOF/Noinline_HOF_lambdaKt$callHOF_lambda$result$1 extends kotlin/jvm/internal/Lambda implements kotlin/jvm/functions/Function1 {
     *
     * Получение экземпляра
     * GETSTATIC _3_bytecode_noInline_HOF/Noinline_HOF_lambdaKt$callHOF_lambda$result$1.INSTANCE
     *  : L_3_bytecode_noInline_HOF/Noinline_HOF_lambdaKt$callHOF_lambda$result$1;
     * CHECKCAST kotlin/jvm/functions/Function1
     * */

    result = _4_bytecode_Inline_HOF.inlineHighOrderFun_lambda(2) {
        it * it
    }
}

fun noinlineHighOrderFun_lambda(input: Int, lowerOrderFun: (Int) -> Int): Int = lowerOrderFun(input)

