/*

Addition and Subtraction
------------------------
In our bank account example from the last exercise, we used the + operator
to add the values balance and depositAmount:
/////////////////////////////////////////////////////////////
double balance = 20000.99;
double depositAmount = 1000.00;
balance = balance + depositAmount;
// balance now holds 21000.99
/////////////////////////////////////////////////////////////

If we wanted to withdraw from the balance, we would use the - operator:
/////////////////////////////////////////
double withdrawAmount = 500;
balance = balance - withdrawAmount;
// balance now holds 19500.99
/////////////////////////////////////////

Addition and subtraction work with int type values as well! If we had 60
pictures of cats on our phone, and we took 24 more, we could use the following
line of code to store 84 in numPicturesOfCats.
////////////////////////////////////
int numPicturesOfCats = 60 + 24
////////////////////////////////////

What if we took one additional picture of our cat? We can reflect this change
using an increment operator ++. When we append ++ to a number-based variable,
it increases the value by 1. We also have the decrement oeprator, --, which
decreases the value by 1.

// Take a picture
numPicturesOfCats++ // Value is now 85

// Delete a picture
numPicturesOfCats-- // Value is now 84

Instructions
------------
1. Create an int variable called animalsInZoo that holds the amount of zebras
   plus the amount of giraffes at the zoo. Then, print your animalsInZoo
   variable.

2. Two of the zebras have been traded to a neighboring rival zoo. Subtract 2
   rom the number of zebras and store the result in a variable called
   numZebrasAfterTrade. Then, print the numZebrasAfterTrade variable!
*/
// public class PlusAndMinus {
//     public static void main(String[] args) {
//         int zebrasInZoo = 8;
//         int giraffesInZoo = 4;
//         int animalsInZoo = zebrasInZoo + giraffesInZoo;
//         int numZebrasAfterTrade = zebrasInZoo - 2;
//         System.out.println(numZebrasAfterTrade);
//     }
// }
