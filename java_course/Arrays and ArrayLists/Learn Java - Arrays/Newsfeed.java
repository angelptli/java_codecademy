/*
================================================================================
Introduction
------------
We have seen how to store single pieces of data in variables. What happens
when we need to store a group of data? What if we have a list of students in a
classroom? Or a ranking of the top 10 horses finishing a horse race?

If we were storing 5 lottery ticket numbers, for example, we could create a
different variable for each value:
///////////////////////////
int firstNumber = 4;
int secondNumber = 8;
int thirdNumber = 15;
int fourthNumber = 16;
int fifthNumber = 23;
///////////////////////////

That is a lot of ungainly repeated code. What if we had a hundred lottery
numbers? It is more clean and convenient to use a Java array to store the data
as a list.

An array holds a fixed number of values of one type. Arrays hold double, int,
boolean, or any other primitive types. Arrays can also contain the String type
as well as object references!

Each index of an array corresponds with a different value. Here is a diagram of
an array filled with integer values:
/////////////////////////////
elements: 4  8  15 16 23
indices:  0  1  2  3  4
/////////////////////////////

Notice that the indexes start at 0! The element at index 0 is 4, while the
element at index 1 is 8. This array has a length of 5, since it holds five
elements, but the highest index of the array is 4.

Let's explore how to create and use arrays in Java, so that we can store all
of our Java data types.

Instructions
------------
1. In Newsfeed.java, we have created a Newsfeed class to keep track of trending
   articles and their associated views and ratings. We did this using Java
   arrays, which you’ll learn about throughout the lesson! For now, run the
   code to see some of our method calls.
================================================================================
*/
public class Newsfeed {
  
    String[] trendingArticles;
    int[] views;
    double[] ratings;
  
    public Newsfeed(String[] initialArticles, int[] initialViews,
            double[] initialRatings) {
        trendingArticles = initialArticles;
        views = initialViews;
        ratings = initialRatings;
    }
  
    public String getTopArticle() {
        return trendingArticles[0];
    }
  
    public void viewArticle(int articleNumber){
        views[articleNumber] = views[articleNumber] + 1;
        System.out.println("The article '" + trendingArticles[articleNumber]
                           + "' has now been viewed " + views[articleNumber]
                           + " times!");
    }
  
    public void changeRating(int articleNumber, double newRating){
        if (newRating > 5 || newRating < 0) {
            System.out.println("The rating must be between 0 and 5 stars!");
        } else {
            ratings[articleNumber] = newRating;
            System.out.println("The article '" + trendingArticles[articleNumber]
                               + "' is now rated " + ratings[articleNumber]
                               + " stars!");
        }
    }
  
    public static void main(String[] args) {
        String[] robotArticles =
        {
            "Oil News", "Innovative Motors", "Humans: Exterminate Or Not?",
            "Organic Eye Implants", "Path Finding in an Unknown World"
        };
        
        int[] robotViewers = {87, 32, 13, 11, 7};
        double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
        Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers,
                                        robotRatings);
    
        robotTimes.viewArticle(2);
        robotTimes.viewArticle(2);
        System.out.println("The top article is " + robotTimes.getTopArticle());
        robotTimes.changeRating(3, 5);
    }
}
