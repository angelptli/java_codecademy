/*
================================================================================
Compilation: Catching Errors
----------------------------
Java is a compiled programming language, meaning the code we write in a .java
file is transformed into byte code by a compiler before it is executed by the
Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages
into other programming languages that computers can execute.

Previous exercises have automatically compiled and run the files for you.
Off-platform development environments can also compile and run files for you,
but it's important to understand this aspect of Java development so we'll do it
ourselves.

The compiling process catches mistakes before the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code
that does not pass these checks will not be compiled.

This exercise will use an interactive terminal. Codecademy has a lesson on the
command line if you'd like to learn more.

For example, with a file called Plankton.java, we could compile it with the
terminal command:
/////////////////////////
$ javac Plankton.java
/////////////////////////

A successful compilation produces a .class file:
Plankton.class, that we execute with the terminal command:
////////////////////
$ java Plankton
////////////////////

An unsuccessful compilation produces a list of errors. No .class file is made
until the errors are corrected and the compile command is run again.

Instructions
-----------
1. Let's practice compiling and executing a file by entering commands in the
   terminal! Our text editor contains a broken program so we can see how
   compilers help us catch mistakes. Don't make any corrections! In the
   terminal, type this command: javac Compiling.java and press enter or return.
   Then click the Check Work button to check your work and move on the next
   checkpoint.

2. Do you see the error? The compiler is telling us one of the print statements
   is missing a semicolon. In the terminal, type ls and press return or enter.
   ls is short for "list" and this command lists all the available files. There
   is only one file: Compiling.java, we did not successfully compile the file
   because of the error. Click the Check Work button to move on to the next checkpoint.

3. Add the missing semicolon in the text editor, then click the Check Work
   button. We'll compile and execute the file in the next exercise!
================================================================================
Compilation: Creating Executables
---------------------------------
Compilation helped us catch an error. Now that we've corrected the file, let's
walk through a successful compilation. As a reminder, we can compile a .java
file from the terminal with the command:
////////////////////////
$ javac Whales.java
////////////////////////

If the file compiles successfully, this command produces an executable class:
FileName.class. Executable means we can run this program from the terminal.

We run the executable with the command:
/////////////////
$ java Whiles
/////////////////

Note that we leave off the .class part of the filename.

Here's a full compilation cycle as an example:
//////////////////////////////////////////////////////////////////////////
// within the file: Welcome.java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Codecademy's Java course!");
    }
}
//////////////////////////////////////////////////////////////////////////

We have one file: Welcome.java. We compile with the command:
//////////////////////////
$ javac Welcome.java
//////////////////////////

The terminal shows no errors, which indicates a successful compilation.

We now have two files:
1. Welcome.java, our original file with Java syntax.
2. Welcome.class, our compiled file with Java bytecode, ready to be executed by
   the JVM.

We can execute the compiled class with the command:
//////////////////
$ java Welcom
//////////////////

The following is printed to the screen:
//////////////////////////////////////////
Welcome to Codecademy's Java course!
//////////////////////////////////////////

Instructions
------------
1. Let's compile and execute our program! Run the ls command in the terminal to
   see the uncompiled .java file.
   //////////////////////////////////////////////////////////////////
   C:\Codecademy\java_course>dir
      
   06/03/2021  03:38 PM    <DIR>          .
   06/03/2021  03:38 PM    <DIR>          ..
   06/03/2021  03:36 PM             2,688 Compiling.java
   06/03/2021  02:26 PM             1,740 HelloWorld.java
   06/03/2021  02:26 PM               377 HelloYou.java
   06/03/2021  02:53 PM             2,098 HideAndSeek.java
   06/03/2021  02:53 PM             1,962 LanguageFacts.java
   06/03/2021  02:53 PM             3,002 Timeline.java
                  6 File(s)         11,867 bytes
                  2 Dir(s)  383,117,295,616 bytes free

    //////////////////////////////////////////////////////////////////

2. Compile the file from the terminal!
   ///////////////////////////////////////////////////
   C:\Codecademy\java_course>javac Compiling.java
   ///////////////////////////////////////////////////

3. Enter ls again to see the new .class file. Run the executable file from the
   terminal!
   ////////////////////////////////////////////////////////////////
   C:\Codecademy\java_course>dir
    Volume in drive C has no label.
    Volume Serial Number is 3294-BFBD
   
    Directory of C:\Codecademy\java_course
   
   06/03/2021  03:47 PM    <DIR>          .
   06/03/2021  03:47 PM    <DIR>          ..
   06/03/2021  03:47 PM               590 Compiling.class
   06/03/2021  03:50 PM             5,721 Compiling.java
   06/03/2021  02:26 PM             1,740 HelloWorld.java
   06/03/2021  02:26 PM               377 HelloYou.java
   06/03/2021  02:53 PM             2,098 HideAndSeek.java
   06/03/2021  02:53 PM             1,962 LanguageFacts.java
   06/03/2021  02:53 PM             3,002 Timeline.java
                  7 File(s)         15,490 bytes
                  2 Dir(s)  383,119,798,272 bytes free
   
   C:\Codecademy\java_course>java Compiling
   Java is a class-based language.
   Java classes have a 'main' method.
   Java statements end with a semicolon.
   Programming is... fun!
   
   ////////////////////////////////////////////////////////////////
================================================================================
*/
public class Compiling {
    public static void main(String[] args) {
    
        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.");
        System.out.println("Programming is... fun!");
    
    }
}
