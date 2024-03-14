fun main() {
    var languages = arrayOf("kotlin","Javascript", "Python", "c++", "swift")
    println( languages[1])

    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //looping through an array
    for (lang in languages){
        println(lang)
    }

    //determining whether an element exists or not
    if ("PHP" in languages){
        println("It exists")
    }
    else {
        println("It is not")
    }
}