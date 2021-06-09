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
Scope
-----
A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: {, and }. Everything inside
the curly braces is part of the task. This domain is called the scope of a
method.

We can't access variables that are declared inside a method in code that is
outside the scope of that method.

Looking at the Car class again:
//////////////////////////////////////////////////////////////
class Car {
    String color;
    int milesDriven;

    public Car(String carColor) {
        color = carColor;
        milesDriven = 0;
    }

    public void drive() {
        String message = "Miles driven: " + milesDriven;
        System.out.println(message);
    }

    public static void main(String[] args) {
        Car myFastCar = new Car("red");
        myFastCar.drive();
    }
}
//////////////////////////////////////////////////////////////

The variable message, which is declared and initialized inside of drive, cannot
be used inside of main()! It only exists within the scope of the drive()
method.

However, milesDriven, which is declared at the top of the class, can be used
inside all methods in the class, since it is in the scope of the whole class.

Instructions
------------
1. Inside of the advertise() method, change the productType variable to the
   cookie variable, which is declared in the main() method. This should also
   result in the printout:
   /////////////////////
   Selling cookies!
   /////////////////////
   Right?

2. No! We got an error! The cookie variable cannot be accessed inside of the
   advertise method. The scope is wrong! Change it back to productType:
   /////////////////////////////////////////////////////
   String message = "Selling " + productType + "!";
   /////////////////////////////////////////////////////

3. Inside of the main() method, print the String message, which is declared in
   the advertise() method. This should print:
   /////////////////////
   Selling Cookies!
   /////////////////////
   Right?

4. Foiled again! The message variable only exists inside the scope of the
   advertise() method! Delete the faulty print statement from the main()
   method.
===============================================================================
Adding Parameters
-----------------
What if we had some info in one method that we needed to pass into another
method?

Similar to how we added parameters to constructors, we can customize all other
methods to accept parameters. For example, in the following code, we create a
startRadio() method that accepts a Double parameter, stationNum, and a String
parameter called stationName:
///////////////////////////////////////////////////////////////////////////////
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", "
                + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args) {
        Car myCar = new Car("red");
        myCar.startRadio(103.7, "Meditation Station");
    }
}
///////////////////////////////////////////////////////////////////////////////

Adding parameter values impacts our method's signature. Like constructor
signatures, the method signature includes the method name as well as the
parameter types of the method. The signature of the above method is
startRadio(double, String).

In the main() method, we call the startRadio() method on the myCar object and
provide a double argument of 103.7 and String argument of "Meditation Station",
resulting in the following output:
///////////////////////////////////////////////////////
Turning on the radio to 103.7, Meditation Station!
Enjoy!
///////////////////////////////////////////////////////

Note that when we call on a method with multiple parameters, the arguments
given in the call must be placed in the same order as the paramters appear
in the signature. If the argument types do not match the parameter types, we'll
receive an error.

Through method overloading, our Java programs can contain multiple methods with
the same name as long as each method's parameter list is unique. For example,
we can recreate our above program to contain two startRadio() methods:
////////////////////////////////////////////////////////////////////////////
// Method 1
public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", "
            + station + "!");
    System.out.println("Enjoy!");

// Method 2
public void startRadio(double stationNum) {
    System.out.println("Turning on the radio to " + stationNum + "!");
}

public static void main(String[] args) {
    Car myCar = new Car("red");

    // Calls the first startRadio() method
    myCar.startRadio(103.7, "Meditation Station");

    // Calls the second startRadio() method
    myCar.startRadio(98.2);
}
////////////////////////////////////////////////////////////////////////////

Instructions
------------
1. Add a method to the Store class called greetCustomer(). It should be
   accessible by other classes, and return no output. For now, have it take no
   parameters and leave the body of the method empty.

2. Modify the greetCustomer() method so that it accepts a String parameter
   called customer.

3. Inside of the greetCustomer() mehod, add a print statement to print:
   //////////////////////////////////////////////
   "Welcome to the store, " + customer + "!"
   //////////////////////////////////////////////

4. Inside the main() method, call the greetCustomer() method on the lemonStand
   object. Pass in a String argument of your choice!
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
        // System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + " ! ");
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        // // Call the advertise() method on the lemonadeStand object
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();

        // String cookie = "Cookies";
        // Store cookieShop = new Store(cookie);

        // cookieShop.advertise();
    }
}

