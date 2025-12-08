/**
 * InventoryItem.java.
 *
 * Class that creates an InventoryItem Object
 * Containing name and price
 * Allows user to set the Tax Rate
 * 
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */

public class InventoryItem {
   
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * Constructor.
    * Takes in a name and price of InventoryItem Object
    *
    * @param nameIn - name of Item
    * @param priceIn - price of Item
    */
   public InventoryItem(String nameIn, double priceIn) {
      
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Returns name of InventoryItem.
    * @return name
    */
   public String getName() {
      return name;
   }   
   
   /**
    * Returns Price of InventoryItem.
    * calculated with taxRate
    * @return total price including taxRate
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Setter for taxRate.
    * @param taxRateIn - sets tax rate of InventoryItem
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Returns string representation of InventoryItem.
    * @return string output
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   

}