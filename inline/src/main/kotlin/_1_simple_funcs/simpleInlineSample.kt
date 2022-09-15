package _1_simple_funcs

inline fun inlinedFun(input: Int): Int = input * input

/*
public final class _1_simple_funcs/SimpleInlineSampleKt {


  // access flags 0x19
  public final static inlinedFun(I)I
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
   L0
    LDC 0
    ISTORE 1
   L1
    LINENUMBER 3 L1
    ILOAD 0
    ILOAD 0
    IMUL
    IRETURN
   L2
    LOCALVARIABLE input I L0 L2 0
    LOCALVARIABLE $i$f$inlinedFun I L1 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  @Lkotlin/Metadata;(mv={1, 6, 0}, k=2, d1={"\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0008\u00a8\u0006\u0003"}, d2={"inlinedFun", "", "input", "inline"})
  // compiled from: simpleInlineSample.kt
}
* */