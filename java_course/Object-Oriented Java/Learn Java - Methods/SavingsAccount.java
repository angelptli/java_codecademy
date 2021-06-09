/*
===============================================================================
Introduction
------------
In the last lesson, we learned that objects have state and behavior. We have
seen how to give objects state through instance fields. Now, we're going to
learn how to create object behavior using methods. Remember our example of a
Savings Account.

The state tells us what a savings account should know:
- The balance of money available

The behavior tells us what tasks a savings account should be able to perform:
- Depositing - increasing the amount available
- Withdrawing - decreasing the amount available
- Checking the balance - displaying the amount available.

Methods are repeatable, modular blocks of code used to accomplish specific
tasks. We have the ability to define our own methods that will take input, do
something with it, and return the kind of output we want.

Looking at the example above, recreating a savings account is no easy task. How
can one program tackle such a large problem? This is where methods and their
ability to accomplish smaller, specific tasks comes in handy. Through method
decomposition, we can use methods to break down a large problem into smaller,
more manageable problems.

Methods are so reusable. Imagine we wrote a sandwich-making program that used
20 lines of code to make a single sandwich. Our program would become very long
very quickly if we were making multiple sandwiches. By creating a
makeSandwich() method, we can make a sandwich anytime simply by calling it.

In this lesson, we'll learn how to create and call our very own methods inside
of our programs.

If we were to share this sandwich-making program with another person, they
wouldn't have to understand how makeSandwich() worked. If we wrote our program
well, all they would need to know is that if they called makeSandwich(), they
would receive a sandwich. This concept is known as procedural abstraction:
knowing what a method does, but not how it accomplishes it.

Instructions
------------
1. We have made a SavingsAccount class without using any methods beyond main()
   and the constructor, SavingsAccount(). Run the code to see some account
   behavior happen. Look at the main method! It’s so long! There is so much
   repeated code! Can you imagine how messy it would look if you needed to make
   10 deposits? Throughout this lesson, we will learn how to make methods that
   would make checking the balance, depositing, and withdrawing all behavior
   that would take only one line of code.
===============================================================================
Review
------
Great Work! Methods are a powerful way to abstract tasks away and make them
repeatable. They allow us to define behavior for classes, so that the Objects
we create can do the things we expect them to. Let's review everything we have
learned about methods so far.
- Defining a method: Methods have a method signature that declares their return
  type, name, and parameters
- Calling a method: Methods are invoked with a . and ()
- Parameters: Inputs to the method and their types are declared in parentheses
  in the method signature
- Changing Instance Fields: Methods can be used to change the value of an
  instance field
- Scope: Variables only exist within the domain that they are created in
- Return: The type of the variables that are output are declared in the method
  signature

As you move through more Java material, it will be helpful to frame the tasks
you create in terms of methods. This will help you think about what inputs you
might need and what output you expect.

Instructions
------------
1. Now that we’ve learned about behavior, we can apply behavior to our
   SavingsAccount class using methods! We've added the functionality for each
   method inside main() now, but you will be rebuilding each above main(). Note
   that your methods can directly access the balance field. First, write a
   method called checkBalance() that prints:
   ////////////////////
   Hello!
   Your balance is
   ////////////////////
   with the balance of the account displayed. It should take in no parameters
   and return nothing.

2. Now, write a method called deposit() that takes in an int parameter
   amountToDeposit and adds it to the balance. It should return nothing. If you
   want, you can also have the method print:
   ///////////////////////////////////////
   You just deposited amountToDeposit
   ///////////////////////////////////////
   with the value of amountToDeposit displayed.

3. Now, write a method called withdraw() that takes in an int parameter
   amountToWithdraw and subtracts it from the balance. It should return the
   amountToWithdraw. If you want, you can also have the method print:
   ////////////////////////////////////////
   You just withdrew amountToWithdraw
   ////////////////////////////////////////
   with the value of amountToWithdraw displayed.

4. Test out your methods by trying to replace some of the code in the main()
   method with the equivalent methods! Make sure to use checkBalance(),
   deposit(), and withdraw() at least once each.

5. Congratulations! You’ve made a basic SavingsAccount. If you want, you can
   add more functionality to this! What other instance fields might you want to
   keep track of? What might a toString() look like for this class?
===============================================================================

*/
public class SavingsAccount {
  
    int balance;
  
    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }
  
    public void checkBalance() {
    System.out.println("Hello!\nYour balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
    
        //Check balance:
        savings.checkBalance();
    
        //Withdrawing:
        savings.withdraw(300);
    
        //Check balance:
        savings.checkBalance();
    
        //Deposit:
        savings.deposit(600);
    
        //Check balance:
        savings.checkBalance();
    
        //Deposit:
        savings.deposit(600);
    
        //Check balance:
        savings.checkBalance();

        System.out.println(savings);
    }

    public String toString() {
        return "\nFinal balance: $" + balance;
    }
}
