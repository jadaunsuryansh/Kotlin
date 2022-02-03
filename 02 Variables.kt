/*
Value(val) && Variable(var)
Immutable       Mutable

Statically typed language

Data types: int   double   bool   'char'  "string"   float

val a = 0.1 --> double {default} --> 15 decimals (High precision)
val a = 0.1f --> float           --> 6 decimals

 */

fun main(){
    val a = 3.1452
    val b = 3.152f
    var c = 56

    // a=b*c WRONG because a is a value and its assigned value cannot be changed.
    // c = c + a*b also wrong because the variable types do not match
    c = (c + a*b).toInt() // this converts the result into an integer

    println(c)
}