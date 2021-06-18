/*
================================================================================
Creating an Array Explicity
---------------------------
Imagine that we're using a program to keep track of the prices of different
clothing items we want to buy. We would want a list of the prices and a list of
the items they correspond to. To create a array, we first declare the type of
data it hold:
/////////////////////
double[] prices;
/////////////////////

Then, we can explicitly initialize the array to contain the data we want to
store:
///////////////////////////////////////////
prices = {13.15, 15.87, 14.22, 16.66};
///////////////////////////////////////////

Just like with simple variables, we can declare and initialize in the same
line:
////////////////////////////////////////////////////
double[] prices = {13.15, 15.87, 14.22, 16.66};
////////////////////////////////////////////////////

We can use arrays to hold String types and other objects as well as primitive
types:
///////////////////////////////////////////////////////////////////////////////
String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};
///////////////////////////////////////////////////////////////////////////////

Instructions
------------
1. We have an empty Newsfeed class that does not store anything yet. First,
   make a method called getTopics(), which:
   - is public
   - returns a String array
   - does not take any parameters
   For now, leave the method empty.

2. Inside the getTopics() method, create a String array called topics and set
   it equal to an array containing these elements, in order:
   /////////////
   Opinion
   Tech
   Science
   Health
   /////////////
   Then, return topics from the method!

3. Uncomment the lines in the main method to see how the getTopics() method
   works on a Newsfeed instance.
================================================================================
Importing Arrays
----------------
When we printed out the array we created in the last exercise, we saw a memory
address that did not help use understand what was contained in the the array.

If we want to have a more descriptive printout of the array itself, we need a
toString() method that is provided by the Arrays package in Java.
////////////////////////////
import java.util.Arrays;
////////////////////////////

We put this at the top of the file, before we even define the class!

When we import a package in Java, we are making all of the methods of that
package available in our code.

The Arrays package has many useful methods, including Arrays.toString(). When
we pass an array into Arrays.toString(), we can see the contents of the array
printed out:
/////////////////////////////////////////////////////////////////////
import java.util.Arrays;

public class Lottery() {
    public static void main(String[] args) {
        int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
        String betterPrintout = Arrays.toString(lotteryNumbers);
        System.out.println(betterPrintout);
    }
}
/////////////////////////////////////////////////////////////////////

This code will print:
///////////////////////////
[4, 8, 15, 16, 23, 42]
///////////////////////////

Instructions
------------
1. In order to make our printout of the topics array more helpful, we are going
   to want to use the toString() method from the Arrays package. To use it, we
   first must import the Arrays package from java.util. Import the package at
   the top of the Newsfeed.java file.

2. Now that you have the Arrays package, use its toString() method to print out
   the topics array in the main() method.
================================================================================
*/
//  import the Arrays package here:


public class Newsfeed2 {
  
    public Newsfeed2() {
      
    }
    
    // Create getTopics() below:
    public String[] getTopics() {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }
  
    public static void main(String[] args) {
        Newsfeed2 sampleFeed = new Newsfeed2();
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        
    }
  }  
