fun main(){
    val i = 10
    print("The value of i is: ")
    println(i)

    // Using string template ($) we don't really have to use 2 print statements

    println("The value of i is: $i")

    // For expressions we use {} along with $,

    val s = "hello this is suryansh"
    println("The length of string s is ${s.length}")

    // if we did not have used string template then
    print("The length of string s is ")
    println(s.length)
}