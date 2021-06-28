/*
================================================================================
Intoduction to String Methods
-----------------------------
As you may recall, a String, which is widely used in Java, is an object that
represents a sequence of characters. It is a great way to store info.

Because characters strings are so vital to programming, Java dedicated an
entire class to them. This is great news for us because the String class has a
lot of useful methods to help us perform operations on Strings and data
manipulation. We don't have to import anything to use the String class because
it's apart of the java.lang package which is available by default.

In this lesson, we will go over several String methods:
- length()
- concat()
- equals()
- indexOf()
- charAt()
- substring()
- toUpperCase() /  toLowerCase()
Let's get started!

1. Run the code in the code editor. There are three string methods used in this
   program. We'll learn about them later, but can you guess what some of them
   do?
================================================================================
*/
class HelloWorld2 {
  
	public static void main(String[] args) {
    
        String str = "Hello, World!";
        
        // Examples:
        
        System.out.println(str.length());
        
        System.out.println(str.substring(4));
        
        System.out.println(str.toUpperCase());
    
    }
  
}