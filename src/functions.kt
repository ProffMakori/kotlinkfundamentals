fun main() {
    //Predefined Function
    println("Hello Kotlin")


    var x = Math.min(45,78)
    println(x)

    var y = Math.max(456,897)
    println("The maximum value is $y")

    var z = Math.round(45.89)
    println(z)

    //calling predefined functions
    name()
    product( 12,46)
    product( 7,5)
    details("Joe",56)
}

//User defined function
fun name(){
    println("James")
}

fun product(num1: Int, num2:Int) {
    println(num1*num2)
}

fun details(name:String,age:Int){
    println("$name is $age old")
}