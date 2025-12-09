/**
 * OnlineTextItem.java.
 *
 * Subclass of InventoryItem
 * Abstract class for future subclasses
 * 
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */ 

public abstract class OnlineTextItem extends InventoryItem {

   
   /**
    * Constructor.
    * @param nameIn - name of Item
    * @param priceIn - price of Item
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
     
   }
   
   /**
    * Overrides parent calculateCost.
    * Returns price of item without
    * tax or shipping
    * @return price of item
    */
   public double calculateCost() {
      return price;
   }
   
}