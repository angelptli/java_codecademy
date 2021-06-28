/*
================================================================================
Incrementing While Loops
------------------------
When looping through code, it's common to use a counter variable. A counter
(also known as an iterator) is a variable used in the conditional logic of the
loop and (usually) incremented in value during each iteration through the code.
For example:
//////////////////////////////////////////////
// counter is initialized
int wishes = 0

// conditional logic uses counter
whil (wishes < 3) {
    
    System.out.println("Wish granted.");
    // counter is incremented
    wishes++;

}
//////////////////////////////////////////////

In the above example, the counter wishes gets initialized before the loop with
a value of f0, then the program will keep printing "Wish granted." and adding 1
to wishes as long as wishes has a value of less than 3. Once wishes reaches a
value of 3 or more, the program will exit the loop.

So the output would look like:
/////////////////
Wish granted.
Wish granted.
Wish granted.
/////////////////

We can also decrement counters like this:
////////////////////////////////
int pushupsToDo = 10;

while (pushupsToDo > 0) {

    doPushup();
    pushupsToDo--;

}
////////////////////////////////

Int the code above, the counter, pushupsToDo starts at 10, and increments down
one at a time. When it hits 0, the loop exits.

Instructions
------------
1. In Coffee.java, initialize an int variable called cupsOfCoffee with a value
   of 1.

2. Create a while loop that runs as long as cupsOfCoffee is less than or equal
   to 100. Important: Inside the while loop, increment cupsOfCoffee by 1 to
   prevent an infinite loop.

3. Inside the while loop above where you incremented cupsOfCoffee print the
   following:
   ////////////////////////////////
   Fry drinks cup of coffee #1
   ////////////////////////////////

   The 1 in this statement should correspond with the current value of
   cupsOfCoffee. When cupsOfCoffee is 100, this should be printed:
   //////////////////////////////////
   Fry drinks cup of coffee #100
   //////////////////////////////////
================================================================================
Using For Loops
---------------
Even though we can write while loops that accomplish the same task, for loops
are useful because they help us remember to increment our counter - something
that is easy to forget when we increment with a while loop.

Leaving out that line of code would cause an infinite loop.

Fortunately, equipped with our new understanding of for loops, we can help
prevent infinite loops in our own code.

It's important to be aware that, if we don't create the correct for loop
header, we can cause the iteration to loop one too many or one too few times;
this occurrence is known as an "off by one" error.

For example, imagine we wanted to fid the sum of the first ten numbers and
wrote the following code:
///////////////////////////////////
int sum = 0;
for (int i = 0; i < 10; i++) {
    sum += 1
}
///////////////////////////////////

This code would produce an incorrect value of 45. We skipped adding 10 to sum
because our loop control variable started with a value of 0 and stopped the
iteration after it had a value of 9. We were off by one! We could fix this by
changing the condition of our loop to be i <= 10; or i < 11;.

These errors can be tricky because, while they do not always produce an error
in the terminal, they can cause some miscalculations in our code. These are
called logical errors - the code runs fine, but it didn't do what you expected
it to do.

Instructions
------------
1. We've provided a while loop that loops from 1 to 100 outputting a string on
   each iteration. Refactor (rewrite) this code as a for loop. Remember, the
   syntax of a for loop looks like:
   ///////////////////////////////////
   for (int i = 0; i < 5; i++) {

       // code that will run

   }
   ///////////////////////////////////
 ================================================================================
*/
class Coffee {

    public static void main(String[] args) {

        // Exercise: Incrementing While Loops
        // ----------------------------------
        // // initialize cupsOfCoffee
        // int cupsOfCoffee = 1;

        // // add while loop with counter
        // while (cupsOfCoffee <= 100) {
        //     System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        //     cupsOfCoffee++;
        // }

        // Exercise: Using For Loops
        // -------------------------
        for (int cupsOfCoffee = 1; cupsOfCoffee <= 100; cupsOfCoffee++) {

            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            
        }
    }
}
