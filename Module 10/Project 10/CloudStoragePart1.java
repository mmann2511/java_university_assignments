/**
 * CloudStoragePart1.java.
 *
 * Driver program for Project 10.
 * Creates multiple CloudStorage Objects 
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class CloudStoragePart1 {

   /**
    * Main method.
    * Creates CloudStorage objects
    * including DedicatedCloud, SharedCloud
    * PublicCloud, and PersonalCloud
    *
    * @param args Command-line arguments (not used).
    */
   public static void main(String[] args) {
   
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      System.out.println(c1 + "\n");
      System.out.println(c2 + "\n");
      System.out.println(c3 + "\n");
      System.out.println(c4 + "\n");
      System.out.println(c5);
   }

}