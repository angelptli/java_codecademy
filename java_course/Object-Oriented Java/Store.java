/*
===============================================================================
Introduction to Classes
-----------------------
All programs require one or more classes that act as a model for the world.

For example, a program to track student test scores might have Student, Course,
and Grade classes. Our real-world concerns, students and their grades, are
inside the prorgam as classes.

We represent each student as an instance, or object, of the Student class.

This is object-oriented programming because programs are built around objects
and their interactions. An object contains state and behavior.

Classes are a blueprint for objects. Blueprints detail the general structure.
For example, all students have an ID, all courses can enroll a student, etc.

An instance is the thing itself. This student has an ID of 42, this course
enrolled that student, etc.

Let's review with another example, a savings account at a bank.

What should a savings account know?
- The balance of money available. (Field/state: balance)

What should a savings account do?
- Deposit money. (Method/behavior: deposit)
- Withdraw money. (Method/behavior: withdraw)

Imagine two people have accounts that are instances of the SavingsAccount
class. They share behavior (how they deposit and withdraw) but have individual
state (their balances), and even with the same balance amount these accounts
are separate entities.

Instructions
------------
Our text editor contains a complete class definition that we'll build up as we
progress through the lesson.

Run the code to see it in action.
===============================================================================
Classes: Syntax
---------------
The fundamental concept of object-oriented programming is the class.

A class is the set of instructions that describe how an instance can behave and
what info it contains.

Java has pre-defined classes such as System, which we've used in logging text
to our screen, but we also need to write our own classes for the custom needs
of a program.
////////////////////////////////////////////////////////////
Here's a definition of a Java class:

public class Car {
// scope of Car class starts after curly brace

    public static void main(String[] args) {
        // scope of main() starts after curly brace

        // program tasks

    }
    // scope of main() ends after curly brace

}
// scope of Car class ends after curly brace
////////////////////////////////////////////////////////////

This example defines a class named Car. public is an access level modifier that
allows other classes to interact with this class. For now, all classes will be
public.

This class has a main() method, which lists the tasks performed by the program.
main() runs when we execute the compiled Car.class file.

Instructions
------------
1. In the code editor, create a public Store class.

2. Your program will not compile without a main() method. Degine one within
   Store.
===============================================================================
Classes: Constructors
---------------------
In order to create an object (an instance of a class), we need a constructor
method. The constructor is defined within the class.

Let's take a look at the Car class with a constructor. The constructor, Car(),
shares the same name as the class:
//////////////////////////////////////////////////////////
public Class Car {
    // Constructor method
    public Car() {
        // instructions for creating a Car instance
    }

    public static void main(String[] args) {
        // body of main method
    }
}
//////////////////////////////////////////////////////////

To create an instance, we need to call or invoke the constructor within main().
The following example assigns a Car instance to the variable ferrari:
//////////////////////////////////////////////////////////
public Class Car {
    // Constructor method
    public Car() {
        // instructions for creating a Car instance
    }

    public static void main(String[] args) {
        // Invoke the constructor
        Car ferrari = new Car();
    }
}
//////////////////////////////////////////////////////////

In this example, instead of being declared with a primitive data type like int
or boolean, our variable ferrari is declared as a reference data type. This
means that the value of our variable is a reference to an instance's memory
address. During its declaration, the class name is used as the variable's type.
In this case, the type is Car.

After the assignment operator, (=), we invoke the constructor method: Car(),
and use the keyword new to indicate that we're creating an instance. Omitting
new causes an error.

If we were to output the value of ferrari we would see its memory address:
/////////////////
Car@76ed5528
/////////////////

We can initialize a reference-type variable without assigning it a reference if
we utilize the special value null. Something that is null has no value; of we
were to assign null to an object, it would have a void reference.

For example, in the following code snippet, we'll create an instance of Car,
assign it a reference, and then change its value to null:
/////////////////////////////////////////////////////////////
Car thunderBird = new Car();
System.out.println(thunderBird); // Prints: Car@76ed5528

thunderBird = null; // change value to null
System.out.println(thunderBird); // Prints: null
/////////////////////////////////////////////////////////////

It's important to note that if we use a null reference to call a method or
access an instance variable, we will receive a NullPointerException error.

Instructions
------------
1. Let's explore how code execution moves around the file with two methods. Add
   a print statement inside our Store constructor with the message:
   ///////////////////////////////////////
   I am inside the constructor method.
   ///////////////////////////////////////
   We'll see this message whenever we create an instance of Store by calling
   the constructor.

2. We did not see our constructor message printed because we haven't run the
   code inside the constructor. Inside main(), create an instance of Store
   called lemonadeStand. Don't forget the new keyword! We should see the
   constructor message.

3. Inside main(), print lemonadeStand to see how Java represents this instance.
   Review the order of the printed messages:
   1. Running the program invokes main()
   2. We create an instance so we move from main() to Store()
   3. The code inside Store() runs
   4. When Store() finishes execution, we return to main()
===============================================================================
Classes: Instance Fields
------------------------
Our last exercise ended with printing an instance of Store, which looked
something like Store@6bc7c054. The first part, Store, refers to the class, and
the second part @6bc7c054 refers to instance's location in the computer's
memory.

We don't care about memory location, but our instances have no other
characteristics! When an object is created, the constructor sets the initial
state of the object. The state is made up of associated data that represents
the characteristics of an object.

We'll add data to an object by introducing instance variables, or instance
fields.

We want Car instances of different colors, so we declare a String color
instance field. Often times, instance variables are described as a "has-a"
relationship with the object. For example, a Car "has-a" color. Another way to
think of this is that instance variables are the nouns and adjectives
associated with an object. What qualities other than color might a car have?
/////////////////////////////////////////////////////////////////////////////
public class Car {
    // declare fields inside the class by specifying the type and name
    String color;

    public Car() {
        // instance fields available in scope of construtor method
    }

    public static void main(String[] args) {
        // body of main method
    }
}
/////////////////////////////////////////////////////////////////////////////

The declaration is within the class and the instance variable will be available
for assignment inside the constructor.

Fields are a type of state each instance will possess. One instance may have
"red" as its color, another "blue", etc. It's the job of the constructor to
give these instances fields initial value. We'll learn how to in the next
exercise.

Instructions
------------
1. Add some state to our Store class. Declare a String instance field for
   productType.
===============================================================================
Classes: Constructor Parameters
-------------------------------
To create objects with dynamic, individual states, we'll use a combination of
the constructor method and instance fields.

In order to assign a value to an instance variable, we need to alter our
constructor method to include parameters so that it can access the data we
want to assign to an instance.

We've already seen a parameter in the main() method: String[] args, but this is
the first time we're using the parameter value within a method body.

The Car constructor now has a parameter: String carColor:
///////////////////////////////////////////////////////
public class Car {
    String color;
    // constructor method with a parameter
    public Car(String carColor) {
        // parameter value assigned to the field
        color = carColor;
    }
    public static void main(String[] args) {
        // program tasks
    }
}
///////////////////////////////////////////////////////

When a String value gets passed into Car(), it is assigned to the parameter
carColor. Then, inside the constructor, carColor will be assigned as the value
to the instance variable color.

Our method also has a signature which defines the name and parameters of the
method. In the above example, the signature is Car(String carColor).

In the next exercise, we'll learn how to pass values into a method!

There are two types of parameters: formal and actual. A formal parameter
specifies the type and name of data that can be passed into a method. In our
example above, String carColor is a formal parameter; carColor will represent
whatever String value is passed into the constructor. We'll learn about actual
parameters in the next exercise.

In Java, because of constructor overloading, a class can have multiple
constructors as long as they have different parameter values. The signature is
useful in that it helps the compiler differentiate between the different
methods. For example:
///////////////////////////////////////////////////////////////
public class Car {
    String color;
    int mpg;
    boolean isElectric;

    // constructor 1
    public Car(String carColor, int milesPerGallon) {
        color = carColor;
        mpg = milesPerGallon;
    }
    // constructor 2
    public Car(boolean electricCar, int milesPerGallon) {
        isElectric = electricCar;
        mpg = milesPerGallon;
    }
}
///////////////////////////////////////////////////////////////

In the example above, there are two constructors. When we initialize an object,
the compiler will know which constructor to use because of the values we pass
into it. For example, Car myCar = new Car(true, 40) will be created by the
seconds constructor's signature.

If we do not define a constructor, the Java compiler will generate a default
constructor that contains no arguments and assigns the object default values.
Default values can be created by assigning values to the instance fields during
their declaration:
/////////////////////////////////////////////////////////////
public class Car {
    String color = "red";
    boolean isElectric = false;
    int cupHolders = 4;

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color); // Prints: red
    }
}
/////////////////////////////////////////////////////////////

Instructions
------------
1. Add the String parameter product to the Store() constructor.

2. Inside of the constructor method, set the instance variable productType
   equal to the product parameter.
===============================================================================
Classes: Assigning Values to Instance Fields
--------------------------------------------
Now that our constructor has a parameter, we must pass values into the method
call. These values are referred to as arguments; once they are passed in, they
will be used to give the instance fields initial value.

Here we create an instance, ferrari, in the main() method with "red" as its
color field:
//////////////////////////////////////////////////////////////////
public class Car {
    String color;

    public Car(String carColor) {
        // assign parameter value to instance field
        color = carColor;
    }

    public static void main(String[] args) {
        // parameter value supplied when calling constructor
        Car ferrari = new Car("red");
    }
}
//////////////////////////////////////////////////////////////////

We pass the String value "red" to our constructoe method call:
/////////////////////
new Car("red");
/////////////////////

The type of the value given to the invocation must match the type declared by
the parameter.

Inside the constructor, the parameter carColor refers to the value passed in
during the invocation: "red". This value is assigned to the instance field
color. (color = carColor  <- carColor = "red")

color has already been declared, so we don't specify the type during
assignment.

The object, ferrari, holds the state of color as an instance field referencing
the value "red".

We access the value of this field with the dot operator (.):
///////////////////////////////////////////////
// accessing a field: objectName.fieldName
ferrari.color; // "red"
///////////////////////////////////////////////

An "actual parameter", or argument, refers to the value being passed during a
method call.

Call by value is the process of calling a method with an argument value. When
an argument is passed, the formal parameter is initialized with a copy of the
argument value. For example, when we declared the ferrari object, the String
value "red" is passed as an argument; then, the formal parameter carColor is
assigned a copy of that value.

Instructions
------------
1. Inside main(), create an instance of Store and assign it to the variable
   lemonadeStand. Use "lemonade" as the parameter value.

2. Print the instance field productType from lemonadeStand.
===============================================================================
Classes: Multiple Fields
------------------------
Objects are not limited to a single instance field. We can declare as many
fiels as necessary for the requirements of our program.

Let's change Car instances so they have multiple fields.

We'll add a boolean isRunning, that indicates the car engine is on and an
int velocity, that indicates the speed at which the car is traveling.
//////////////////////////////////////////////////////////////////////////////
public class Car {
    String color;
    // new fields!
    boolean isRunning;
    int velocity;

    // new parameters that correspond to the new fields
    public Car(String carColor, boolean carRunning, int milesPerHour) {
        color = carColor;
        // assign new parameters to the new fields
        isRunning = carRunning;
        velocity = milesPerHour;
    }

    public static void main(String[] args) {
        // new values passed into the method call
        Car ferrari = new Car("red", true, 27);
        Car renault = new Car("blue", false, 70);

        System.out.println(renault.isRunning);
        // false
        System.out.println(ferrari.velocity);
        // 27
    }
}
//////////////////////////////////////////////////////////////////////////////

The constructor now has multiple parameters to receive values for the new
fields. We still specify the type as well as the name for each parameter.

Ordering matters! We must pass values into the constructor invocation in the
same order that they're listed in the parameters.
//////////////////////////////////////////////
// values match types, no error
Car honda = new Car("green", false, 0);

// values do not match types, error!
Car junker = new Car(true, 42, "brown");
//////////////////////////////////////////////

Instructions
------------
1. Add two new instance fields for Store. inventoryCount of type int.
   inventoryPrice of type double.

2. Update the Store constructor method with the new parameters. The parameters
   should be product, count, and price, in that order. You must use that order
   and include the types for each parameter. For example, product is of type
   String because that value is assigned to the instance field String
   productType.

3. In the body of the Store constructor, assign the parameter values to the
   appropriate instance fields.

4. Inside main(), create an instance of Store called cookieShop. cookieShop has
   "cookies" as the product. cookieShop has 12 cookies to sell and each cookie
   costs 3.75.
===============================================================================
Classes: Review
---------------
Java is an object-oriented programming language where every program has at
least one class. Programs are often built from many classes and objects, which
are the instances of a class.

Classes define the state and behavior of their instances. Behavior comes from
methods defined in the class. State comes from instance fields declared inside
the class.

Classes are modeled on the real-world things we want to represent in our
program. Later we will explore how a program can be made from multiple classes.
For now, our programs are a single class.
///////////////////////////////////////////////////////////////////////////////
pubilc class Dog {
    // instance field
    String breed;

    //constructor method
    public Dog(String dogBreed) {
        // value of parameter dogBreed assigned to instance field breed
        breed = dogBreed;
    }

    public static void main(String[] args) {
        // create instance: use 'new' operator and invoke constructor
        Dog fido = new Dog("poodle");

        // fields are accessed using: the instance name, `.` operator, and the
        // field name.
        fide.breed; // "poodle"
    }
}
///////////////////////////////////////////////////////////////////////////////

Instructions
------------
The text editor contains a Dog class. Play around with the code!

Try to add and remove instance fields Create instances with different values.
Access and print different fields.
===============================================================================
*/
public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, 99);
        Store cookieShop = new Store("cookies", 12, 3.75);

        System.out.println("Our first shop shells " + lemonadeStand.productType
                + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount
                + "units remaining.");
    }
}
