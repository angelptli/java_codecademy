/*
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
public class Dog {
    
}
