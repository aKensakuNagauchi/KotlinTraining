package io.access.kotlintraining

//世界のナベアツ
class NabeAtsu {
    var n = 0

    fun next(): String {
        val isIncludeThree = (++n).toString().contains("3")
        return if (n % 3 == 0 || isIncludeThree) "Aho" else "$n"
    }
}