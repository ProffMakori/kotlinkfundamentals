fun main() {
    //While loop
    var number = 200
    while (number <= 205) {
        println("Number is $number")
        number++
    }

    //Decrement
    var y = 100
    while (y >= 95){
        println("Counter is $y")
        y--
    }

    //Do...while loop
    var num = 20
    do{
        println(num)
        num++
    }while (num <= 25)

    //For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(10,20,30,45,56,)
    for ( n in marks) {
        println("Mark is $n")
    }

    //Range
    for  (number in 30..35 ){
        println(number)
    }

    for (letter in 'a'..'g'){
        println(letter)
    }
}