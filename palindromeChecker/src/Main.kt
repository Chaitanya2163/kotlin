fun reverseNum(num: Int): Int{
    var copy = num
    var reversedNum: Int = 0
    while(copy > 0){
        reversedNum = reversedNum*10 + copy%10
        copy /= 10
    }
    return reversedNum
}
fun main(){
    print("Enter the number you want to check: ")
    val num = readln().toInt()
    if(num == reverseNum(num)){
        println("$num is a palindrome")
    } else {
        println("$num is not a palindrome")
    }
}