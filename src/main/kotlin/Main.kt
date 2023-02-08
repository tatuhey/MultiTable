/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 4, Task B
    Multiplication Table
 */

fun main(args: Array<String>) {

    print("Enter a number: ")
    val number: Int = readln().toInt()

    for (i in 1..12) {
        var result: Int = number * i
        println("$number X $i = $result")
    }
}