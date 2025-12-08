import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;

 /**
 * Spherocylinder Testing.
 * 
 * Tests methods in Spherocylinder
 *
 * Project 8
 * @author - Michael Mann - CPSC - 1220
 * @version 10/30/2025
 */

public class SpherocylinderTest {

   
   /** Tests the getLabel method. */
   @Test public void getLabelTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Large Example", ex1.getLabel());
   }
   
     /** Tests the setLabel method. */
   @Test public void setLabelTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      // Valid label
      Assert.assertTrue(ex1.setLabel("Small Example"));
      Assert.assertEquals("Small Example", ex1.getLabel());
      // Invalid Test
      Assert.assertFalse(ex1.setLabel(null));
      Assert.assertEquals("Small Example", ex1.getLabel());
   }
   
     /** Tests the getRadius method. */
   @Test public void getRadiusTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(98.32, ex1.getRadius(), 0.000001);
   }
   
    /** Tests the setRadius method. */
   @Test public void setRadiusTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      //Valid Test
      ex1.setRadius(26.2); //reminder to call setter
      Assert.assertEquals(26.2, ex1.getRadius(), 0.000001);
      // Invalid Test
      Assert.assertFalse(ex1.setRadius(-3.0));
      Assert.assertEquals(26.2, ex1.getRadius(), 0.000001);   
   }
   
     /** Tests the getCylinderHeight method. */
   @Test public void getCylinderHeightTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(99.0, ex1.getCylinderHeight(), 0.000001);
   }
   
    /** Tests the setCylinderHeight method. */
   @Test public void setCylinderHeightTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      //Valid Test
      ex1.setCylinderHeight(50.1); //reminder to call setter
      Assert.assertEquals(50.1, ex1.getCylinderHeight(), 0.000001);
      // Invalid Test
      Assert.assertFalse(ex1.setCylinderHeight(-65.1));
      Assert.assertEquals(50.1, ex1.getCylinderHeight(), 0.000001);   
   }
   
    /** Tests the circumference method. */
   @Test public void circumferenceTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(617.7627794018969, ex1.circumference(), 0.000001);
   }
   
    /** Tests the surfaceArea method. */
   @Test public void surfaceAreaTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(182635.38810237678, ex1.surfaceArea(), 0.000001);
   }
   
    /** Tests the volume method.*/
   @Test public void volumeTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(6987754.655, ex1.volume(), 0.001);
   }
   
    /** Tests the toString method.*/
   @Test public void toStringTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertTrue(ex1.toString().contains("\"Large Example\""));
      Assert.assertTrue(ex1.toString().contains("circumference"));
      Assert.assertTrue(ex1.toString().contains("surface area"));
      Assert.assertTrue(ex1.toString().contains("volume"));
   }
   
    /** Tests the getcount and resetCount methods.*/
   @Test public void countTest() {
      Spherocylinder.resetCount();
      Spherocylinder ex1 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder ex2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(2, Spherocylinder.getCount());
      Spherocylinder.resetCount();
      Assert.assertEquals(0, Spherocylinder.getCount()); 
   }
   
    /** Tests the equals method.*/
   @Test public void equalsTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 3.0, 5.0);
      Spherocylinder ex2 = new Spherocylinder("large example", 3.0, 5.0);
      Spherocylinder ex3 = new Spherocylinder("Different", 3.0, 5.0);
      Spherocylinder ex4 = new Spherocylinder("Large Example", 3.000001, 5.0);
      Spherocylinder ex5 = new Spherocylinder("Large Example", 3.0, 5.000001);
      Assert.assertTrue(ex1.equals(ex2));
      Assert.assertFalse(ex1.equals(ex3));
      Assert.assertFalse(ex1.equals("not a Spherocylinder"));
      // Same Label, Different radius 
      Assert.assertFalse(ex1.equals(ex4));
      // Same, Label, Different height
      Assert.assertFalse(ex1.equals(ex5));
   }
   
   /** Tests the hashcode method. */
   @Test public void hashCodeTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 3.0, 5.0);
      Spherocylinder ex2 = new Spherocylinder("large example", 3.0, 5.0);
      Assert.assertEquals(0, ex1.hashCode());
      Assert.assertEquals(0, ex2.hashCode());
      Assert.assertTrue(ex1.equals(ex2));
      Assert.assertEquals(ex1.hashCode(), ex2.hashCode());   
   }
   
   /** Tests the toCompare method. */
   @Test public void compareToTest() {
      Spherocylinder ex1 = new Spherocylinder("Large Example", 3.0, 5.0);
      Spherocylinder ex2 = new Spherocylinder("Equal", 3.0, 5.0);
      Spherocylinder ex3 = new Spherocylinder("Less Than", 10.0, 15.0);
      Spherocylinder ex4 = new Spherocylinder("More Than", 1.0, 3.0);
      
      // Equals Test
      Assert.assertTrue(ex1.compareTo(ex2) == 0);
      // Less than Test
      Assert.assertTrue(ex1.compareTo(ex3) < 0);
      // More than Test
      Assert.assertTrue(ex1.compareTo(ex4) > 0);
   }
   
    /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
           // + "this test once you have added your own.", 0, 1);
   //}
 
   
}
