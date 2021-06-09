/*
================================================================================
Introduction
------------
Let's say we need a program that connects a user with new jobs. We need the
user's name, salary, and employment status. All of these pieces of info are
stored in our program.

We store info in variables, named locations in memory.

Naming a piece of info allows us to use that name later, accessing the info we
stored.

Variables also give context and meaning to the data we're storing. The value 42
could be someone's age, a weight in pounds, or the number of orders placed. With
a name, we know the value 42 is age, weightInPounds, or numOrdersPlaced.

In Java, we specify the type of info we're storing. Primitive datatypes are
types of data built-in to the Java system. The three main primitive types we'll
cover are int, double, and boolean; this lesson will introduce these built-in
types and more.

We must declare a variable to reference it within our program. Declaring a
variable requires that we specify the type and name:
/////////////////////////////
// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
/////////////////////////////

The names of the variables above are age, salaryRequirement, and isEmployed.

These variables don't have any associate value. To assign a value to a variable,
we use the assignment operator =:
/////////////
age = 85;
/////////////

Now, age has a value of 85. When code is used to represent a fixed value, like
85, it is referred to as a literal.

It's also common to declare a variable and assign it a value in one line!

For example, to assign 2011 to a variable named yearCodecademyWasFounded of
type int, we write:
/////////////////////////////////////////
int yearCodecademyWasFounded = 2011;
/////////////////////////////////////////

Instructions
------------
1. In Creator.java, we have defined some variables related to James Gosling, the
   creator of Java. Inside main(), use System.out.println() to print out the
   variable name.

2. Use the same command to rint out yearCreated.
================================================================================
*/
public class Creator {
    public static void main(String[] args) {
        String name = "James Gosling";
        int yearCreated = 1995;
        System.out.println(name);
        System.out.println(yearCreated);
    }    
}
