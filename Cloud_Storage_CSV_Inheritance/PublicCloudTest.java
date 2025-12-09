import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * PublicCloud Testing.
 * Test methods in PublicCloud
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class PublicCloudTest {


  /** Tests the getCostFactor method. */
   @Test public void getCostFactorTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(2.0, c4.getCostFactor(), 0.001);
      
   }
   
   
   /** Tests the monthlyCost method. */
   @Test public void monthlyCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      
      Assert.assertEquals(19.00, c4.monthlyCost(), 0.001);
   }
   
   /** Tests the toString method. */
   @Test public void toStringTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      
      Assert.assertTrue(c4.toString().contains("(class PublicCloud) "));
      
   }
  
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
