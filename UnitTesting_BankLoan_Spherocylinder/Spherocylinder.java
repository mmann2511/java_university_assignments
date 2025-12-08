import java.text.DecimalFormat;

/**
 * Spherocylinder.java.
 * 
 * Create Spherocylinder Objects
 * Recieves label, radius, and cylinder height
 * as well as getter and setter methods for each
 *
 * Calculates Circumference, Surface Area
 * and volume.
 *
 * Project 7
 * @author - Michael Mann - CPSC - 1220
 * @version 10/23/2025
 */
public class Spherocylinder {
   
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   private static int spheroCreated = 0;
   
   
   /**
    * Consrtucts a Spherocylinder object with.
    * Label, Radius, and Cylinder Height
    * Counts each object created.
    * @param labelIn - label of object
    * @param radiusIn - radius of object
    * @param cylinderHeightIn - cylinder height of object
    */
   public Spherocylinder(String labelIn, double radiusIn,
                         double cylinderHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      spheroCreated++;
      
   }
   
   /**
    * Returns current label of Spherocylinder.
    *
    * @return label of object
    */
   public String getLabel() { 
      return label;
   }
   
   /**
    * Sets label of the Spherocylinder.
    * @param labelIn - new label
    * @return true if label was set successfully
    * false otherwise
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
      
   }
   
   /**
    * Returns current Radius of Spherocylinder.
    *
    * @return radius of object
    */
   public double getRadius() { //done
      return radius;
   }
   
   /**
    * Sets radius of the Spherocylinder.
    * @param radiusIn - new radius
    * @return true if radius positive
    * false if negative 
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      } 
   }   
   
    /**
    * Returns current height of Spherocylinder.
    *
    * @return cylinderHeight of object
    */
   public double getCylinderHeight() { 
      return cylinderHeight;
   }
   
   /**
    * Sets height of the Spherocylinder.
    * @param cylinderHeightIn - new height
    * @return true if cylinderHeight posiitve
    * false if negative 
    */
   public boolean setCylinderHeight(double cylinderHeightIn) { 
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      else {
         return false;
      }      
   }
   
   /**
    * Calculates circumference using radius.
    * @return circumference
    */
   public double circumference() { 
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
   
   /**
    * Calculates surface area using.
    * radius and cylinder height
    * @return surface area
    */
   public double surfaceArea() { 
      double surfaceArea = 2 * Math.PI * radius * (2 * radius + cylinderHeight);
      return surfaceArea;
   }
   
   /**
    * Calculates volume using.
    * radius and cylinder height
    * @return volume
    */
   public double volume() { 
      double volume = (Math.PI * Math.pow(radius, 2)) 
                         * (((4.0 / 3.0) * radius)
                         +  cylinderHeight);
      return volume;
   }
   
   /**
    * Returns a string represenation of the Sphercylinder.
    * includes label, radius, cylinder height
    * circumference, surface area, and volume
    *
    * @return a formatted string describing the Spherocylinder
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\""
         + " with radius " + df.format(radius)
         + " and cylinder height " + df.format(cylinderHeight) + " has:\n"
         + "\tcircumference = " + df.format(circumference()) + " units\n"
         + "\tsurface area = " + df.format(surfaceArea()) + " square units\n"
         + "\tvolume = " + df.format(volume()) + " cubic units";
      return output;    
   }
   
    /**
    * Returns the number of Spherocylinder objects created.
    *
    * @return the number of Spherocylinder created
    */
   public static int getCount() {
      return spheroCreated;
   }
   
    /**
    * Resets the count of Spherocylinder created to 0.
    *
    */
   public static void resetCount() {
      spheroCreated = 0;
   }   
   
   /**
    * Determines whether this Spherocylinder is.
    * equal to another Spherocylinder
    * Two are considered equal if they have
    * the same label (case insenitive), or
    * the same radius and cylinder height...
    * within a small tolerance
    *
    * @param obj the object to compare to this Spherocylinder
    * @return true if the specified object is a Spherocylinder
    * with the same label, radius, height; false otherwise
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < .000001
                  && Math.abs(cylinderHeight - d.getCylinderHeight())
                     < .000001);
      }                  
   }
   
   /**
    * Returns a hash code value for this Spherocylinder.
    *<p>
    * This implementation always returns 0
    *
    * @return the has code value for this Sphercylinder
    */
   public int hashCode() {
      return 0;
   }   


}