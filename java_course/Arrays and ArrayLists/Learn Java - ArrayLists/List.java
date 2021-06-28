/*
================================================================================
Review
------
Nice work! You now know the basics of ArrayLists including:
- Creating an ArrayList.
- Adding a new ArrayList item using add().
- Accessing the size of an ArrayList using size().
- Finding an item by index using get().
- Changing the value of an ArrayList item using set().
- Removing an item with a specific value using remove().
- Retrieving the index of an item with a specific value using indexOf().
Now if only there were some way to move through an array or ArrayList, item by
item...

Instructions
------------
We've included a workspace for you to test out your newfound knowledge of
arrays and ArrayLists.

Remember: To run your code, enter the following in the terminal:
////////////////
$ javac List.java
$ java List
////////////////
================================================================================
*/
import java.util.ArrayList;

class List {

    public static void main(String[] args) {
        // Create an ArrayList:
        ArrayList<String> grublist = new ArrayList<String>();
        String grub1 = "water";
        String grub2 = "pancake";
        String grub3 = "buckwheat";

        // Add items to the ArrayList:
        grublist.add(grub1);
        grublist.add(grub2);
        grublist.add(grub3);

        // Find the breakfast item in the ArrayList by index:
        System.out.println(grublist.get(1));

        // Change the value of the non-solid grub item
        // using set():
        grublist.set(0, "ice");

        // Remove the new value:
        grublist.remove(0);

        // Retrieve the index of the breakfast item using indexOf:
        System.out.println(grublist.indexOf("pancake"));
    }
}
