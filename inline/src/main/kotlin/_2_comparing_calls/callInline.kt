package _2_comparing_calls

fun main(args: Array<String>) {

/*
   L1
    LINENUMBER 27 L1
    ICONST_2
    ISTORE 1
    NOP
   L2
    ICONST_0
    ISTORE 2
   L3
    LINENUMBER 31 L3
    ILOAD 1
    ILOAD 1
    IMUL
    NOP
    GOTO L4
   L4
    POP
   L5
    LINENUMBER 28 L5
    RETURN
* */
    inline(2)
}

inline fun inline(input: Int): Int = input * input