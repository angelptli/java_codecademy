/*
================================================================================
If-Then Statement
-----------------
The if-then statement is the most simple control flow we can write. It tests an
expression for truth and executes some code based on it.
///////////////////////////////////////
if (flip == 1) {
    System.out.println("Heads!");
}
///////////////////////////////////////
- The if keyword marks the beginning of the conditional statement, followed by
  parentheses ().
- The parentheses hold a boolean datatype.

For the condition in parentheses we can also use variables that reference a
boolean, or comparisons that evalaute to a boolean.

The boolean condition is followed by opening and closing curly braces that
mark a block of code. This block runs if, and only if, the boolean is true.
//////////////////////////////////////////////////////////////
boolean isValidPassword = true;

if (isValidPassword) {
    System.out.println("Password accepted!");
}

// Prints "Password accepted!"
int numberOfItemsInCart = 9;
if (numberofItemsInCart > 12) {
    System.out.println("Express checkout not available");
}
// Only "Password accepted!" is printed
//////////////////////////////////////////////////////////////

If a conditional is brief we can omit the curly braces entirely:
////////////////////////////////////////////////////////////////
if (true) System.out.println("Brevity is the soul of wit");
////////////////////////////////////////////////////////////////

Note: Conditional statements do not end in a semicolon

Instructions
------------
1. The code editor contains an Order class to track retail shipments. Write an
if-then statement that prints "High value item!" when itemCost is greater than
24.00.
================================================================================
IF-Then-Else
------------
We've seen how to conditionally execute one block of code, but what if there
are two possible blocks of code we'd like to execute?

Let's say if a student has the required prerequisite, then they enroll in the
selected course, else they're enrolled in the prerequisite course instead.

We create an alternate conditional branch with the else keyword:
//////////////////////////////////
if (hasPrerequisite) {
    // Enroll in course
} else {
    // Enroll in prerequisite
}
//////////////////////////////////

This conditional statement ensures that exactly one code block will be run. If
the condition, hasPrerequisite, is false, the block after else runs.

There are now two separate code blocks in our conditional statement. The first
block runs if the condition evaluates to true, the second block runs if the
conditional evaluates to false.

This cose is also called and if-then-else statement:
- If condition is true, then do something.
- Else, do a different thing.

Instructions
------------
1. In the code editor, there is an isFilled value, that represents whether the
   order is ready to ship. Write an if-then-else statement that:
   - When isFilled is true, print "Shipping".
   - When isFilled is false, print "Order not ready".
================================================================================
*/
public class Order {
    public static void main(String[] args) {
        // double itemCost = 30.99;

        // // Write an if-then statement:
        // if (itemCost > 24) System.out.println("High value item!");

        boolean isFilled = false;

        // Write an if-then-else statement:
        if (isFilled == true) System.out.println("Shipping");
        else System.out.println("Order not ready");
    }
}
