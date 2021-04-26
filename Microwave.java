/*
* The Microwave program calculates how much time it will
* take to heat up a certain food and amount
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-04-26
* Class Microwave.
*/

import java.util.Scanner; // Imports scanner function

final class Microwave {

  private Microwave() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * The coresponding number to the sub time.
  */
  public static final double SUBTIME = 60;
  /**
  * The coresponding number to the pizza time.
  */
  public static final double PIZZATIME = 45;
  /**
  * The coresponding number to soup.
  */
  public static final double SOUP = 3;
  /**
  * The coresponding number to the soup time.
  */
  public static final double SOUPTIME = 105;
  /**
  * The parameter for the time.
  */
  public static final double MAXTIME = 3;
  /**
  * The constant in te time ewuation.
  */
  public static final double TIME = 0.5;
  /**
  * The Microwave program calculates how much time it will
  * take to heat up a certain food and amount.
  * @param args
  */

  public static void main(final String[] args) {


    // Begins try statement
    try {

      // Declarign the cooking time
      double cooktime = 0;

      // Create a scanner object
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter the number to the correlating food item you"
      + "want to microwave (Italian Sub 1, Pizza 2, Soup 3):");

      // Converts input to an intiger
      int foodnumber = myObj.nextInt();

      System.out.println("Enter the how many of the food items you would like"
      + " to microwave (between 1 and 3):");

      // Converts input to an intiger
      int foodamount = myObj.nextInt();

      // Checks to see if user inputed correct numbers
      if (foodnumber == 1) {

        // Cook time for SUB
        cooktime = SUBTIME;

      } else if (foodnumber == 2) {

        // Cook time for a PIZZA
        cooktime = PIZZATIME;

      } else if (foodnumber == SOUP) {

        // Cook time for SOUP
        cooktime = SOUPTIME;

      } else {
        // Runs if invalid food number was inputted
        System.out.println();
        System.out.println("Please enter a valid food number");
        return;
      }

      // Checks to see if user inputted correct food amount
      if (foodamount >= 1 && foodamount <= MAXTIME) {

        // Calculates how long the food needs to be in the micro
        cooktime = cooktime + TIME * (foodamount - 1) * cooktime;

          System.out.println();
          System.out.println("Your food will take " + cooktime
          + " Seconds to cook.");
          System.out.println();
          System.out.println("Done");

      } else {

        // Runs if user inputted wrong food amount
        System.out.println();
        System.out.println("Please enter a valid amount of food");
        return;
      }

    } catch (Exception e) {
      // Runs if anything other than an intiger is inputted
      System.out.println();
      System.out.println();
      System.out.println("Invalid input. Please try again");

    }
  }
}
