/*
Multiplication and Division
---------------------------
Division has different results with integerse. The / operator does integer
division, which means that any remainder is lost.
///////////////////////////////////////////////////////////////
int evenlyDivided = 10 / 5;
//evenlyDivided holds 2, because 10 divided by 5 is 2
int unevenlyDivided = 10 / 4;
//unevenlyDivided holds 2, because 10 divided by 2 is 2.5
///////////////////////////////////////////////////////////////

evenlyDivided stores what you expect, but unevenlyDivided holds 2 because ints
cannot store decimals! It's important to note that the int doesn't round the
decimal, but floors it. Java removes the 0.5 to fit the result into an int type!

It's important to note that if we try to divide any number by 0, we will get an
ArtihmeticException error as a result.

Instructions
------------
1. In main(), there is a variable called subtotal, which represents the
   subtotal of an amount to pay on a bill, and a variable called tax, which
   represents the amount of tax added to the subtotal. Create a double variable,
   total, that holds subtotal plus the product of subtotal and tax. Print the
   total variable!
*/
public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;

        double total = subtotal + (subtotal * tax);
        System.out.println(total);

        double perPerson = total / 4;
        System.out.println(perPerson);
    }
}
