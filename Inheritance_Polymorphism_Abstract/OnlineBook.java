/**
 * OnlineBook.java.
 *
 * Subclass of OnlineTextItem
 * Creates an OnlineBook object
 * Includes author of Book
 * 
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */     

public class OnlineBook extends OnlineTextItem {
   
   protected String author;
   
   
   /**
    * Constructor.
    * Includes name and price of book
    * Initializes author placeholder
    * @param nameIn - name of book
    * @param priceIn - price of book
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      author = "Author Not Listed";
   }
   
   /**
    * Setter for author of book.
    * @param authorIn - author of book
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   
   /**
    * String representation of OnlineBook.
    * Overrides parent toString
    * @return string reprsentation including author
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }   


}