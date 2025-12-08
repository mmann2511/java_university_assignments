/**
 * Division.java.
 *
 * Class containing two static methods
 * Methods perform division arithmetic
 *
 * Activity 12
 * @author Michael Mann - CPSC - 1220
 * @version 11/25/2025
 */

public class Division {
   
   /**
    * Integer Division.
    * Calculates integer division
    * @param numIn - numerator in
    * @param denomIn - denominator in
    * @return numIn/ denomIn - floor of integer divison
    * or 0 if denom is 0
    */
   public static int intDivide(int numIn, int denomIn) {
      try { 
         return numIn / denomIn;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * Decimal Division.
    * Performs floating-point division
    * @param numIn - numerator in
    * @param denomIn - denomIn
    * @return (double)numIn / denomIn
    */
    
   public static double decimalDivide(int numIn, int denomIn) {
      if (denomIn == 0) {
         throw new IllegalArgumentException("The denominator "
               + "cannot be zero.");
      }
      return (double) numIn / denomIn;
   }

   
}