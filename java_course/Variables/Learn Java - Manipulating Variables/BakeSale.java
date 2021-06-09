/*
Compound Assignment Operators
-----------------------------
Sometimes, we need to adjust the value of a variable.

We can use compound assignment operators for all the arithmetic operators we've
covered:
- Addition (+=)
- Subtraction (-=)
- Multiplication (*=)
- Division (/=)
- Modulo (%=)

Instructions
------------
1. You are also in charge of keeping track of how many cookeis there are at
   the bake sale. This value is represented by the variable numCookies. A
   customer comes and buys 3 cookies. Use the appropriate compound assignment
   operator to reflect this change.

2. Another cutomer buys half of the remaining cookies. Use the appropriate
   compound assignment operator to reflect this change.
*/
public class BakeSale {
    public static void main(String[] args) {
        int numCookies = 17;

        numCookies -= 3;
        numCookies /= 2;

        // Add your code above
        System.out.println(numCookies);
    }
}
