/*
================================================================================
Review
------
Congratulations! 🙌

We have learned some of the string methods that come with the String class:
- length()
- concat()
- indexOf()
- charAt()
- equals() / equalsIgnoreCase()
- substring()
- toUpperCase() / toLowerCase()

Instructions
------------
Feel free to play around with these string methods in the code editor before
moving on.
================================================================================
*/
public class Review {
    
    public static void main(String[] args) {
        String fish = "salmon";
        System.out.println(fish.length());
        System.out.println(fish.concat(" eggs"));
        System.out.println(fish.indexOf("a"));
        System.out.println(fish.charAt(5));
        System.out.println(fish.equals("salmon"));
        System.out.println(fish.equalsIgnoreCase("Salmon"));
        System.out.println(fish.substring(3, 4));
        System.out.println(fish.toUpperCase());
        System.out.println("Fish".toLowerCase());

    }
}
