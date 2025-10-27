
fun calculateGCD(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}

fun calculateLCM(a: Int, b: Int): Int {
    if(a == 0 || b == 0) {
        return 0
    } else {
        return a * b/calculateGCD(a,b)
    }
}

fun main(){
    print("Enter 1st no.: ")
    val a: Int = readln().toInt()
    print("Enter 2nd no.: ")
    val b: Int = readln().toInt()
    val lcm: Int = calculateLCM(a,b)
    val hcf: Int = calculateGCD(a,b)
    println("The lcm is $lcm and HCF is $hcf")
    if(hcf == 1){
        println("$a and $b are co-prime numbers")
    } else {
        println("$a and $b are not co-prime numbers")
    }
}