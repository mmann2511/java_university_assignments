import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * PersonalCloud Testing.
 * Test methods in PersonalCloud
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */  

public class PersonalCloudTest {


  /** Tests the getCostFactor method. */
   @Test public void getCostFactorTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      Assert.assertEquals(3.0, c5.getCostFactor(), 0.001);
      
   }
   
   
   /** Tests the monthlyCost method. */
   @Test public void monthlyCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      
      Assert.assertEquals(12.00, c5.monthlyCost(), 0.001);
   }
   
  
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}