/*
Arithmetic                              : +, -, *, %(Returns the remainder)
Comparison                              : <, >, <=, >=, ==, !=(Not equal to)
                                        The output is a boolean!
Assignment                              : =, +=, -=, *=, /=, %=
                                        Value is assigned to a, after performing the arithmetic operations with b (a += b implies a = a + b)
Increment And Decrement operator        : ++, -- (increase or decrease by 1)

 */

fun main(){
    println(3*5)
    println(3+5)
    println(3-5)
    println(3.0/5)
    println(3%5)    //arithmetic operators

    println(5>9) //comparison operator

    //assignment
    var a = 10
    var b = 20
    a+=b
    println(a)
    a/=b
    println(a)
    a*=b
    println(a)
    a-=b
    println(a)

    //increment and decrement operators
    a=5
    a++
    println(a)
    a=5
    a--
    println(a)

}

