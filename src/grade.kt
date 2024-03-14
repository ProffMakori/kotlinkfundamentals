import java.util.*

//Main Function , Entry point of Program
fun main(args: Array<String>) {

    //array of subjects Names
    val subjectName = arrayOf<String>("Hindi", "English", "Physics", "Chemistry", "Maths")

    //Input Stream
    val scanner = Scanner(System.`in`)

    //Declare Array to Contain Subjects marks
    val marksArray = DoubleArray(5)

    //Start Input Subjects Marks
    println("Input Marks->")
    for (i in marksArray.indices) {
        print("${subjectName[i]} : ")
        marksArray[i] = scanner.nextDouble()
    }

    //Calculate Total Marks in All Subjects
    val total = marksArray.sum()

    //Calculate Percentage
    val percentage = marksArray.average()

    //Print Total and Percentage
    println("Total of All subjects Marks : $total")
    println("Percentage : $percentage")


    //To find out Grade based on Percentage
    when {
        percentage > 80 -> println("Grade : A")
        percentage > 60 -> println("Grade : B")
        percentage > 40 -> println("Grade : C")
        else -> println("Grade : D")
    }
}