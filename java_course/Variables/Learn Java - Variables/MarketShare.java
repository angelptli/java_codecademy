/*
================================================================================
doubles
-------
The double primitive data type can hold decimals as well as very large and very
small numbers. The maximum value is 1.797,693,134,862,315,7 E+308, which is
approximately 17 followed by 307 zeros. The minimum value is 4.9 E-324, which
is 324 decimal places!

To declare a variable of type double, we user the double keyword in the
declaration:
////////////////////////////////////////////////////////////////////
// doubles can have decimal places:
double price = 8.99;
// doubles can have values bigger than what an int could hold:
double gdp = 12237700000;
////////////////////////////////////////////////////////////////////

Instructions
------------
1. As of 2016, Android has 81.7 percent of the market share for mobile
   operating systems. Create a variable called androidShare that holds this
   percentage as a double.

2. Print out androidShare to the console.
================================================================================
*/
public class MarketShare {
    public static void main(String[] args) {
        double androidShare = 81.7;
        System.out.println(androidShare);
    }
}
