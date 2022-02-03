/*
STRING FUNCTIONS
-------------------------------------------------------------------------------------------------------------
length(): Returns the length of the string.

get(index): Returns the character at specific index specified within the brackets.

subSequence(startIndex,endIndex): Returns the substring between the startIndex and the endIndex but excluding the endIndex

compareTo: Compares this object with the specified object for order.
           Returns zero if this object is equal to the specified other object,
           a negative number if it's less than other, or a positive number if it's greater than other.

equals: Indicates whether some other object is "equal to" this one.

hashcode: Returns a hash code value for the object.

plus: Returns a string obtained by concatenating this string with the string representation of the given other "object".

toString: Returns a string representation of the object.

lastIndex: Returns the index of the last character in the char sequence or -1 if it is empty.

indexOf: Returns the index within this string of the first occurrence of the specified character, starting from the specified startIndex.
         Parameters:
         string: String,
         startIndex: Int = 0,
         ignoreCase: Boolean = false
 */

fun main(){
    val a = "Hello "
    val b = "this is Suryansh"
    val c = " And my age is "
    val d = 18
    val e = 25

    println("The length of the string a is ${a.length}")
    println("The length of the string b is ${b.length}")
    println("The length of the string c is ${c.length} \n")

    println("The character at index 4 of a is ${a.get(4)}")
    println("The character at index 8 of b is ${b[8]}")
    println("The character at index 10 of c is ${c[10]} \n")
    // a.get(x) can be replaced with a[x] for calling the character at index x of a

    println(a.subSequence(2,5))
    // H e l l o
    // 0 1 2 3 4 5
    println(b.subSequence(4,12))
    // t h i s   i s   S u r  y  a  n  s  h
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    println(c.subSequence(6,13))
    println("")

    println("when a is compared to b ${a.compareTo(b)}")
    // -ve number => a is less than b
    println("when e is compared to d ${e.compareTo(d)} \n")
    // +ve number => e>d

    println("Whether a is equal to b or not ${a.equals(b)}")
    println("Whether d is equal to e or not ${e==d} \n")

    println("the hash code value of string a is ${a.hashCode()}")
    println("the hash code value of string b is ${b.hashCode()}")
    println("the hash code value of string c is ${c.hashCode()} \n")

    println(a.plus(b).plus(c).plus(d))
    println(a + b + c + d)

    println("Hello ${b.toString()} \n")

    println("the index of the last character in a is ${a.lastIndex}")
    println("the index of the last character in b is ${b.lastIndex}")
    println("the index of the last character in c is ${c.lastIndex} \n")

    println("the index of l in a is ${a.indexOf('l')} \n")

}