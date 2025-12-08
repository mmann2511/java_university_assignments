/**
 * Scores.java.
 *
 * Creates an integer array
 * Finds even and odd numbers in array
 * Computes average of all numbers in array
 *
 * Activity 9
 * @author Michael Mann - CPSC - 1220
 * @version 11/4/2025
 */

public class Scores {
   
   private int[] numbers; // array of int values
   
   /**
    * Creates a Scores object.
    * Takes in an integer array
    * 
    *
    * @param numbersIn - integer array list 
    * numnbers included in array
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   
   /**
    * Finds even numbers in Scores int array.
    * Creates another integer array
    * to store even numbers
    *
    * @return evens - int array list of
    * even numbers
    */
   public int[] findEvens() {
      int numberEvens = 0;
     
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }  
      }   
            
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }    
      }
      
      return evens;
   }
   
    /**
    * Finds odd numbers in Scores int array.
    * Creates another integer array
    * to store even numbers
    *
    * @return odds - int array list of
    * odd numbers
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
    * Calculates Average of all numbers.
    * in Scores integer array
    * 
    * @return double avg - average of
    * integers in Scores array list
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return (double) sum / numbers.length;
   
   }
   
   /**
    * Returns a string representation.
    * of integers in Scores integer array
    *
    * @return string - formatted string
    * containing integers from Scores array
    * list object
    */
   public String toString() {
      String result = "";
     
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
    /**
    * Returns a reverse string representation.
    * of integers in Scores integer array
    *
    * @return string - Reversed formatted string
    * containing integers from Scores array
    * list object
    */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }



}