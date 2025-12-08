
/**
 * PersonalCloud.java.
 *
 * Subclass of SharedCloud
 * Create a PersonalCloud object
 * With higher overage cost
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */

public class PersonalCloud extends SharedCloud {
   /** Cost factor for personal cloud overage calculation. */
   public static final double COST_FACTOR = 3.0;
   
   /**
    * Consrtucts a PersonalCloud Object.
    *
    * @param nameIn - name of the cloud storage
    * @param baseStorageCostIn - base monthly storage cost
    * @param dataStoredIn - data stored
    * @param dataLimitIn - data limit
    */
   public PersonalCloud(String nameIn, double baseStorageCostIn,
                      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
    * Returns the cost factor for this PersonalCloud.
    * @return cost factor
    */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
    * Overrides Super.
    * Calculates monthly cost
    * Monthly cost = base storage cost + (dataOverage * cost factor)
    * @return monthly cost
    */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * getCostFactor();
   }                   


}