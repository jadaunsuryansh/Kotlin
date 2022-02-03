fun main(){
    /* order of precedence
    1. Postfix                  ++,--
    2. Prefix                   ++,--
    3. Multiplicative           *,/,%
    4. Additive                 +,-
    5. Comparison               <,>,<=,>=
    6. Equality                 ==
    7. Assignment               =,+=,-=,/=,%=,*=
    */

    var x=20
    val y=30
    val z=40
    x += z *  y
    println(x)

    // Multiplication will occour 1st, So x = x + (y * z)
}