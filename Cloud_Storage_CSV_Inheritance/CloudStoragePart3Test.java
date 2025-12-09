import org.junit.Test;
//import org.junit.Assert;
import java.io.FileNotFoundException;

/**
 * CloudStoragePart3Test.java
 *
 * Test class for CloudStoragePart3 driver.
 * Covers both main method scenarios:
 *
 * Project 12
 * @author Michael Mann
 * @version 11/25/2025
 */
public class CloudStoragePart3Test {

   /**
    * Test main method with no command line arguments.
    * 
    * @throws FileNotFoundException if file not found
    */
   @Test public void testMainNoArgs() throws FileNotFoundException {
      String[] args = {}; // empty array
      CloudStoragePart3.main(args);
      
     
   }

   /**
    * Test main method with a valid file name as command line argument.
    * @throws FileNotFoundException if file not found
    */
   @Test public void testMainWithFile() throws FileNotFoundException {
      String[] args = {"cloud_storage_data_2_exceptions.csv"};
      CloudStoragePart3.main(args);
   }
   
   /**
    * Tests main method with Invalid File.
    */
   @Test public void mainInvalidFileTest() {
      String[] args = {"nofile.csv"};
      CloudStoragePart3.main(args);
   }
   
   
}
