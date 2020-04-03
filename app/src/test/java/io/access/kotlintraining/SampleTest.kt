package io.access.kotlintraining

import org.junit.Test
import java.security.InvalidParameterException
import java.util.*
import kotlin.math.pow
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        println("Hello world!")
    }

    private fun fizzBuzz(number: Int): String {
        return when {
            number % 15 == 0 -> "FizzBuzz"
            number % 5 == 0 -> "Buzz"
            number % 3 == 0 -> "Fizz"
            else -> "$number"
        }
    }

    private fun fizzBuzz2(number: Int): String {
         val output = "${if (number % 3 == 0) "Fizz" else ""}${if (number % 5 == 0) "Buzz" else ""}"
         return if (output.isBlank()) "$number" else output
    }

    @Test
    fun testFizzBuzz() {
        for (i in 1..100) {
            assertEquals(expected = fizzBuzz(i), actual = fizzBuzz2(i))
        }
    }

    private fun isLeapYear(year: Int): Boolean {
        // 0未満はエラー
        if (year < 0) {
            throw InvalidParameterException("The parameter \"year\" should not minus.")
        }

        // うるう年は4で割り切れることが前提
        if (year % 4 != 0) {
            return false
        }

        // 100で割り切れて、400で割り切れないとうるう年ではない
        if (year % 100 == 0 && year % 400 != 0) {
            return false
        }

        return true
    }

    private fun isLeapYear2(year: Int) = if (year < 0) {
        throw InvalidParameterException("The parameter \"year\" should not minus.")
    } else {
        year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)
    }

    @Test
    fun testIsLeapYear() {
        for (i in 1800..2200) {
            assertEquals(expected = isLeapYear(i), actual = isLeapYear2(i))
        }
    }

    private fun power(a: Double, n: Double): Double {
        if (a < 0 || n < 0) {
            println("inputs must be positive. return 0")
            return 0.0
        }
        return a.pow(n)
    }

    @Test
    fun testPower() {
        assertEquals(expected = 8.0, actual = power(2.0, 3.0))
        assertEquals(expected = 23797, actual = power(4.5, 6.7).toInt())
        assertEquals(expected = 0.0, actual = power(-1.0, 2.0))
    }

    @Test
    fun testisOdd() {
        for (i in 1..10) {
            assertEquals(expected = true, actual = (i * 2 + 1).isOdd())
        }
    }

    @Test
    fun testisEven() {
        for (i in 1..10) {
            assertEquals(expected = true, actual = (i * 2).isEven())
        }
    }

    @Test
    fun testDice() {
        val d = Dice(16)
        for (i in 1..100) {
            println(d.roll())
        }
        println(d.roll())
    }

    @Test
    fun testMyCustomClass() {
        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        assertEquals(expected = 3, actual = p.counter)
    }

    @Test
    fun testNabeAtsu() {
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }
}

private fun Int.isOdd() = this % 2 != 0

private fun Int.isEven() = this % 2 == 0
