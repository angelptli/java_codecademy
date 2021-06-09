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
    String breed;
    boolean hasOwner;
    int age;
    double weight;

    public Dog(String dogBreed, boolean dogOwned, int dogYears,
               double dogPounds) {
        System.out.println("Constructor invoked...");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        weight = dogPounds;
    }

    public static void main(String[] args) {
        System.out.println("Main method started...");

        Dog fido = new Dog("poodle", false, 4, 23.4);
        Dog nunzio = new Dog("shiba inu", true, 12, 35.2);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        boolean isNunzioChonkier = nunzio.weight > fido.weight;

        System.out.println("Two doggos recorded: " + fido.breed + "and a"
                + nunzio.breed);
        System.out.println("The statement that fido is an older doggo is: "
                + isFidoOlder);
        System.out.println("The total age of the doggos is: " + totalDogYears);
        System.out.println("The statement that nunzio is a chonkier doggo is: "
                + isNunzioChonkier);
        System.out.println("Main method finished.");
    }
}
