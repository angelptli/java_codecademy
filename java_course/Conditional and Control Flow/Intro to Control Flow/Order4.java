/*
================================================================================
Switch Statement
----------------
An alternative to chaining if-then-else conditions together is to use the
switch statement. This conditional will check a given value against any number
of conditions and run the code block where there is a match.

Here's an example of our course selection conditional as a switch statement
instead:
////////////////////////////////////////////////////
String course = "History";

switch (course) {
    case "Algebra":
        // Enroll in Algebra
        break;
    case "Biology":
        // Enroll in Biology
        break;
    case "History":
        // Enroll in History
        break;
    case "Theatre":
        // Enroll in Theatre
        break;
    default;
        System.our.println("Course not found");
}
////////////////////////////////////////////////////

This example enrolls the student in History class by checking the value
contained in the parentheses, course, against each of the case labels. If the
value after the case label matches the value within the parentheses, the switch
block is run.

In the above example, course references the string "History", which matches
case "History":.

When no value matches, the default block runs. Think of this as the else
equivalent.

Switch blocks are different than other code blocks because they are not marked
by curly braces and we use the break keyword to exit the switch statement.

Without break, code below the matching case label is run, including code under
other case labels, which is rarely the desired behavior.
////////////////////////////////////////////////////
// enrolls student in Biology ... AND History and Theatre!
String course = "Biolody";

switch (course) {
    case "Algebra":
        // Enroll in Algebra
    case "Biology":
        // Enroll in Biology
    case "History":
        // Enroll in History
    case "Theatre":
        // Enroll in Theatre
    default;
        System.our.println("Course not found");
}
////////////////////////////////////////////////////


Instructions
------------
1. We'll rewrite the calculateShipping() method so it uses a switch statement
   instead. There's an uninitialized variable shippingCost in
   calculateShipping(). Assign the correct value to shippingCost using a switch
   statement:
   - We'll check the value of the instance field shipping.
   - When shipping matches "Regular", shippingCost should be 0.
   - When shipping matches "Express", shippingCost should be 1.75.
   - The default should assign .50 to shippingCost.

   Make sure the method returns shippingCost after the switch statement.
================================================================================
*/
public class Order4 {
    boolean isFilled;
    double billAmount;
    String shipping;
  
    public Order4(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
            System.out.println("High value item!");
        }
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
        double shippingCost;
	 	    // declare switch statement here
        switch (shipping) {

        case "Regular":
            shippingCost = 0;
            break;
        case "Express":    
            shippingCost = 1.75;
            break;
        default:
            shippingCost = .50; 
        }
    
        return shippingCost;
 	  }
  
    public static void main(String[] args) {
        // do not alter the main method!
        Order4 book = new Order4(true, 9.99, "Express");
        Order4 chemistrySet = new Order4(false, 72.50, "Regular");
    
        book.ship();
        chemistrySet.ship();
    }
}