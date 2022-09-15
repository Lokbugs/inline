package _2_comparing_calls

fun main(args: Array<String>) {

/*
   L1
    LINENUMBER 15 L1
    ICONST_2
    INVOKESTATIC _2_comparing_calls/CallNoInlineKt.noInline (I)I
    POP
   L2
    LINENUMBER 16 L2
    RETURN
* */
    noInline(2)
}

fun noInline(input: Int): Int = input * input