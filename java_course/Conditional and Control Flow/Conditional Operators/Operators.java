/*
================================================================================
Combining Conditional Operators
-------------------------------
We have the ability to expand our boolean expressions by using multiple
conditional operators in a single expression.

For example:
///////////////////////////////////////////
boolean foo = true && !(false || !true)
///////////////////////////////////////////

How does an expression like this get evaluated by the compiler? The order of
evaluation when it comes to conditional operators is as follows:

1. Conditionas placed in parentheses - ()
2. NOT - !
3. AND - &&
4. OR - ||

Using this info, let's dissect the expression above to find the value of foo:
//////////////////////////////
true && !(false || !true)
//////////////////////////////

First, we'll evaluate (false || !true) because it is enclosed withint
parentheses. Following the order of evaluation, we will evaluate !true, which
equals false:
//////////////////////////////
true && !(false || false)
//////////////////////////////


Then, we'll evalaute (false || false) which equals false. Now our expression
looks like this:
///////////////////
true && !false
///////////////////

Next, we'll evaluate !false becuase it uses the NOT operator. This expression
equals true making our expression the following:
/////////////////
true && true
/////////////////

true && true evaluates to true; therefore, the value of foo is true.

Instructions
------------
Take a look at the three expressions in Operators.java. Using your
understanding of the order of execution, find out whether the value of each
expression is true or false. When you're ready, uncomment the print statements
to find out if you are right.
================================================================================
*/
public class Operators {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean ex1 = !(a == 7 && (b >= a || a != a));
        // !(false && (3 >= 6 || 6 != 6))
        // !(false && (false || false))
        // !(false && false)
        // !false
        // true
        System.out.println(ex1);

        boolean ex2 = a == b || !(b > 3);
        // 6 == 3 || !(3 > 3)
        // false || !false
        // false || true
        // true
        System.out.println(ex2);

        boolean ex3 = !(b <= a && b != a + b);
        // !(3 <= 6 && 3 != 6 + 3)
        // !(true && true)]
        // !true
        // false
        System.out.println(ex3); 

    }
}
