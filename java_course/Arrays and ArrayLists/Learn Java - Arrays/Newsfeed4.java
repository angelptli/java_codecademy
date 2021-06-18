/*
================================================================================
Length
------
What id we have an array stoing all the usernames for our program, and we want
to quickly see how many users we have? To get the length of an array, we can
access the length field of the array object:
//////////////////////////////////////////
String[] menuItems = new String[5];
System.out.println(menuItems.length);
//////////////////////////////////////////

This command would print 5, since the menuItems array has 5 slots, even though
they are all empty.

Instructions
------------
1. In the method getNumTopics(), return the length of the topics array.
================================================================================
*/
// import java.util.Arrays;

public class Newsfeed4 {
  
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    
    public Newsfeed4() {
  
    }
      
    public String[] getTopics() {
        return topics;
    }
    
    public int getNumTopics() {
        return topics.length;
    }
    
    public static void main(String[] args) {
        Newsfeed4 sampleFeed = new Newsfeed4();
        
        System.out.println("The number of topics is "
                           + sampleFeed.getNumTopics());
     
    }
}
