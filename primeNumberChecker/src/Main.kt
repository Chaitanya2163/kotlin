fun main(){
    print("Enter the number you want to check: ")
    val num = readln().toInt()
    var flag: Boolean = true
    for(i in 2..(num) / 2){
        if(num % i == 0) {
            flag = false
            break
        } else {
            flag = true
        }
    }
    if(flag == true){
        println("$num is a prime number")
    } else {
        println("$num is not a prime number")
    }
}