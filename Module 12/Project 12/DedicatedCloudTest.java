import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * DedicatedCloud Testing.
 * Test abstract Super class (CloudStorage)
 * Test methods in DedicatedCloud
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class DedicatedCloudTest {


   /** 
    * Tests the Constructor.
    * getName method
    * getStorage method
    * getServerCost method
    */
   @Test public void constructorGetterTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      Assert.assertEquals("Cloud One", c1.getName());
      Assert.assertEquals(40.00, c1.getBaseStorageCost(), 0.0001);
      Assert.assertEquals(10.00, c1.getServerCost(), 0.001);
   }
   
   /** Tests the setName method. */
   @Test public void setNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      c1.setName("setName method");
      Assert.assertEquals("setName method", c1.getName());
   }
   
   /** Tests the setBaseStorageCost method. */
   @Test public void setBaseStorageCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      c1.setBaseStorageCost(37.00);
      Assert.assertEquals(37.00, c1.getBaseStorageCost(), 0.001);
   }
   
   /** Tests the setServerCost method. */
   @Test public void setServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      c1.setServerCost(15.00);
      Assert.assertEquals(15.00, c1.getServerCost(), 0.001);
   }
   
   /** Tests the getCount  and resetCount method. */
   @Test public void getCountAndResetCountTest() {
     // Reset First and Check 0
      CloudStorage.resetCount();
      Assert.assertEquals(0, CloudStorage.getCount(), 0.001);
     
      // Create 2 obj and Check 2
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      DedicatedCloud c2 = new DedicatedCloud("Cloud Two", 50.00, 30.00);
      
      Assert.assertEquals(2, CloudStorage.getCount(), 0.001);
   }
   
   /** Tests the monthlyCost method. */
   @Test public void monthlyCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      Assert.assertEquals(50.00, c1.monthlyCost(), 0.001);
   }
   
   /** Tests the toString method. */
   @Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      
      Assert.assertTrue(c1.toString().contains("Monthly Cost: "));
      Assert.assertTrue(c1.toString().contains("Base Storage Cost: "));
      Assert.assertTrue(c1.toString().contains("Server Cost: "));
   }
  
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
