import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * SharedCloud Testing.
 * Test methods in SharedCloud
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class SharedCloudTest {


   /** 
    * Tests the Constructor.
    * getName method
    * getStorage method
    * getDataStored method
    * getDataLimit method
    */
   @Test public void constructorGetterTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      
      Assert.assertEquals("Cloud Two", c2.getName());
      Assert.assertEquals(9.00, c2.getBaseStorageCost(), 0.0001);
      Assert.assertEquals(12.00, c2.getDataStored(), 0.001);
      Assert.assertEquals(20.0, c2.getDataLimit(), 0.001);
   }
   
   /** Tests the setDataStored method. */
   @Test public void setDataStoredTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      
      c2.setDataStored(15.0);
      Assert.assertEquals(15.0, c2.getDataStored(), 0.001);
      
   }
   
  /** Tests the setDataLimit method. */
   @Test public void setDataLimitTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      
      c2.setDataLimit(30.0);
      Assert.assertEquals(30.0, c2.getDataLimit(), 0.001);
      
   }
   
  /** Tests the getCostFactor method. */
   @Test public void getCostFactorTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      
      Assert.assertEquals(1.0, c2.getCostFactor(), 0.001);
      
   }
   
   /** Tests the dataOverage method. */
   @Test public void dataOverageTest() {
     // If less than 0
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals(0.0, c2.dataOverage(), 0.001);
      // Else
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      Assert.assertEquals(5.0, c3.dataOverage(), 0.001);
      
   }
   
   /** Tests the monthlyCost method. */
   @Test public void monthlyCostTest() {
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(14.00, c3.monthlyCost(), 0.001);
   }
   
   /** Tests the toString method. */
   @Test public void toStringTest() {
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      
      Assert.assertTrue(c3.toString().contains("Monthly Cost: "));
      Assert.assertTrue(c3.toString().contains("Base Storage Cost: "));
      Assert.assertTrue(c3.toString().contains("Data Stored: "));
      Assert.assertTrue(c3.toString().contains("Data Limit: "));
      Assert.assertTrue(c3.toString().contains("Overage: "));
      Assert.assertTrue(c3.toString().contains("Cost Factor: "));
   }
  
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
