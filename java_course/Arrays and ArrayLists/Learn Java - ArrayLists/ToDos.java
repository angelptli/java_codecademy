/*
================================================================================
Creating ArrayLists
-------------------
To create an ArrayList, we need to declare the type of objects it will hold,
just as we do with arrays:
/////////////////////////////////
ArrayList<String> babyNames;
/////////////////////////////////

We use angle brackets < and > to declare the type of the ArrayList. These
symbols are used for generics. Generics are a Java construct that allows us to
define classes and objects as parameters of an ArrayList. For this reason, we
can't use primitive types in an ArrayList:
////////////////////////////////
// This code won't compile:
ArrayList<int> ages;

// This code will compile:
ArrayList<Integer> ages;
////////////////////////////////

The <Integer> generic has to be used in an ArrayList instead. You can also use
<Double> and <Char> for types you would normally declare as doubles or chars.

We can initialize to an empty ArrayList using the new keyword:

// Declaring:
ArrayList<Integer> ages;
//Initializing:
ages = new ArrayList<Integer>();

// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();

Instructions
------------
1. Import the ArrayList package from java.util.

2. Create a new ArrayList that will contain String elements and call it
   toDoList.
================================================================================
Adding an Item
--------------
Now we have an empty ArrayList, but how do we get it to store values?

ArrayList comes with an add() method which inserts an element into the
structure. There are two ways we can use add().

If we want to add an element to the end of the ArrayList, we'll call add()
using only one argument that represents the value we are inserting. In this
example, we'll ad objects from the Car class to an ArrayList called carShow:
////////////////////////////////////////////////////////////
ArrayList<Car> carShow = new ArrayList<Car>();

carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagon);
// carShow now holds [ferrari, thunderbird, volkswagon]
////////////////////////////////////////////////////////////

If we want to add an element at a specific index of our ArrayList, we'll need
two arguments in our method call: the first argument will define the index of
the new element while the second argument defines the value of the new element:
///////////////////////////////////////////////////////////////////////////////
// Insert object corvetter at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagon]

// Insert object porsche are index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagon]
///////////////////////////////////////////////////////////////////////////////

By inserting a value at a specified index, any elements that appear after this
new element will have their index value shift over by 1.

Also, note that an error will occur if we try to insert a value at an index
that does not exist.

When using ArrayList methods (like add()), the reference parameters and return
type of a method must match the declared element type of the ArrayList. For
example, we cannot add an Integer type value to an ArrayList of String
elements.

We've discussed how to specify the element type of an ArrayList; however, it is
possible to create an ArrayList that holds values of different types.

In the following snippet, assortment is an ArrayList that can store different
values because we do not specify its type during initialization.
//////////////////////////////////////////////////
ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds "Hello", 12, ferrari]
//////////////////////////////////////////////////

In this case, the items stored in this ArrayList will be considered Objects. As
a result, they won't have acces to some of their methods without doing some
fancy casting. Although this type of ArrayList is allowed, using an ArrayList
that specifies its type is preferred.

Instructions
------------
1. We've created an empty ArrayList called toDoList. Time to add some to-dos!
   Below where we’ve initialized toDo1, initialize two new String variables:
   toDo2 and toDo3. Set their values to any tasks you like.

2. Use .add() to add toDo1, toDo2, and toDo3 to toDoList.
================================================================================
*/
// import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
  
    public static void main(String[] args) {
      
        // Create toDoList below:
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        // Add more to-dos here:


        // Add to-dos to toDoList


        System.out.println(toDoList);
      
    }
    
}