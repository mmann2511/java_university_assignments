import java.text.DecimalFormat;

/**
 * SharedCloud.java.
 *
 * Subclass of CloudStorage.java
 * Creates a SharedCloud object
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */
 
public class SharedCloud extends CloudStorage {
   
   protected double dataStored;
   protected double dataLimit;
   /** Constant cost factor used for overage calculation. */
   public static final double COST_FACTOR = 1.0;
   
   
   /**
    * Constructs a SharedCloud object.
    *
    * @param nameIn name of the cloud storage
    * @param baseStorageCostIn base monthly cost
    * @param dataStoredIn amount of data stored
    * @param dataLimitIn data limit
    */
   public SharedCloud(String nameIn, double baseStorageCostIn,
                      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn);
      
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn; 
                      
   }
   
   
   /**
    * Returns the amount of data stored.
    * @return data stored 
    */
   public double getDataStored() {
      return dataStored;
   }                  
   
   /**
    * Sets the amount of data stored.
    * @param dataStoredIn new data stored
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   } 
   
   /**
    * Returns the data limit.
    * @return data limit
    */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
    * Sets the data limit.
    * @param dataLimitIn - new data limit
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
    * Returns the cost factor for this class.
    * @return cost factor
    */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
    * Calculates the data overage.
    * If stored data is below the limit, return 0
    *
    * @return dataOverage calculation, 0 if none
    */
   public double dataOverage() {
      double dataOverage = dataStored - dataLimit;
      if (dataOverage < 0) {
         return 0;
      }
      else {
         return dataOverage;
      }
       
   }
   
   /**
    * Override from Super.
    * Calculates the monthly cost for this SharedCloud object.
    * Monthly cost = base storage cost + (dataOverage * cost factor)
    *
    * @return monthly cost 
    */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * COST_FACTOR;         
   }
   
   /**
    * Override from Super.
    * Returns a string representation of the SharedCloud object
    * Includes data stored, data limit, data overage, cost factor
    *
    * @return string describing this SharedCloud object
    */
   public String toString() {
      DecimalFormat gb = new DecimalFormat("0.000"); 
      return super.toString()
         + "\nData Stored: " + gb.format(dataStored) + " GB"
         + "\nData Limit: " + gb.format(dataLimit) + " GB"
         + "\nOverage: " + gb.format(dataOverage()) + " GB"
         + "\nCost Factor: " + getCostFactor();
   }
 
 
 
}