/*
================================================================================
Commenting Code
---------------
We can also write comments, notes to human readers of our code. These comments
are not executed, so there's no need for valid syntax within a comment.

When comments are short we use the single-line syntax: //.
///////////////////////////////////////////////
// calculate customer satisfaction rating
///////////////////////////////////////////////

When comments are long we use the multi-line syntax: /* and */
/*
We choose to store information across multiple databases to
minimize the possibility of data loss. We'll need to be
careful
to make sure it does not go out of sync!
*/

/*
Another type of commenting option is the Javadoc comment which is represented
by /** */

/*
Javadoc comments are used to create documentation for APIS (Application
Programming Interfaces). When writing Javadoc comments, remember that they will
eventually be used in the documentation that your users might read, so make
sure to be especially thoughtful when writing these comments.

Javadoc comments are typically written before the declaration of fields,
methods, and classes (which we'll cover later in this course):
*/

/**
 * The following class accomplishes the following task...
 */

// Here's how a comment would look in a complete program:

/**
 * The following class shows what a comment would look like in a program.
 */
/*
public class Comment Example {
    // I'm a comment inside the class
    public static void main(String[] args) {
        // I'm a comment inside a main method
        System.out.println("This program has comments!")
    }
}
*/

/*
Comments are different from printing to the screen, when we use
System.out.println(). These comments won't show up in your terminal, they're for
people who read our code in the text editor.
*/

/*
Instructions
------------
1. The file Timeline.java has plain text information about Java. Plain text
   facts aren't valid syntax. We'll use comments to avoid breaking the program.
   Use the single-line comment syntax for the first fact. Change this line into
   a comment:

   Sun Microsystems announced the release of Java in 1995

2. Our program is still broken! Use the multi-line syntax to make these lines
   into a single comment:

    James Gosling is a Canadian engineer who
	created Java while working at Sun Microsystems.
	His favorite number is the square root of 2!
================================================================================
*/
public class Timeline {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        System.out.println("You were born in 1995");

        // Sun Microsystems announced the release of Java in 1995

        System.out.println("You were created by James Gosling");

        /*
        James Gosling is a Canadian engineer who
        created Java while working at Sun Microsystems.
        His favorite number is the square root of 2!
        */

        System.out.println("You are a fun language!");
    }
}
