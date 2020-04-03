package io.access.kotlintraining

import org.junit.Test
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
}