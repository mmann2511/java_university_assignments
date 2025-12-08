/**
 * InventoryApp.java.
 *
 * Driver program for Activity 10.
 * Creates multiple InventoryItem objects 
 * Sets tax rate
 * Creates different subclass objects of
 * Inventory Item
 *
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */

public class InventoryApp {

   
   /**
    * Main method.
    * Sets the tax rate and creates multiple
    * InventoryItem objects including
    * ElectronicsItem, OnlineArticle,
    * and OnlineBook
    *
    * @param args Command-line arguments (not used).
    */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   
   
   }

}