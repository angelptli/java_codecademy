/*
================================================================================
Review
------
Nice work! Let's iterate over what you've just learned about loops:

- while loops: These are useful to repeat a code block an unknown number of
  times until some condition is met. For example:
  /////////////////////////
  int wishes = 0;

  while (wishes < 3) {
      wishes++
  }
  /////////////////////////

- for loops: Theses are ideal for when you are incrementing or decrementing
  with a counter variable. For example:
  //////////////////////////////////
  for (int i = o; i < 5; i++) {
      // code that will run
  }
  //////////////////////////////////

- For-each loops: These make it simple to do something with each item in a
  list. For example:
  //////////////////////////////////////////////////
  for (String inventoryItem : inventoryItems) {
      // do something with each inventoryItem
  }
  //////////////////////////////////////////////////

Instructions
------------
Feel free to play around with loops, arrays, and ArrayLists in the code editor.
================================================================================
*/
import java.util.ArrayList;
// import java.util.Arrays;

class Playground {

    public static ArrayList<Integer> removeOdds(ArrayList<Integer> evenNums) {
        for (int i = 0; i < evenNums.size(); i++) {
            // System.out.println(evenNums.get(i));
            if (evenNums.get(i) % 2 != 0) {
                evenNums.remove(evenNums.get(i));
                i--;
            }
        }
        return evenNums;
    }

	  public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();
        
        // Add the numbers 1 through 10 to the ArrayList
        for (int i = 1; i < 11; i++) {
            evenNumbersList.add(i);
        }

        System.out.println("Even Numbers: " + removeOdds(evenNumbersList));
        // for (int i = 0; i < 28; i++) {
  		//     System.out.println("Congrats on finishing Java loops!");
	    // }
    }
}
