package io.access.kotlintraining

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        set(value) {
            // 値はfield変数に格納する
            field = value
            counter++
        }
}