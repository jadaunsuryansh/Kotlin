/*
Increment And Decrement operator (++,--)
Increase or decrease by 1

Postfix and prefix increment and decrement operator
a++ : the original value of a is returned first; then a is incremented by 1.
++a : the value of a is incremented by 1; then it returns the value.
*/


fun main(){
    var a = 5
    println(a++) //the value of a returned is 5 only
    //before coming to the next line a is incremented
    // a=6
    println(++a) // a = 7, the returned value is incremented

    a = 10
    println(++a)
    println(a++)
    print(a) // a=12

}