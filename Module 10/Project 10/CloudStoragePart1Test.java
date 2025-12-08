import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * CloudStoragePart1 Testing.
 * Test methods in Driver Program
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class CloudStoragePart1Test {


  /** Tests the cloudStorage Count method. */
   @Test public void cloudStorageCountTest() {
     
      CloudStorage.resetCount();
      CloudStoragePart1 csp1 = new CloudStoragePart1();
      CloudStoragePart1.main(null);
      Assert.assertEquals("CloudStorage count should be 5. ",
                            5, CloudStorage.getCount());
   }
   
 
 
   
  
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
