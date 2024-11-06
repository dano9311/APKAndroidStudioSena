package com.sena.saludopersonalizado

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {

    @Test
    fun testGreetingMessage() {
        val name = "Android"
        val expectedMessage = "Hello $name!"
        val actualMessage = getGreetingMessage(name)
        assertEquals(expectedMessage, actualMessage)
    }

    private fun getGreetingMessage(name: String): String {
        return "Hello $name!"
    }
}
