/*
Order of Operations
-------------------
The order of operations dictates the order in which an expression (like the one
above) is evaluated.

The order is as follows:
1. Parentheses
2. Multiplication
3. Division
4. Modulo
5. Addition
6. Subtraction

Instructions
*/
public class Operations {
    public static void main(String[] args) {

        int expression1 = 5 % 2 - (4 * 2 - 1);
        System.out.println("This will print -6");
        System.out.println(expression1);

        int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
        System.out.println("This will print 3");
        System.out.println(expression2);

        int expression3 = 5 * 4 % 3 - 2 + 1;
        System.out.println("This will print 1");
        System.out.println(expression3);
    }
}
