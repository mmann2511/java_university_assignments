/**
 * OnlineArticle.java.
 *
 * Subclass of OnlineTextItem
 * Creates an OnlineArticle object
 * Includes wordCount of Article
 * 
 * Activity 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/11/2025
 */   


public class OnlineArticle extends OnlineTextItem {
   
   private int wordCount;

   
   /**
    * Constructor.
    * Creates OnlineArticle
    * Including name, price, and wordCount of Article
    * Initilizaes wordCount to 0%*
    * @param nameIn - name of article
    * @param priceIn - price of article
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      wordCount = 0;
   }
   
   /**
    * Setter for word count of Article.
    * @param wordCountIn - sets wordCount
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }


}