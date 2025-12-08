import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;

/**
 * SpherocylinderList Testing.
 *
 * Test methods in Spherocylinder
 *
 * Project 9
 * @author Michael Mann - CPSC - 1220
 * @version 11/07/2025
 */
public class SpherocylinderListTest {

   /** Tests the constructor. */
   @Test public void constructorTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 1); 
      
      Assert.assertEquals("My List", list.getName());
      Assert.assertEquals(1, list.numberOfSpherocylinders());
      Assert.assertArrayEquals(ex1, list.getList());   
   }
   
   /** Tests the getName method. */
   @Test public void getNameTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 1); 
      
      Assert.assertEquals("My List", list.getName());   
         
   }     
   
   /** Tests the numberOfSpherocylinders method. */
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5];
      ex1[0] = new Spherocylinder("A", 1, 2); 
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 1); 
      
      Assert.assertEquals(1, list.numberOfSpherocylinders(), 0.000001);   
         
   } 
   
   /** Tests the totalSurfaceArea method. */
   @Test public void totalSurfaceAreaTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertEquals(301.592, list.totalSurfaceArea(), 0.001);   
         
   } 
   
   /** Tests the totalVolume method. */
   @Test public void totalVolumeTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertEquals(307.876, list.totalVolume(), 0.001);   
         
   }
   
   /** Tests the averageSurfaceArea method. */
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertEquals(100.530, list.averageSurfaceArea(), 0.001);
      
      // If statement
      Spherocylinder[] ex2 = new Spherocylinder[5];
      SpherocylinderList emptyList = 
                        new SpherocylinderList("Empty List", ex2, 0);
      
      Assert.assertEquals(0, emptyList.averageSurfaceArea(), 0.001);   
         
   }
   
   /** Tests the averageVolume method. */
   @Test public void averageVolumeTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertEquals(102.625, list.averageVolume(), 0.001);
      
      // If statement
      Spherocylinder[] ex2 = new Spherocylinder[5];
      SpherocylinderList emptyList = 
                  new SpherocylinderList("Empty List", ex2, 0);
      
      Assert.assertEquals(0, emptyList.averageVolume(), 0.001);   
         
   }
   
   /** Tests the toString method. */
   @Test public void toStringTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertTrue(list.toString().contains("----- Summary for "));
      Assert.assertTrue(list.toString().contains("Number of Spherocylinders"));
      Assert.assertTrue(list.toString().contains("Total Surface Area"));
      Assert.assertTrue(list.toString().contains("Total Volume"));
      Assert.assertTrue(list.toString().contains("Average Surface Area"));
      Assert.assertTrue(list.toString().contains("Average Volume"));    
         
   }
   
   /** Tests the getList method. */
   @Test public void getListTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      Assert.assertArrayEquals(ex1, list.getList());
   }   
   
   /** Tests the addSpherocylinder method. */
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 1); 
      
      // Add a Spherocylinder
      list.addSpherocylinder("B", 2, 3);
      // Check if in list
      Assert.assertEquals("B", list.getList()[1].getLabel());
      // Check that numberOfSpherocylinders increased
      Assert.assertEquals(2, list.numberOfSpherocylinders(), 0.0001);
   }
   
   /** Tests the findSpherocylinder method. */
   @Test public void findSpherocylinderTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
         
      Spherocylinder result = list.findSpherocylinder("B");   
      
      // True Test
      Assert.assertEquals("B", result.getLabel());
      Assert.assertEquals(2, result.getRadius(), 0.0001);
      Assert.assertEquals(3, result.getCylinderHeight(), 0.00001);
      
      //False Test
      Assert.assertNull(list.findSpherocylinder("F"));
   }   
   
   /** Tests the deleteSpherocylinder method. */
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3);
      
      // Delete B   
      Spherocylinder deleted = list.deleteSpherocylinder("B");   
      
      // Check if Deleted 
      Assert.assertEquals("B", deleted.getLabel());
      
      //Check B is no longer in the list
      Assert.assertNull(list.findSpherocylinder("B"));
      
      // Check that C moved from index 2 to 1
      Assert.assertEquals("C", ex1[1].getLabel());
      
      // Check if Index 2 is now null
      Assert.assertNull(ex1[2]);
      
      //False Test
      Assert.assertNull(list.deleteSpherocylinder("F"));
   }   
   
   /** Tests the editSpherocylinder method. */
   @Test public void editSpherocylinderTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 1); 
      
      // Edit A   
      Assert.assertTrue(list.editSpherocylinder("A", 5.5, 9.7));  
      
      
      // Check Radius and Cylinder Height of A
      Assert.assertEquals(5.5, ex1[0].getRadius(), 0.0001);
      Assert.assertEquals(9.7, ex1[0].getCylinderHeight(), 0.0001);
      
      //False Test
      Assert.assertFalse(list.editSpherocylinder("F", 1, 1));
   }  
   
   /** Tests the findSphercylinderWithLargestVolume method. */
   @Test public void findSpherocylinderWithLargestVolumeTest() {
      Spherocylinder[] ex1 = new Spherocylinder[5]; 
      ex1[0] = new Spherocylinder("A", 1, 2); 
      ex1[1] = new Spherocylinder("B", 2, 3);
      ex1[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list =
         new SpherocylinderList("My List", ex1, 3); 
      
      // For loop Updated True
      Assert.assertEquals("C",
          list.findSpherocylinderWithLargestVolume().getLabel());
          
     // For loop updated false
      Spherocylinder[] ex2 = new Spherocylinder[5]; 
      ex2[0] = new Spherocylinder("A", 10, 10); 
      ex2[1] = new Spherocylinder("B", 2, 3);
      ex2[2] = new Spherocylinder("C", 3, 4);
      
      SpherocylinderList list2 =
         new SpherocylinderList("For Loop", ex2, 3); 
     
      Assert.assertEquals("A",
          list2.findSpherocylinderWithLargestVolume().getLabel());      
      
      // If empty test
      Spherocylinder[] ex3 = new Spherocylinder[5];
      SpherocylinderList emptyList =
                new SpherocylinderList("Empty List", ex2, 0);
                
      Assert.assertNull(emptyList.findSpherocylinderWithLargestVolume());       
      
      
     
   } 

   
   
   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
           // + "this test once you have added your own.", 0, 1);
   //}
}
