/*
================================================================================
String[] args
-------------
When we write main() methods for our programs, we use the parameter String[]
args. Now that we know about array syntax, we can start to parse what this
means.

A String[] is an array made up of Strings. Examples of String arrays:
///////////////////////////////////////////////////////////////
String[] humans = {"Talesha", "Gareth", "Cassie", "Alex"};
String[] robots = {"R2D2", "Marvin", "Bender", "Ava"};
///////////////////////////////////////////////////////////////

The args parameter is another example of a String array. In this case, the
array args contains the arguments that we pass in from the terminal when we
run the class file. (So far, args has been empty.)

So how can you pass arguments to main()? Let's say we have this class HelloYou:
////////////////////////////////////////////////////
public class HelloYou {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);
    }
}
////////////////////////////////////////////////////

When we run the file HelloYou in the terminal with an argument of "Laura":
////////////////////////
java HelloYou Laura
////////////////////////

We get the output:
///////////////
Hello Laura
///////////////

The String[] args would be interpreted as an array with one element, "Laura".

When we use args[0] in the main method, we can access that element like we did
in HelloYou.

Instructions
------------
1. We want to give the user an option to make a Newsfeed object for robots or
   for humans. We will take either "Robot" or "Human" as an argument to the
   main() method when the Newsfeed.java file is run.

   - If the args array holds "Human", we will initialize the feed with human
     topics.
   - If the args array holds "Robot", we will initialize the feed with robot
     topics.

   Replace the blank in the conditional statement to reflect this expected
   control flow.

2. In the terminal, run the Newsfeed.java file with the argument "Robot".
   Now, run the Newsfeed.java file with the argument "Human".
   //////////////////////////////////////
   $ java Newsfeed Robot
   The topics in this feed are:
   [Oil, Parts, Algorithms, Love]
   $ java Newsfeed Human
   The topics in this feed are:
   [Politics, SCience, Sports, Love]
   //////////////////////////////////////
   
================================================================================
*/
import java.util.Arrays;

public class Newsfeed5 {
  
    String[] topics;
    
    public Newsfeed5(String[] initialTopics) {
  		topics = initialTopics;
    }
    
    public static void main(String[] args) {
  		Newsfeed5 feed;
        if (args[0].equals("Human")) {
        
            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
    	    		feed = new Newsfeed5(humanTopics);
              
            } else if(args[0].equals("Robot")) {
              
                //topics for a Robot feed:
                String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
                feed = new Newsfeed5(robotTopics);
              
            } else {
                String[] genericTopics = {"Opinion", "Tech", "Science",
                                          "Health"};
                feed = new Newsfeed5(genericTopics);
            }
            
        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
