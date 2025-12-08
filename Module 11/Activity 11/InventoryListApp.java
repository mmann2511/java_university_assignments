/**
 * InventoryListApp.java.
 *
 * Driver Program for ItemsList.
 *
 * Activity 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/18/2025
 */

public class InventoryListApp {
   
   /**
    * Main Method.
    * Initializes ItemList object (array list)
    * Sets InventoryItem class Tax Rate
    *
    * Adds InventoryItem Objects to 
    * ItemsList array including:
    * InventoryItem, ElectronicsItem
    * OnlineBook, OnlineArticle
    *
    * @param args Command-Line (not used)
    */

   public static void main(String[] args) {
      
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.80));
      myItems.addItem(new OnlineBook("All Things Java", 12.30));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.40));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   
   
   }




}