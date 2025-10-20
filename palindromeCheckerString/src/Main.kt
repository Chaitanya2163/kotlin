fun reverseString(str: String): String{
    val reversedString: String = str.reversed()
    return reversedString
}
fun main(){
    print("Enter the string you want to check: ")
    val str1 = readln()
    if(str1 == reverseString(str = str1)){
        println("$str1 is a palindrome")
    } else {
        println("$str1 is not a palindrome")
    }
}