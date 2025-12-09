/**
 * ElectronicsItem.java.
 *
 * Subclass of InventoryItem
 * Creates an ElectronicsItem Object
 * Adds weight of item and shipping cost
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */

public class ElectronicsItem extends InventoryItem {
   
   protected double weight;
   /**
    * Shipping cost per pound for all electronics items.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Constructor.
    * Creates an ElectronicsItem object
    * with nameIn, priceIn from super class
    * Adds double weightIn
    * @param nameIn - name of Item
    * @param priceIn - price of Item
    * @param weightIn - weight of Item
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      
      weight = weightIn;
   }
   
   
   /**
    * Overrides parent calculateCost.
    * Adds in Shipping Cost calculation
    * @return the total cost including shipping
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }


}