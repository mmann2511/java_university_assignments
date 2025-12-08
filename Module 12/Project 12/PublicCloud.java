
/**
 * PublicCloud.java.
 *
 * Subclass of SharedCloud
 * Create a PublicCloud object
 * With higher overage cost
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */

public class PublicCloud extends SharedCloud {
   /** Cost factor for public cloud overage calculation. */
   public static final double COST_FACTOR = 2.0;
   
   /**
    * Consrtucts a PublicCloud Object.
    *
    * @param nameIn - name of the cloud storage
    * @param baseStorageCostIn - base monthly storage cost
    * @param dataStoredIn - data stored
    * @param dataLimitIn - data limit
    */
   public PublicCloud(String nameIn, double baseStorageCostIn,
                      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
    * Returns the cost factor for this PublicCloud.
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