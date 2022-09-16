package _5_reified

import kotlin.reflect.KClass

inline fun <reified T : Any> typeOf(): KClass<T> = T::class

fun main(args: Array<String>) {
//LDC L_5_reified/SomeClass;.class
//INVOKESTATIC kotlin/jvm/internal/Reflection.getOrCreateKotlinClass (Ljava/lang/Class;)Lkotlin/reflect/KClass;

    val intType = typeOf<SomeClass>()
}

