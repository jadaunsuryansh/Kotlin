/*
FUNCTION: Collection of code that returns some result.
SYNTAX: (Block Body)
fun functionName(arg1:type1, arg2:type2, ...): ReturnType {
    lines of code
    return result

Arguments: data that a function needs to use.
ReturnType: expected datatype of the result
 */

import kotlin.math.max
fun main(){
               //calling a function
    expressionBodyNewFunction()     //calling a function
    println(timesTwo(56))
    println(timesTwoExpression(67))

    println(maximum(34,546))
}


/*
No arguments used as no data is used by the function.
No ReturnType but Unit
No return statement is used because we are not returning anything.

Unit: When a fun does not return any meaningful result, default datatype of any function.
 */

/*
Expression body: Another syntax
fun functionName(arg1: Type1, arg2: Type2, ...): ReturnType = expression
 */

fun expressionBodyNewFunction() = println("I am your new function.")

/*
Calling / Invoking a function
    calling the new function inside the main function
    write the function name and pass the arg. in ()
    user defined functions
 */

fun timesTwo(x:Int): Int {
   // val output = x * 2
   // return output
    return x*2
}

fun timesTwoExpression(x:Int): Int = x*2

//Write a functions which compares two numbers and returns the maximum of the two
fun maximum(a: Int, b:Int): Int = max(a,b)
//this max function is usable because we imported the module kotlin.math.max
