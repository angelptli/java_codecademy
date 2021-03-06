/*
================================================================================
Conditional-And: &&
-------------------
Let's return to our student enrollment program. We've added an additional
requirement: not only must students have the prerequisite, but their tuition
must be paid up as well. We have two conditions that must be true before we
enroll the student.

Here's one way we could write the code:
///////////////////////////////
if (tuitionPaid) {
    if (hasPrerequisite) {
        // enroll student
    }
}
///////////////////////////////

We've nested two if-then statements. This does the job but we can be more
concise with the AND operator:
//////////////////////////////////////////
if (tuitionPaid && hasPrerequisite) {
    // entroll student
}
//////////////////////////////////////////

The AND operator, &&, is used between two boolean values and evaluates to a
single boolean value. If the values on both sides are true, then the resulting
value is true, otherwise the resulting value is false.

This code illustrates every combination:
///////////////////
true && true
//true
false && true
// false
true && false
// false
false && false
// false
///////////////////

Instructions
------------
1. Our Reservation class has the method confirmReservation() which validates if
   a restaurant can accomodate a given reservation. We need to build the
   conditional logic into confirmReservation() using two parameters:
   - restaurantCapacity
   - isRestaurantOpen

   Use an if-then-else statement:
   If restaurantCapacity is greater than or equal to guestCount and the
   restaurant is open, print "Reservation confirmed" and set isConfirmed to
   true. Else print "Reservation denied" and set isConfirmed to false.
================================================================================
Conditional-Or: ||
------------------
The requirements of our enrollment program have changed again. Certain courses
have prerequisites that are satisfied by multiple courses. As long as students
have taken at least one prerequisite, they should be allowed to enroll.

Here's one way we could write the code:
////////////////////////////////////
if (hasAlgebraPrerequisite) {
    // Enroll in course
}

if (hasGeometryPrerequisite) {
    // Enroll in course
}
////////////////////////////////////

We're using two different if-then statements with the same code block. We can
be more concise with the OR operator:
/////////////////////////////////////////////////////////////
if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
    // Enroll in course
}
/////////////////////////////////////////////////////////////

The OR operator, ||, is used between two boolean values and evaluates to a
single boolean value. If either of the two values is true, then the resulting
value is true, otherwise the resulting value is false.

This code illustrates every combination.
///////////////////
true || true
// true
false || true
// true
true || false
// true
false || false
// false
///////////////////

On some occasions, the compiler can determine the truth value of a logical
expression by only evaluating the first boolean operand; this is known as
short-circuited evaluation. Short-circuited evaluation only works with
expressions that use && or ||.

In an expression that uses ||, the resulting value will be true as long as one
of the operands has a true value. If the first operand of an expression is true,
we don't need to see what the value of the other operand is to know that the
final value will also be true.

For example, we can run the following code without error despite dividing a
number by 0 in the seond operand because the first operand had a true value:
///////////////////////////////////////////////
if (1 > 0 || 2 / 0 == 7) {
    System.out.println("No errors here!");
}
///////////////////////////////////////////////

An expression that uses && will only result in true if both operands are true.
If the first operand in the expression is false, the entire value will be false.

Instructions
------------
1. Let's write a message inside the Reservation() constructor that warns
   against bad input. Our restaurants can't seat parties of more than 8 people,
   and we don't want reservations for 0 or less because that would be silly.
   Inside Reservation(), write a conditional that uses ||. If count is less
   than 1 OR greater than 8 we want to write the following message: "Invalid
   reservation!".
================================================================================
Logical NOT: !
--------------
The unary operator NOT, !, works on a single value. This operator evaluates to
the opposite boolean to which it's applied:
/////////////
!false
// true
!true
// false
/////////////

NOT is useful for expressing our intent clearly in programs. For example,
sometimes we need the opposite behavior of an if-then: run a code block only
if the condition is false.
//////////////////////////////////////////////////////////////////
boolean hasPrerequisite = false;

if (hasPrequisite) {
    // do nothing
} else {
    System.out.println("Must complete prerequisite course!");
}
//////////////////////////////////////////////////////////////////

This coe does what we want but it's strange to have a code block that does
nothing!

The logical NOT operator cleans up our example:
//////////////////////////////////////////////////////////////////
boolean hasPrerequisite = false;

if (!hasPrerequisite) {
    System.out.println("Must complete prerequisite course!");
}
//////////////////////////////////////////////////////////////////

We can write a succint conditional statement without an empty code block.

Instructions
------------
1. Let's make informUser() more informative. If their reservation is not
   confirmed, they should know! Write an if-then-else statement and use ! with
   isConfirmed as the condition. If their reservation is not confirmed, write
   Unable to confirm reservation, please contact restaurant. Else write: Please
   enjoy your meal!
================================================================================
Review
------
Conditional operators work on boolean values to simplify our code. They're often
combined with conditional statements to consolidate the branching logic.

Conditional-AND, &&, evaluates to true if the booleans on both sides are true.
///////////////////////////////////////////////////////
if (true && false) {
    System.out.println("You won't see me print!");
} else if (true && true) {
    System.out.println("You will see me print!");
}
///////////////////////////////////////////////////////

Conditional-OR, ||, evaluates to true if one or both the booleans on either
side is true.
///////////////////////////////////////////////////////
if (false || false) {
    System.out.println("You won't see me print!");
} else if (false || true) {
    System.out.println("You will see me print!");
}
///////////////////////////////////////////////////////

Logical-NOT, !, evaluates to the opposite boolean value to which it is applied.
///////////////////////////////////////////////////////
if (!false) {
    System.out.println("You will see me print!");
}
///////////////////////////////////////////////////////

Instructions
------------
The complete Reservation class is in the code editor. Play around inside main()
and see if you can create instances that will run every possible conditional
branch.
================================================================================
*/
public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
  
    public Reservation(int count, int capacity, boolean open) {
        // Write conditional statement below
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }

        guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
    }

    public void confirmReservation() {
        /* 
            Write conditional
            ~~~~~~~~~~~~~~~~~
            if restaurantCapacity is greater
            or equal to guestCount
            AND
            the restaurant is open:
                print "Reservation confirmed"
                set isConfirmed to true
            else:
                print "Reservation denied"
                set isConfirmed to false
        */
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }
  
    public void informUser() {
        // System.out.println("Please enjoy your meal!");
        
        // Write conditional here
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact "
                               + "restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }
  
    public static void main(String[] args) {
        // Reservation partyOfThree = new Reservation(3, 12, true);
        // Reservation partyOfFour = new Reservation(4, 3, true);
        // partyOfThree.confirmReservation();
        // partyOfThree.informUser();
        // partyOfFour.confirmReservation();
        // partyOfFour.informUser();
        
        Reservation partyOfThree = new Reservation(3, 12, true);
        Reservation partyOfFour = new Reservation(4, 3, false);
        Reservation partyOfTen = new Reservation(10, 7, false);
        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
        partyOfTen.confirmReservation();
        partyOfTen.informUser();
    }
}
