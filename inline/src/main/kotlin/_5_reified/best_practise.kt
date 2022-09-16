@file:Suppress("UNCHECKED_CAST")

package _5_reified

import kotlin.reflect.KClass

/**
 * Т.к. reified - всего лишь сахар для получения котлин класса из java-класса,
 * и по сути для no-inline функции ---> и объявлять их нужно вместе
 * (реализую inline через no-inline).
 *
 * Таким образом, у нас сохранится возможность использования no-inline функцию при работе с
 * рефлексией и возможность использовать инлайн функцию без явной передачи котлин класса.
 *
 * */

fun <T : Any> getTypeName(klass: KClass<T>): String? = klass.simpleName
inline fun <reified T : Any> getTypeName(): String? = getTypeName(T::class)

/**
 * Реальный пример - функция создания экхемпляра класса через рефлексию.
 * Используется в тестах.
 *
 * Здесь, например, функция getPrimitiveValue не может быть inline
 *
 *
 * P.S.: если времени будет достаточно - покажу этот пример.
 * */

data class ClassToGenerate(val someInt: Int, val someBool: Boolean)

fun main(args: Array<String>) {
    println(instance<ClassToGenerate>())
}

inline fun <reified T : Any> instance(): T = instance(T::class)

fun <T : Any> instance(kClass: KClass<T>): T {
    /**
     * Если это java-примитив - вернем значение для этого примитива
     * */
    if (kClass.java.isPrimitive) {
        return getPrimitiveValue(kClass)
    }

    val constructor = kClass.constructors.first()
    val params = constructor.parameters.associateWith { param ->
        instance(param.type.classifier as KClass<*>)
    }

    return constructor.callBy(params)
}


private fun <T : Any> getPrimitiveValue(kClass: KClass<T>): T {
    return when {
        kClass == Int::class -> -1
        kClass == Boolean::class -> true
        else -> error("Cannot get value for class : ${kClass.simpleName}")
    } as T
}

