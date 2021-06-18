/*
================================================================================
Review
------
We have now seen how to store a list of values in arrays. We can use this
knowledge to make organized programs with more complex variables.

Throughout the lesson, we have learned about:
- Creating arrays explicitly, using { and }.
- Accessing an index of an array using [ and ].
- Creating empty arrays of a certain size, and filling the indices one by one.
- Getting the length of an array using length.
- Using the argument array args that is passed into the main() method of a
  class.

Instructions
------------
1. In order to practice the skills you've learned throughout the lesson, we're
   going to make and use some arrays in the main() method of a new Classroom
   class. First, inside main(), make a String array called students, and set it
   equal to the following students, in order:
   ///////////
   Sade
   Alexus
   Sam
   Koma
   ///////////

2. Now, we're going to store the averages on the most recent math test. Create
   an array called mathScores and set it to an empty array of size 4. It should
   hold doubles.

3. Sade got a 94.5 on the test. Store this value in the 0th index of the
   mathScores array.

4. Sam got a 76.8 on the test. Store this value in the appropriate spot in the
   mathScores array.

5. Write a print statement to say:
   /////////////////////////////////////////////////////////
   The number of students in the class is <numStudents>.
   /////////////////////////////////////////////////////////
   with <numStudents> replaced by the length of the students array. For
   example, if the array has 7 elements, the printout should read:
   /////////////////////////////////////////////
   The number of students in the class is 7.
   /////////////////////////////////////////////
================================================================================
*/
// import java.util.Arrays;

public class Classroom {
  
    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        double[] mathScores = new double[4];

        mathScores[0] = 94.5;
        mathScores[2] = 76.8;

        System.out.println("The number of students in the class is "
                           + students.length);
    }
}

