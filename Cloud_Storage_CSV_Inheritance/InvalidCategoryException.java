/**
 * InvalidCategoryException.java.
 *
 * Exception Subclass
 *
 * Project 12
 * @author Michael Mann - CPSC - 1220
 * @version 11/25/2025
 */

public class InvalidCategoryException extends Exception {
   
   /**
    * Constructor.
    * Calls super, then provides string
    * @param categoryIn category of CloudStorage object
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   
   }



}