import java.util.Comparator;

/**
 * MonthlyCostComparator.java.
 *
 * Implements the Comparator interface
 * ordering CloudStorage Objects
 *
 * Project 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/21/2025
 */

public class MonthlyCostComparator implements Comparator<CloudStorage> {
   
   /**
    * Compares two Cloud Storage objects by monthly cost.
    *
    * @param cs1 first CloudStorage obj
    * @param cs2 second CloudStorage obj
    * @return -1 if cs1 has higher monthyl cost than cs2
    * 1 if cs1 has lower monthyl cost than cs2
    * 0 if both have equal montly cost
    */
   public int compare(CloudStorage cs1, CloudStorage cs2) {
      if (cs1.monthlyCost() > cs2.monthlyCost()) {
         return -1; // higher cost
      }
      else if (cs1.monthlyCost() < cs2.monthlyCost()) {
         return 1; //lower
      }
      else {
         return 0; // same
      }
   
   
   }


}