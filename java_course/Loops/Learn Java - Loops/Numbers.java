/*
================================================================================
break and continue
------------------
If we ever want to exit a loop before it finishes all its iterations or want to
skip one of the iterations, we can use the break and continue keywords.

The break keyword is used to exit, or break, a loop. Once break is executed,
the loop will stop iterating.

The continue keyword can be placed inside of a loop if we want to skip an
iteration. If continue is executed, the current loop iteration will
immediately end, and the next iteration will begin. We use the continue keyword
to skip any even valued iteration:
////////////////////////////////////////////////
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) {
        continue;
    }
    System.out.println(numbers[i]);
}
////////////////////////////////////////////////

This program would output the following:
////
1
3
5
////

In this case, if a number is even, we hit a continue statement, which skips
the rest of that iteration, so the print statement is skipped. As a result, we
only see odd numbers print.

Loops can exist all throughout our code - including inside a method. If the
return keywordwas executed inside a loop contained in a method, then the loop
iteration would be stopped and the method/constructor would be exited.

For example, we have a method called checkForJacket() that takes in an array of
Strings. If any of the elements are equivalent to the String value "jacket",
the method will return true:
////////////////////////////////////////////////////////////////////
public static boolean checkForJacket(String[] lst) {
    for (int i = 0; i < lst.length; i++) {
        System.out.println(lst[i]);

        if (lst[i] == "jacket") {
            return true;
        }
    }
  return false;
} 
 
public static void main(String[] args) {
    String[] suitcase = {"shirt", "jacket", "pants", "socks"};   
    System.out.println(checkForJacket(suitcase));
}
////////////////////////////////////////////////////////////////////

As soon as an element equals "jacket", return true; is executed. This causes
the loop to stop and the compiler to exit checkForJacket(). Running this code
would output the following:
//////////
shirt
jacket
true
//////////

Instructions
-----------
1. Take a look at the for loop in the code editor. It starts its iteration at 0
   and continues to iterate until i < 100 is false. Inside the loop, create a
   condition that checks if i is not divisible by 5. If the condition is true,
   skip the iteration. Outside the condition statement, print i. The final
   solution should not contain an else statement. The only numbers that should
   be printed are those that are divisible by 5!
================================================================================
*/
class Numbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // Add your code below
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
      