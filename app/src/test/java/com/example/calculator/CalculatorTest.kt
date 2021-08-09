package com.example.calculator

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {
    @Test
    fun addition_isCorrect(){
        val calculator = Calculator(10,5)
        val response = calculator.add()
        assertEquals(15, response)
    }

    @Test
    fun addition_isWrong(){
        val calculator = Calculator(10,5)
        val response = calculator.add()
        assertFalse(5 == response)
    }

    @Test
    fun subtract_isCorrect(){
        val calculator = Calculator(10,5)
        val response = calculator.subtract()
        assertEquals(5, response)
    }

    @Test
    fun subtract_isWrong(){
        val calculator = Calculator(10,5)
        val response = calculator.subtract()
        assertFalse(15 == response)
    }

    @Test
    fun multiply_isCorrect(){
        val calculator = Calculator(10,5)
        val response = calculator.multiply()
        assertEquals(50, response)
    }

    @Test
    fun multiply_isWrong(){
        val calculator = Calculator(10,5)
        val response = calculator.multiply()
        assertFalse(500 == response)
    }

    @Test
    fun divide_isCorrect(){
        val calculator = Calculator(10,5)
        val response = calculator.divide()
        assertEquals(2, response)
    }

    @Test
    fun divide_isWrong(){
        val calculator = Calculator(10,5)
        val response = calculator.divide()
        assertFalse(1 == response)
    }
}