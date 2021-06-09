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
Calling Methods
---------------
When we add a non-static method to a class, it becomes available to use on an
object of that class. In order to have our methods get executed, we must call
the method on the object we created.

Let's add a non-static startEngine() method to our Car class from the previous
lesson. Inside the main() method, we'll call startEngine() on the myFastCar
object:
///////////////////////////////////////////////////////////
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public void startEngine() {
        System.out.println("Starting the car!");
        System.out.println("Vroom!");
    }

    public static void main(String[] args) {
        Car myFastCar = new Car("red");
        // Call a method on an object
        myFastCar.startEngine();
        System.out.println("That was one fast car!");
    }
}
///////////////////////////////////////////////////////////

Let's take a closer look at the method call:
///////////////////////////
myFastCar.startEngine()
///////////////////////////

First, we reference our object myFastCar. Then, we use the dot operator (.) to
call the method startEngine(). Note that we must include parentheses () after
our method name in order to call it.

If we run the above program, we will get the following output.
/////////////////////////
Starting the car!
Vroom!
That was on fast car!
/////////////////////////

Code generally runs in a top-down order where code execution starts at the top
of a program and ends at the bottom of a program; however, methods are ignored
by the compiler unless they are being called.

When a method is called, the compiler executes every statement contained within
the method. Once all method instructions are executed, the top-down order of
execution continues. This is why "Starting the car!" and "Vroom!" are outputted
before "That was one fast car!".

Instructions
------------
1. Last exercise, we defined a new method, advertise(), but we didn’t actually
   see it run. We now have a Store class with advertise() defined. Call the
   advertise() method on the lemonadeStand object in the main() method and see
   what the output is!

2. Now, call the advertise() method on the lemonadeStand object two more times.
   It should be called in the main() method three times total.
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
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + " ! ");
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        // Call the advertise() method on the lemonadeStand object
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
