/*
String Concatenation
--------------------
Let's say we want to print out a variable, and we want to describe it as we
print it out. For our bank account example, imagine we want to tell the user:
///////////////////////////////
Your username is <username>
///////////////////////////////

With the value of the variable username displayed.

The + operator, which we used for adding numbers together, can be used to
concatenate Strings. In other words, we can use it to join two Strings together!
////////////////////////////////////////////////////////
String username = "PrinceNelson";
System.out.println("Your username is: " + username);
////////////////////////////////////////////////////////

This code will print:
///////////////////////////////////
Your username is: PrinceNelson
///////////////////////////////////

We can even use a primitive datatype as the second variable to concatenate, and
Java will intelligently make it a String first:
////////////////////////////////////////////////////
int balance = 10000;
String message = "Your balance is: " + balance;
System.out.println(message);
////////////////////////////////////////////////////

This code will print:
///////////////////////////
Your balance is: 10000
///////////////////////////

Instructions
------------
1. In our zoo, we have a certain number of animals. stored in animals, of a
   certain species, stored in species. Use + to make a new string variable
   called zooDescription. It should hold a String that looks like:
   //////////////////////////////////////
   Our zoo has <animals> <species>s!
   //////////////////////////////////////

   For example, if we had 5 animals that were all of the species Masai Giraffe,
   the String would say:
   //////////////////////////////////
   Our zoo has 5 Masai Giraffes!
   //////////////////////////////////

2. Print out the variable zooDescription!
*/
public class Zoo {
    public static void main(String[] args) {
        int animals = 12;
        String species = "zebra";

        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        System.out.println(zooDescription);
    }
    
}
