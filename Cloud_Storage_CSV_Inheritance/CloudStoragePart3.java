import java.io.FileNotFoundException;

/**
 * CloudStoragePart3.java.
 *
 * Reads a cloud storage data file
 * Creates a CloudStorageList Object
 * Generates 3 Reports, ordered differently
 *
 * Project 12
 * @author Michael Mann - CPSC - 1220
 * @version 11/25/2025
 */
public class CloudStoragePart3 {
    /**
     * Main method.
     * @param args Command line arguments
     * expects args[0] to be data file
     */
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
         return;
      }
      try {
         // Create CloudStorageList object
         CloudStorageList cloudList = new CloudStorageList();
      
         // Reading the file from command line
         cloudList.readFile(args[0]);
      
         // Print reports
         System.out.println(cloudList.generateReport());
         System.out.println(cloudList.generateReportByName());
         System.out.println(cloudList.generateReportByMonthlyCost());
         System.out.println(cloudList.generateInvalidRecordsReport());
      }
      catch (FileNotFoundException e) {
         System.out.print("*** Attempted to read file: " + e.getMessage());
      }
   }

}