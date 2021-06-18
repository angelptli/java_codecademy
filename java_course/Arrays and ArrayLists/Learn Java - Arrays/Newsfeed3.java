/*
================================================================================
Creating an Empty Array
-----------------------
We can also create empty arrays and then fill the items one by one. Empty
arrays have to initialized with a fixed size:
////////////////////////////////////////
String[] menuItems = new String[5];
////////////////////////////////////////

Once you declare this size, it cannot be changed! This array will always be of
size 5.

After declaring and initializing, we can set each index of the array to be a
different item:
///////////////////////////////////////
menuItems[0] = "Veggie hot dog";
menuItems[1] = "Potato salad";
menuItems[2] = "Cornbread";
menuItems[3] = "Roasted broccoli";
menuItems[4] = "Coffee ice cream";
///////////////////////////////////////

This group of commands has the same effect as assigning the entire array at
once:
///////////////////////////////////////////////////////
String[] menuItems =
{
    "Veggie hot dog", "Potato salad", "Cornbread",
    "Roasted broccoli", "Coffee ice cream"
};
///////////////////////////////////////////////////////

We can also change an item after it has been assigned! Let's say this
restaurant is changing its broccoli dish to a cauliflower one:
////////////////////////////////////////
menuItems[3] = "Baked cauliflower";
////////////////////////////////////////

Now, the array looks like:
["Veggie hot dog", "Potato salad", "Cornbread", "Baked
cauliflower", "Coffee ice cream"]

When we use 'new' to create an empty array, each element of the array is
initialized with a specific value depending on what type the element is:

 Data Type:   | Initialized Value:
 _____________|___________________
 int          |  0
 double       |  0.0
 boolean      |  false
 Reference    |  null

For example, consider the following arrays:
////////////////////////////////////////
String[] my_names = new String[5];
int[] my_ages = new int[5];
////////////////////////////////////////

Because a String is a reference to an Object, my_names will contain five nulls.
my_ages will contain five 0s to begin with.

Instructions
------------
1. We now want a Newsfeed to be able to keep track of a user's top 10 articles.
   We've declared a String array called favoriteArticles, but we haven't
   initialized it yet. In the constructor for Newsfeed, set favoriteArticles to
   be a new empty String array of size 10.

2. Inside the method setFavoriteArticle(), set the value of the favoriteArticles
   array at index favoriteIndex to be the value of newArticle. For example, if
   I called setFavoriteArticle(2, "Celebrity Hands Throughout the Decades"),
   the value of favoriteArticles at index 2 would be set to "Celebrity Hands
   Throughout the Decades".
*/
public class Newsfeed3 {
    
}
