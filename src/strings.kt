fun main() {
    var greeting = "Hello world"
    var firstname = "Glory"
    var lastname = "eMobilis"

    //String concatenation
    println(firstname + " " +lastname)
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greeting[6])

    //determine an index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string
    println(greeting.uppercase())

    //string interpolation
    println("Hello there,my name is $firstname $lastname")


}