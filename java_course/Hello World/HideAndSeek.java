/*
================================================================================
Print Statements
----------------
System - a built-in Java class that contains useful tools for our programs
out - is short for "output"
println - is short for "print line"

We can use System.out.println() whenever we want the program to create a
new line on the screen (output terminal) after outputting a value:
//////////////////////////////////////////////////////////
System.out.println("Hello World!");
System.out.println("Today is a great day to code!");
//////////////////////////////////////////////////////////

We also can output information using System.out.print(). Notice that we're
using print(), not println(). Unlike System.out.println(), this type of print
statement outputs everything on the same line. For example:
////////////////////////////////
System.out.print("Hello ");
System.out.print("World");
////////////////////////////////

The above code will have the following output:
///////////////
Hello World
///////////////

In this example, if you were to user print() or println() again, the new text
will print immediately after World on the same line. It's important to remember
where you left your program's "cursor". If you use println() the cursor is
moved to the next line. If you use print() the cursor stays on the same line.

Note: Going forward, all exercises will use System.out.println() to output
values.

Instructions
------------
1. Inside main() and underneath the print statement
   System.out.println("Let's play hide and seek."); output the following two
   statements using System.out.print():
   - "Three..."
   - "Two..."

2. Underneath your previous statements, output the following two text values
   using System.out.println():
   - "One..."
   - "Ready or not, here I come!"
================================================================================
*/
public class HideAndSeek {
    public static void main(String[] args) {
        System.out.println("Let's play hide and seek.");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println("One...");
        System.out.println("Ready or not, here I come!");
    }   
}
