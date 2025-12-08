import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
/**
 * MonthlyCostComparator Testing.
 * 
 * Test methods in MonthlyCostComparator
 *
 * Project 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/21/2025
 */  

public class MonthlyCostComparatorTest {


   /** 
    * Tests the Comparator Class.
    * 
    */
   @Test public void comparatorTest() {
      MonthlyCostComparator comp = new MonthlyCostComparator();
   
      CloudStorage high = new DedicatedCloud("High", 20.0, 10.0); 
      CloudStorage low = new DedicatedCloud("Low", 10.0, 5.0);    
      CloudStorage same1 = new DedicatedCloud("Same1", 5.0, 5.0); 
      CloudStorage same2 = new DedicatedCloud("Same2", 7.0, 3.0);  
   
        // cs1 > cs2 → -1
      Assert.assertEquals(-1, comp.compare(high, low));
   
        // cs1 < cs2 → 1
      Assert.assertEquals(1, comp.compare(low, high));
   
        // cs1 == cs2 → 0
      Assert.assertEquals(0, comp.compare(same1, same2));
   }
}