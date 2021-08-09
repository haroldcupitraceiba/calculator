package com.example.calculator

class Calculator (private val firstNumber: Int, private val secondNumber:Int) {
    fun add(): Int{
        return firstNumber + secondNumber
    }

    fun subtract(): Int{
        return firstNumber - secondNumber
    }

    fun multiply() : Int{
        return firstNumber * secondNumber
    }

    fun divide(): Int{
        return (firstNumber / secondNumber) as Int
    }
}