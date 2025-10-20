fun factorial(n: Int): Int {
    if(n == 0) {
        return 1
    } else {
        return n *factorial(n - 1 )
    }
}
fun main(){
    print("Enter the number:")
    val num: Int = readln().toInt()
    println("The factorial of $num is ${factorial(num)}")
}