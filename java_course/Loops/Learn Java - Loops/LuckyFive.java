// Importing the Random library
import java.util.Random;

/*
================================================================================
While We're Here
----------------
A while loop looks a bit like an if statement:
/////////////////////////////
while (silliness > 10) {
    // code to run

}
/////////////////////////////

Like an if statement, the code inside a while loop will only run if the
condition is true. However, a while loop will continue running the code over
and over until the condition evaluates to false. So the code block will repeat
until silliness is less than or equal to 10.

/////////////////////////////////////////////////
// set attempts to 0
int attemps = 0;

// enter loop if condition is true
while (passcode != 0524 && attempts < 4) {
    
    System.out.println("Try again");
    passcode = getNewPasscode();
    attempts += 1;

    // is condition still true?
    // if so, repeat code block
}
// exit when condition is not true
/////////////////////////////////////////////////

while loops are extremely useful when you want to run some code until a
specific change happens. However, if you aren't certain that change will occur,
beware the infinite loop!

Infinite loops occur when the condition will never evaluate to false. This can
cause your entire program to crash.
//////////////////////////////////////////////////////
int hedgehogs = 5;

// This will cause an infinite loop:
while (hedgehogs < 6) {

    System.out.println("Not enough hedgehogs!");

}
//////////////////////////////////////////////////////

In the example above, hedgehogs remains equal to 5, which is less than 6. So
we would get an infinite loop.

Instructions
------------
1. Take a look at LuckyFive.java. We've set up a random number generator that
   allows you to simulate the roll of a die. Create a while loop that will
   continue to loop while dieRoll is NOT 5. Do NOT run your code yet — you will
   get an infinite loop here because the value of dieRoll is never changed.
   Inside the loop, reset dieRoll with a new random value between 1 and 6. Now
   you can run the code.

2. Inside the while loop, above the line where you reset dieRoll, print out
   dieRoll to the terminal.
================================================================================
*/
class LuckyFive {
  
    public static void main(String[] args) {
    
        // Creating a random number generator
        Random randomGenerator = new Random();
    
        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 5
    
    
  }
  
}