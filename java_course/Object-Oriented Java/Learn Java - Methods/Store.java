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
Reassigning Instance Fields
---------------------------
Earlier, we thought about a Savings Account as a type of object we could
represent in Java.

Two of the methods we need are depositing and withdrawing:
////////////////////////////////////////////////////////////
public SavingsAccount {
    double balance;
    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
    }

    public void deposit(double amountToDeposit) {
        // Add amountToDeposit to the balance
    }

    public void withdraw(double amountToWithdraw) {
        // Subtract amountToWithdraw from the balance
    }

    public static void main(String[] args) {

    }
}
////////////////////////////////////////////////////////////

These methods would change the value of the variable balance. We can reassign
balance to be a new value by using our assignment operator, =, again.
///////////////////////////////////////////////////////////
public void deposit(double amountToDeposit) {
    double updatedBalance = balance + amountToDeposit;
    balance = updatedBalance;
}
///////////////////////////////////////////////////////////

Now, when we call deposit(), it should change the value of the instance field
balance:
/////////////////////////////////////////////////////////////
public static void main(String[] args) {
    SavingsAccount myAccount = new SavingsAccount(2000);
    System.out.println(myAccount.balance);
    myAccount.deposit(100);
    System.out.println(myAccount.balance);
}
/////////////////////////////////////////////////////////////

This code first prints 2000, the initial value of myAccount.balance, and then
prints 2100, which is the value of myAccount.balance after the deposit() method
has run.

Changing instance fields is how we change the state of an object and make our
objects more flexible and realistic.

Instructions
------------
1. We have added a price instance field to the Store class. However, to combat
   inflation costs, we’ve found ourselves increasing the price of our product
   over and over. We’ve added an empty increasePrice() method to the Store
   class. It takes a double parameter priceToAdd. Inside of the increasePrice()
   method, create a variable called newPrice. Declare it to be a double, and
   set it equal to the price plus the priceToAdd.

2. Inside of increasePrice(), set the instance field price to be newPrice!

3. In the main() method, increase the price at the lemonade stand by 1.5. Then,
   print the lemonadeStand.price to see how it has changed!
===============================================================================
Returns
-------
Remember, variables can only exist in the scope that they were declared in.
We can use a value outside of the method it was created in if we return it from
the method.

We return a value by using the keyword return:
/////////////////////////////////
public int numberOfTires() {
    int tires = 4;
    // return statement
    return tires;
}
/////////////////////////////////

This method, called numberOfTires(), returns 4. Once the return statement is
executed, the compiler exits the function. Any code that exists after the
return statement in a function is ignored.

In past exercises, when creating new methods we used the keyword void. Here, we
are replacing void with int, to signify that the return type is an int.

The void keyword (which means "completely empty") indicates that no value is
returned after calling that method.

A non-void method, like numberOfTires() returns a value when it is called. We
can use datatype keywords (such as int, char, etc.) to specify the type of
value the method should return. The return value's type must match the return
type of the method. If the return expression is compatible with the return
type, a copy of that value gets returned in a proces known as return by value.

Unlike void methods, non-void methods can be used as either a variable value or
as part of an expression like so:
//////////////////////////////////////////////
public static void main(String[] args) {
    Car myCar = new Car("red");
    int numTires = myCar.numberOfTires();
}
//////////////////////////////////////////////

Within main(), we called the numberOfTires() method on myCar. Since the method
returns an int value of 4, we store the value in an integer variable called
numTires. If we printed numTires, we would see 4.

We learned how to return primitive values from a method, but what if we wanted
our method to return an object? Returning an object works a little differently
than returning a primitive value. When we return a primitive value, a copy of
the value is returned; however, when we return an object, we return a reference
to the object instead of a copy of it.

Let's create a second class, carLot, that takes in a Car as a parameter and
contains a method which returns a Car object.
////////////////////////////////////////////////////////
class CarLot {

    Car carInLot;

    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }

    public Car returnACar() {
        // return Car object
        return carInLot;
    }

    public static void main(String[] args) {
        Car myCar = new Car("red", 70);
        System.out.println(myCar);
        CarLot myCarLot = new Carlot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}
////////////////////////////////////////////////////////

This code outputs the same memory address because myCar and carInLot have the
same reference value:
////////////////
Car@2f333739
Car@2f333739
////////////////

Instructions
------------
1. We want to have a method that returns the price plus tax. Define a method
   called getPriceWithTax() that is intended to return the price plus the tax.
   It should take in no parameters and return a double. You can leave the body
   of the method empty for now. Note: the code will have an error until we
   return the correct type from the method, which we will do in the next step.

2. Inside the getPriceWithTax() method, create a double variable totalPrice
   that is equal to price + price * 0.08. 0.08 is the tax applied to the price.
   Then, return totalPrice.

3. Inside of main(), set a double variable lemonadePrice to the value returned
   by lemonadeStand.getPriceWithTax().

4. Now, print out lemonadePrice.
===============================================================================
To toString() Method
--------------------
When we print out Objects, we often see a String that is not very hhelpful in
determining what the Object represents. In the last lesson, we saw that when we
printed our Store objects, we would see output like:
///////////////////
Store@6bc7c054
///////////////////
where Store is the name of the object and 6bc7c054 is its position in memory.

This doesn't tell us anything about what the Store sells, the price, or the
other instance fields we've defined. We can add a method to our classes that
makes this printout more descriptive.

When we define a toString() method for a class, we can return a String that
will print when we print the object:
////////////////////////////////////////////////////
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public static void main(String[] args) {
        Car myCar = new Car("red");
        System.out.println(myCar);
    }

    public String toString() {
        return "This is a " + color + " car!";
    }
}
////////////////////////////////////////////////////

When this runs, the command System.out.println(myCar) will print "This is a red
car!", which tells us about the Object myCar.

Instructions
------------
1. In the main() method, print the Objects lemonadeStand and cookieShop. Are
   these printouts helpful in understanding these Objects?

2. Create a toString() method for the Store class. The method signature should
   say that it is public, and that it returns a String. It shouldn’t take in
   any parameters. For now, have it return the String "Store".

3. "Store" isn’t very helpful! What kind of Store is it? Change the toString()
   to return a String that describes this Store object. Your String should look
   like:
   /////////////////////////////////////////////////////
   This store sells productType at a price of price.
   /////////////////////////////////////////////////////
   where productType and price are the values in thsoe instance fields. For
   example, if it was a hat store where hats cost 8, the String would say:
   /////////////////////////////////////////////////////
   This store sells hats at a price of 8.
   /////////////////////////////////////////////////////

4. Look at the printouts again. Are they more helpful now?
===============================================================================
*/
public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // advertise method
    public void advertise() {
        // System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + " ! ");
        // System.out.println(message);
    }

    // greetCustomer method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax() {
        // double totalPrice = price + price * 0.08;
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        // // Call the advertise() method on the lemonadeStand object
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();
        // lemonadeStand.advertise();

        // String cookie = "Cookies";
        // Store cookieShop = new Store(cookie);

        // cookieShop.advertise();

        // // Call the greetCustomer() method on the lemonadeStand object
        // lemonadeStand.greetCustomer("Mr. Anderson");

        // // Increase the price at the lemonade stand by 1.5
        // lemonadeStand.increasePrice(1.5);
        // System.out.println(lemonadeStand.price);

        // // call getPriceWithTax() method on lemonadeStand object
        // double lemonadePrice = lemonadeStand.getPriceWithTax();
        // System.out.println(lemonadePrice);
    }
}

