import java.util.Scanner
import javax.lang.model.util.ElementScanner9

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number :")
    var first = input.nextInt()

    println("Enter second number :")
    var second = input.nextInt()

    println("Enter third number :")
    var third = input.nextInt()

    if (first < second && first < third){
        println("$first is the smallest number")
    }
    else if (second < first && second < third) {
        println("$second is the smallest number")
    }
    else{
        println("$third is the smallest number")
    }

}