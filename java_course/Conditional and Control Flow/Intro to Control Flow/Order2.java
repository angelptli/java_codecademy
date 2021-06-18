/*
================================================================================
If-Then-Else-If
---------------
The conditional structure we've learned can be chained together to check as
many conditions as are required by our program.

Imagine our program is now selecting the appropriate course for a student.
We'll check their submission to find the correct course enrollment.

The conditional statement now has multiple conditions that are evaluated from
the top down:

String course = "Theatre";
/////////////////////////////////////////////////
if (course.equals("Biology")) {
    // Enroll in Biology course
} else if (course.equals("Algebra")) {
    // Enroll in Algebra course
} else if (course.equals("Theatre")) {
    // Enroll in Theatre course
} else {
    System.out.println("Course not found!");
}
/////////////////////////////////////////////////

The first condition to evaluate to true will have that code block run. Here's
an example demonstrating the order:
////////////////////////////////////
int testScore = 72;

if (testScore >= 90) {
    System.out.println("A");
} else if (testScore >= 80) {
    System.out.println("B");
} else if (testScore >= 70) {
    System.out.println("C");
} else if (testScore >= 60) {
    System.out.println("D");
} else {
    System.out.println("F");
}
// prints: C
////////////////////////////////////

This chained conditional statement has two conditions that evaluate true.
Because testScore >= 70 comes before testScore >=60, only the earlier code
block is run.

Note: Only one of the code blocks will run.

Instructions
------------
We need to calculate the shipping costs for our orders. There's a new instance
field, String shipping, that we use to calculate the cost. Use a chained
if-then-else to check for different values within the calculateShipping()
method. When the shipping instance field equals "Regular", the method should
return 0. When the shipping instance field equals "Express", the method should
return 1.75. Else the method should return .50.
================================================================================
*/
public class Order2 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order2(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) System.out.println("High value item!");

        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        // if (shipping.equals("Regular")) {
        //     return 0.00;
        // } else if (shipping.equals("Express")) {
        //     return 1.75;
        // } else {
        //     return .50;
        // }
        if (shipping.equals("Regular")) return 0.00;
        else if (shipping.equals("Express")) return 1.75;
        else return .50;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order2 book = new Order2(true, 9.99, "Express");
        Order2 chemistrySet = new Order2(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
