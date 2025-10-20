import kotlin.math.pow

fun isArmstrongNumber(num: Int): Boolean {
    val numStr = num.toString()
    val len = numStr.length
    var sum = 0
    for (digitChar in numStr) {
        val digit = digitChar.toString().toInt()
        sum += digit.toDouble().pow(len).toInt()
    }
    return sum == num
}

fun main() {
    print("Enter the number you want to check: ")
    val input = readln()
    val num: Int? = input.toIntOrNull()
    if (num == null) {
        println("Invalid input. Please enter an integer.")
        return
    }
    if (isArmstrongNumber(num)) {
        println("$num is an Armstrong number")
    } else {
        println("$num is not an Armstrong number")
    }
}