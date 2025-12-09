import javax.swing.JOptionPane;
/**
 * DivisionDriver.java.
 *
 * Driver class asks user for two 
 * integer values
 * Calls static methods from Division Class
 * Performs integer and float division 
 * Displays results in dialog boxes
 *
 * Activity 12
 * @author Michael Mann - CPSC - 1220
 * @version 11/25/2025
 */

public class DivisionDriver {
   
   /**
    * Main Method.
    * Performs the division 
    * Displays results in diaglog boxes
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      
      
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         String result = "Integer division: \n"
                        + Division.intDivide(num, denom)
                        + "\n\nFloating point division: \n"
                        + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result",
                                     JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      
      } 
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }              
   
   }


}