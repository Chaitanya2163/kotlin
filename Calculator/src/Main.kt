fun main(){
    var choice = true
    while(choice){
        print("Enter 1st number:")
        val num1: Float = readln().toFloat()
        print("Enter 2nd number:")
        val num2: Float = readln().toFloat()
        println("Enter your operation (+,-,*,/)")
        val option = readln()
        when(option){
            "+" -> println("The sum of $num1 and $num2 is ${num1 + num2}")
            "-" -> println("The difference between $num1 and $num2 is ${num1 - num2}")
            "*" -> println("The product of $num1 and $num2 is ${num1 * num2}")
            "/" -> {
                if(num2 != 0f){
                    println("The quotient of $num1 and $num2 is ${num1 / num2}")
                } else {
                    println("Cannot divide by zero")
                }
            }
            else -> println("Invalid option")
        }
        print("Do you want to continue? (true/false)")
        choice = readln().toBoolean()
    }
}