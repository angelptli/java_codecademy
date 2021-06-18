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
*/
public class Newsfeed2 {
  
  
    public Newsfeed2() {
      
    }
    
    // Create getTopics() below:
    
  
    public static void main(String[] args) {
        Newsfeed2 sampleFeed = new Newsfeed2();
        /*
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
        */
    }
  }  
