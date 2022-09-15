package _1_simple_funcs

fun noInlinedFun(input: Int): Int = input * input

/*
public final class _1_simple_funcs/SimpliNoInlineSampleKt {


  // access flags 0x19
  public final static noInlinedFun(I)I
    // annotable parameter count: 1 (visible)
    // annotable parameter count: 1 (invisible)
   L0
    LINENUMBER 3 L0
    ILOAD 0
    ILOAD 0
    IMUL
    IRETURN
   L1
    LOCALVARIABLE input I L0 L1 0
    MAXSTACK = 2
    MAXLOCALS = 1

  @Lkotlin/Metadata;(mv={1, 6, 0}, k=2, d1={"\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0003"}, d2={"noInlinedFun", "", "input", "inline"})
  // compiled from: simpliNoInlineSample.kt
}
* */