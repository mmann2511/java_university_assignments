import org.junit.Test;
import org.junit.Assert;
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
    * This should exercise the args.length == 0 branch in CloudStoragePart2.
    * @throws FileNotFoundException if file not found
    */
   @Test public void testMainNoArgs() throws FileNotFoundException {
      String[] args = {}; // empty array
      CloudStoragePart3.main(args);
   
      // Exercise default constructor to satisfy code coverage
      CloudStoragePart3 app = new CloudStoragePart2();
   
      // Check SharedCloud.COST_FACTOR is still 1.0
      Assert.assertEquals(1.0, SharedCloud.COST_FACTOR, 0.0001);
   }

   /**
    * Test main method with a valid file name as command line argument.
    * @throws FileNotFoundException if file not found
    */
   @Test public void testMainWithFile() throws FileNotFoundException {
      String[] args = {"cloud_storage_data_2_exceptions.csv"}; // your provided data file
      CloudStoragePart3.main(args);
   
      // Check SharedCloud.COST_FACTOR is correct
      Assert.assertEquals(1.0, SharedCloud.COST_FACTOR, 0.0001);
   }
   
  
   @Test public void mainInvalidFileTest() {
      String[] args = {"nofile.csv"};
      String output = CloudStoragePart3.main(args);
      Assert.assertTrue(output.contains("*** Attempted to read file"));
      Assert.assertTrue(output.contains("nofile.csv"));
   }

    
   @Test public void mainValidFileWithExceptionsTest() {
      String[] args = {"cloud_storage_data_2_exceptions.csv"};
      String output = CloudStoragePart3.main(args);
   
        // Reports headers
      Assert.assertTrue(output.contains("Monthly Cloud Storage Report"));
      Assert.assertTrue(output.contains("Monthly Cloud Storage Report (by Name)"));
      Assert.assertTrue(output.contains("Monthly Cloud Storage Report (by Monthly Cost)"));
      Assert.assertTrue(output.contains("Invalid Records Report"));
   
        // Known exceptions
      Assert.assertTrue(output.contains("NumberFormatException"));
      Assert.assertTrue(output.contains("NoSuchElementException"));
      Assert.assertTrue(output.contains("InvalidCategoryException"));
   }
   
   
}