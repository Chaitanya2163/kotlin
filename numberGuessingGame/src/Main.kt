import kotlin.random.Random

fun main(){
    val numberToBeGuessed = Random.nextInt(0,101)
    var tries: Int = 0
    var flag: Boolean = false
    print("How many tries do you want: ")
    val numberOfTries: Int = readln().toInt()
    println("Guess the number between 0 and 100 in $numberOfTries tries")
    while (tries < numberOfTries) {
        println("Enter your guess:")
        val guess: Int? = readln().toIntOrNull()
        if(guess == null){
            println("Invalid input")
            continue
        }
        if(guess == numberToBeGuessed){
            flag = true
            break
        } else if(guess < numberToBeGuessed){
            println("Your guess is less than the number")
        } else {
            println("Your guess is more than the number")
        }
        tries++
    }
    if(flag){
        println("THE NUMBER WAS $numberToBeGuessed")
        println("YOU WON THE GAME!!")
    } else {
        println("THE NUMBER WAS $numberToBeGuessed")
        println("BETTER LUCK NEXT TIME!!")
    }
}