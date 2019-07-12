package calculator

fun main(args: Array<String>) {
    println("Hello")

    val calculatorHelper = CalculatorHelper()
    println(calculatorHelper.add(2,5))
    println(calculatorHelper.multiply(2,5))
    println(calculatorHelper.divide(200,5))
}