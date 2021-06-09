/*
.equals()
---------
What if we had two users logging into a site, and we wanted to see if their
usernames were the same?

With objects, such as Strings, we can't use the primitive equality operator.
To test equality with objects, we use a built-in method called .equals(). ==
will work occasionally, but the reason why it sometimes work has to do with
how objects are stored in memory.

For the purposes of this lesson (as well as good practice) remember to use
.equals() instead of == when comparing objects.

To use it, we call it on one String, by using . , and pass in the String to
compare against in parentheses:

String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";
////////////////////////////////////////////////
System.out.println(person1.equals(person2));
// Prints false, since "Paul" is not "John"

System.out.println(person1.equals(person3));
// Prints true, since "Paul" is "Paul"
////////////////////////////////////////////////

Instructions
------------
1. We have three lines from a song in Song.java. First, print out whether
   line1 and line2 are the same.
*/
public class Song {
    public static void main(String[] args){
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

        System.out.println(line1.equals(line2));

        System.out.println(line2.equals(line3));
    }       
}
