/*
================================================================================
Introduction to Java
--------------------
Here is a block comment:

What is happening in the code below?
------------------------------------
Inside HelloWorld.java, we have a class:
/////////////////////////////
public class HelloWorld {

}
/////////////////////////////
We'll talk about classes more in the future, but for now think of them as
a single concept.

The HelloWorld concept is: Hello World Printer. Other class concepts could
be: Bicycle, or: Savings Account.

We mark the domain using curly braces : {}. Syntax inside the curly braces is
part of the class.

Each file has one primary class named after the file. Our class name:
HelloWorld and our file name: HelloWorld. Every word is capitalized.

Inside the class we had a main() method which lists our program tasks:
//////////////////////////////////////////////
public static void main(String[] args) {

}
//////////////////////////////////////////////
Like classes, we used curly braces to mark the beginning and end of a method.

public, static, and void are syntax we'll learn about in future lessons.
Strings[] args is a placeholder for information we want to pass into our
program. This syntax is necessary for the program to run but more advanced than
we need to explore at the moment.

Our program also displayed the text "Hello World!" on the screen. This was
accomplished using a print statement:
/////////////////////////////////////////
System.out.println("Hello World!");
/////////////////////////////////////////

We'll learn more about print statements in the next exercise!
================================================================================
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
