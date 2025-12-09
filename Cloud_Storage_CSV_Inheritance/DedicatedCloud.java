import java.text.DecimalFormat;
/**
 * DedicatedCloud.java.
 *
 * Subclass of CloudStorage
 * Creates a DedicatedCloud object
 *
 *
 * Project 10
 * @author Michael Mann - CPSC - 1220
 * @version 11/13/2025
 */

public class DedicatedCloud extends CloudStorage {
   
   private double serverCost;
   
   /**
    * Consrtucts a DedicatedCloud object.
    * @param nameIn - name of the cloud storage
    * @param baseStorageCostIn - base storage cost
    * @param serverCostIn server cost
    */
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
                                             double serverCostIn) {
      super(nameIn, baseStorageCostIn);                      
      
      serverCost = serverCostIn;
   } 
   
   /**
    * Returns the server cost.
    * @return serverCost
    */
   public double getServerCost() {
      return serverCost;
   }
   
   /**
    * Sets the server cost.
    * @param serverCostIn new server cost
    */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   
   /**
    * Override from Super.
    * Calculates and returns the monthly cost.
    * @return monthly cost
    */
   public double monthlyCost() {
      return baseStorageCost + serverCost;
   }
   
   /**
    * Override from Super.
    * Returns a string representation of DedicatedCloud
    * Includes sever cost
    * @return string description
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return super.toString()
          + "\nServer Cost: " + df.format(serverCost);
   }
   
                        
}