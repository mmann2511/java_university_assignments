import java.text.DecimalFormat;

/**
 * CloudStorage.java.
 *
 * Abstract Class describing cloud storage data
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */

public abstract class CloudStorage {

   protected String name;
   protected double baseStorageCost;
   protected static int cloudStorageCount = 0;
   
   
   /**
    * Constructs a CloudStorage Object.
    * @param nameIn name of the storage object
    * @param baseStorageCostIn base storage cost
    */
   public CloudStorage(String nameIn, double baseStorageCostIn) {
   
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      cloudStorageCount++;
   }
   
   
   /**
    * Returns CloudStorage name.
    * @return name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Sets name of CloudStorage.
    * @param nameIn - name of object
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Returns CloudStorage base storage cost.
    * @return baseStorageCost
    */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
   /**
    * Sets baseStorageCost of CloudStorage.
    * @param baseStorageCostIn base storage cost
    */
   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }
   
   /**
    * Gets count of CloudStorage Objects Created.
    * @return count
    */
   public static int getCount() {
      return cloudStorageCount;
   }
   
   /**
    * Resets CloudStorage count to 0.
    */
   public static void resetCount() {
      cloudStorageCount = 0;
   }
   
   /**
    * Returns a string representation of CloudStorage.
    * @return string describing the object
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return name + " (" + this.getClass() + ") "
         + "Monthly Cost: " + df.format(monthlyCost())
         + "\nBase Storage Cost: " + df.format(baseStorageCost); 
   }
   
   /**
    * Abstract method monthlyCost.
    * @return monthly cost of cloud storage
    */
   public abstract double monthlyCost(); // cannot have a body



}