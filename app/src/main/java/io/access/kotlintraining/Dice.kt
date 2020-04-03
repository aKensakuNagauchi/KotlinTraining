package io.access.kotlintraining

import java.util.*

class Dice(private val diceFace: Int) {
    private var numberOfTimes: Int = 0

    fun roll(): Int {
        return if (numberOfTimes < 100) {
            numberOfTimes += 1
            Random().nextInt(diceFace) + 1 // 1〜n までの範囲の値がランダムで返る
        } else {
            throw Exception("I was broken")
        }
    }
}