import java.text.DecimalFormat;


/**
 * SpherocylinderList.java.
 *
 * Creates a Spherocylinder List
 * containing Spherocylinder objects
 * Allows you to do various methods on the list
 * Find a specefic object, total and avg volume
 * and surface area.
 *
 * Project 9
 * @author Michael Mann - CPSC - 1220
 * @version 11/7/2025
 */
public class SpherocylinderList {
   
   private String listName;
   private Spherocylinder[] spheroList;
   private int numberOfSpherocylinders;
   
   
   /**
    * Constructor.
    * Creates a list containing 
    * Spherocylinder Objects
    *
    * @param listNameIn for listName
    * @param spheroListIn for spheroList
    * @param numberOfSpherocylindersIn
    * for numberOfSpherocylinders
    */
   public SpherocylinderList(String listNameIn, 
                             Spherocylinder[] spheroListIn, 
                             int numberOfSpherocylindersIn) {
                             
      listName = listNameIn;
      spheroList = spheroListIn;
      numberOfSpherocylinders = 
         numberOfSpherocylindersIn;                           
   }
   
   
   /**
    * Returns name of SpheroList.
    * @return listname
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Returns number of Spherocylinders.
    * inside of the list
    * @return numberOfSpherocylinders
    */
   public int numberOfSpherocylinders() {
      return numberOfSpherocylinders;
   
   }
   
   /**
    * Returns total surface area.
    * of all spherocylinders in the list
    * @return totalSurfaceArea
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      
      int index = 0;
      while (index < numberOfSpherocylinders) {
         totalSurfaceArea += spheroList[index].surfaceArea();
         index++;
      
      }
      
      return totalSurfaceArea;
   }
   
   
   /**
    * Returns total volume of.
    * all spherocylinders in the list
    * @return totalVolume
    */
   public double totalVolume() {
      double totalVolume = 0;
      
      int index = 0;
      while (index < numberOfSpherocylinders) {
         totalVolume += spheroList[index].volume();
         index++;
      }
      
      return totalVolume;
   }
   
   
   /**
    * Returns average Surface Area.
    * Of all spherocylinders in the list
    * @return avgSurfaceArea
    */
   public double averageSurfaceArea() {
      if (numberOfSpherocylinders == 0) {
         return 0;
      }
      return totalSurfaceArea() / numberOfSpherocylinders;
   }
   
   /**
    * Returns average Volume.
    * Of all spherocylinders in the list
    * @return avgVolume
    */
   public double averageVolume() {
      if (numberOfSpherocylinders == 0) {
         return 0;
      }
      return totalVolume() / numberOfSpherocylinders;
   }
   
   
   /**
    * Returns a string representation of the.
    * Spherocylinder Summary
    * @return result
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + getName() + " -----"
         + "\nNumber of Spherocylinders: " + numberOfSpherocylinders()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
   
   }
   
   
   /**
    * Returns Sphercylinder List.
    * @return spheroList
    */
   public Spherocylinder[] getList() {
      return spheroList;
   
   }
   
   
   /**
    * Add a Spherocylinder to the list.
    *
    * @param labelIn - name of Spherocylinder
    * @param radiusIn - radius of Spherocylinder
    * @param cylinderHeightIn - height of Spherocylinder
    */
   public void addSpherocylinder(String labelIn, 
                                 double radiusIn,
                                 double cylinderHeightIn) {
      
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn,
                                              cylinderHeightIn);
      spheroList[numberOfSpherocylinders] = s;
      numberOfSpherocylinders++;                              
   
   }
   
   /**
    * Finds a Spherocylinder in the list.
    * with label
    *
    * @param labelIn - label of Spherocylinder
    * @return Spherocylinder
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn)) {
            return spheroList[i];
         }
      }
      return null;
   }
   
   /**
    * Deletes a Spherocylinder from the list.
    *
    * @param labelIn - label of Spherocylinder
    * @return deleted Spherocylinder
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
     
     
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn)) {
         
            Spherocylinder deleted = spheroList[i];
            
         
            for (int j = i; j < numberOfSpherocylinders - 1; j++) {
               spheroList[j] = spheroList[j + 1];
            }
            spheroList[numberOfSpherocylinders - 1] = null;
            numberOfSpherocylinders--;
            
            return deleted;
         }
      }
      return null;
   }
   
   
   /**
    * Finds Spherocylinder in list with labelIn.
    * Edits radius and height with radiusIn and
    * cylinderHeightIn
    *
    * @param labelIn - label of Spherocylinder you want to edit
    * @param radiusIn - new radius of Spherocylinder
    * @param cylinderHeightIn - new height of Spherocylinder
    * @return true - if label found and sets radius/height
    * false if no label found
    */
   public boolean editSpherocylinder(String labelIn,
                                     double radiusIn,
                                     double cylinderHeightIn) {
                                     
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (spheroList[i].getLabel().equalsIgnoreCase(labelIn)) {
            spheroList[i].setRadius(radiusIn);
            spheroList[i].setCylinderHeight(cylinderHeightIn);
            return true;
         }
      }                                                            
      return false;
   
   }
   
   /**
    * Finds Spherocylinder in list with Largest Volume.
    *
    * @return Spherocylinder
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
     
      if (numberOfSpherocylinders == 0) {
         return null;
      }
     
      Spherocylinder largest = spheroList[0];
   
      for (int i = 1; i < numberOfSpherocylinders; i++) {
         if (spheroList[i].volume() > largest.volume()) {
            largest = spheroList[i];
         }
      }
      return largest;
   
   
   }
   
   
   
}