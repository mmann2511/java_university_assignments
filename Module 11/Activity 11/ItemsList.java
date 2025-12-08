/**
 * ItemsList.java.
 * 
 * Holds an array that contains
 * InventoryItem objects including its
 * subclasses using polymorphism
 *
 * Contains methods for adding items,
 * calculating totals, and showing inventory
 *
 * Activity 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/18/2025
 */

public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Constructor.
    * Initializes InventoryItem array list
    * Sets count (index) to 0.
    *
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * Adds InventoryItem object to inventory array.
    * at index "count"
    * increments count for next index in list
    *
    * @param itemIn - InventoryItem object
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn; //places item at current index
      count++; // increment the index
   }
   
   /**
    * Calculates total for all objects in list.
    * If object is ElectronicsItem adds surcharge
    *
    * @param electronicsSurcharge - sets surchage of
    * ElectronicsItem
    * @return total with added surcharge if ElectronicsItem
    * present - else calculateCost without surcharge
    */ 
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }   
      return total;
   }
   
   /**
    * String representation of objects in ItemList.
    *
    * @return output
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
   
   
  
}