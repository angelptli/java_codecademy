/*
================================================================================
substring()
-----------
There may be times when we only want a part of a string. In such cases, we may
want to extract a substring from a string.

The substring() method does exactly that. For example:
/////////////////////////////////////////////////////////////////
String line = "The Heav'ns and all the Constellations rung"

System.out.println(line.substring(24));
/////////////////////////////////////////////////////////////////

It would output Cnstellations rung because that's what begins at index 24 and
ends at the end of line. The substring begins with the character at the
specified index and extends to the end of the string.

But suppose we want a substirng from the middle of the string. We can include
two arguments with this string method. For example:
/////////////////////////////////////////////////////////////////
String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(14, 38));
/////////////////////////////////////////////////////////////////

It would output Constellations because that's the substring that begins at
index 24 and ends at index 38.

We can use this method to return a single-element substring at a specific index
by calling substring() with the wanted index value as the first argument and
then the index value plus one as the second argument.

For example, we can use this method to output just C:
//////////////////////////////////////////////////////////////////
String line = "The Heav'ns and all the Constellations rung";
 
System.out.println(line.substring(24, 25));
// Prints: C
//////////////////////////////////////////////////////////////////

Instructions
------------
1. Change the arguments of the line.substring() method so that it prints out
   Heav'ns instead.
================================================================================
*/
public class Poetry {
  
	public static void main(String[] args) {
      
        String line = "The Heav'ns and all the Constellations rung";     
        // Change the arguments:
        System.out.println(line.substring(4, 11));
    
    }
  
}