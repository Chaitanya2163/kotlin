/*
fibonacci series:
0,1,1,2,3,5,8,13,21,34,55,89,144...
 */

fun fibonacciSeries(n: Int): Int{
    if(n == 1){
        return 0
    } else if(n == 2){
        return 1
    } else {
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2)
    }
}

fun main(){
    print("Enter the position of element you want the value of in fibonacci series: ")
    val n = readln().toInt()
    println("The value of element in fibonacci series at position $n is ${fibonacciSeries(n)}.")
}