/*
================================================================================
Java Review: Putting It All Together
------------------------------------
In this lesson, we've started writing our first programs in Java.

We've also learned rules and guidelines for how to write Java:
- Java programs have at least one class and one main() method.
  - Each class represents one real-world idea.
  - The main() method runs the tasks of the program.
- Java comments add helpful context to human readers.
- Java has whitespace, curly braces, and semicolons.
  - Whitespaces is for humans to read code easily.
  - Curly braces mark the scope of a class and method.
  - Semicolons mark the end of a statement.
- Java is a compiled language.
  - Compiling catches mistakes in our code.
  - Compilers transform code into an executable class.

Instructions
------------
1. The text editor holds an empty file names Review.java. Fill it in! Define a
   public class named Review. Use opening and closing curly braces for the scope
   of the class. Remember, no semicolons for classes or methods.

2. This coe produces an error because Java programs need a main() method. Define
   the main() method within the curly braces of the Review class.

3. Inside of the curly braces for the main() method, write:
   ///////////////////////////////////////////////////
   The main method executes the tasks of the class
   ///////////////////////////////////////////////////
   as a single-line comment.

4. Below the comment, write a statement that prints the following:
   /////////////////////////////////////////
   My first Java program from scratch!
   /////////////////////////////////////////
================================================================================
*/
public class Review {
    public static void main(String[] args) {
        // The main method executes the tasks of the class
        System.out.println("My first Java program from scratch!");
    }
}
