package _5_reified

import kotlin.reflect.KClass

// ошибка компиляции
//Не компилируется, т.к. компилятор не знает, что за джавоский класс будет
// `T::class` лишь оператор, реализуемый через джавоскую рефлексию:
//fun <T : Any> typeOf(): KClass<T> = T::class

//    //bytecode
//      LDC {package_name}/{class_name}.class
//      INVOKESTATIC kotlin/jvm/internal/Reflection.getOrCreateKotlinClass()

//fun <T> typeOf() : KClass<T> = T::class

//ALOAD 0 - скопировать значение из локальной переменной `с индексом 0 на стек
//LDC "kClass" - положить на стек строковую константу "kClass"
//INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Objejct)
fun <T : Any> typeOf(kClass: KClass<T>): KClass<T> = kClass

// создадим класс
class SomeClass()

fun main(args: Array<String>) {
    val typeName = typeOf(SomeClass::class)
}
