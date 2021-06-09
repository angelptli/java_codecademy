/*
===============================================================================
Defining Methods
----------------
If we were to define a checkBalance() method for the SavingsAccount example we
talked about earlier, it would look like the following:
//////////////////////////////////////////////////////////
public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
}
//////////////////////////////////////////////////////////

The first line, public void checkBalance(), is the method declaration. It gives
the program some information about the method:
- public means that other classes can access this method. We will learn more
  about that later in the course.
- The void keyword means that there is no specific output from the method. We
  will see methods that are not void later in this lesson, but for now, all of
  our methods will be void.
- checkBalance() is the name of the method.

Every method has its own unique method signature which is comprised of the
method's name and its parameter type. In this example, the method signature is
checkBalance().

The two print statements are inside the body of the method, which is defined by
the curly braces: { and }.

Anything we can do in our main() method, we can do in other methods! All of the
Java tools you know, like the math and comparison operators, can be used to
make interesting and useful methods.

checkBalance() is considered a non-static method because its signature does not
include the keyword static like the main() method does. We'll learn more about
non-static methods later in this course.

Instructions
------------
1. In between the constructor and the main() method, add a method called
   advertise() to the Store class. It should be accessible by other classes,
   and should have no output. You can leave the body of the method empty.

2. Inside the advertise() method, type two print statements. They should result
   in the printouts:
   /////////////////////////////
   "Come spend some money!"
   "Selling productType!"
   /////////////////////////////
   where productType is replaced with the value in the variable productType.

   However, we're not going to see these Strings printed out yet! We'll see in
   the next exercise how we can make these printouts actually run.
===============================================================================
*/
public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method

    // main method
    public static void main(String[] args) {
        
    }
}
