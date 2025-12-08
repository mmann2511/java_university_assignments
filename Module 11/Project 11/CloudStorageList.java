import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * CloudStorageList.java.
 * Creates an array for CloudStorage Objects
 * and invalid records
 *
 * Reads in data from file, stores valid objects
 * stores invalid records, and generate reports
 * in different orders
 *
 * Project 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/21/2025
 */
public class CloudStorageList {
   
   private CloudStorage[] cloudStorageArray; 
   private String[] invalidRecords;
   
   /**
    * Constructor.
    * Initializes arrays to empty
    */
   public CloudStorageList() {
      cloudStorageArray = new CloudStorage[0];
      invalidRecords = new String[0];
   
   }
   
   /**
    * Returns array of CloudStorage objects.
    * @return array of valid objects
    */
   public CloudStorage[] getCloudStorageArray() {
      return cloudStorageArray;
   }
   /**
    * Returns array of Invalid records.
    * @return array of invalid records
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /**
    * Adds a CloudStorage object to the array.
    * Exapnds the array as needed
    * @param obj CloudStorage obj to add
    */
   public void addCloudStorage(CloudStorage obj) {
      cloudStorageArray = Arrays.copyOf(
                  cloudStorageArray, cloudStorageArray.length + 1);
      cloudStorageArray[cloudStorageArray.length - 1] = obj;
   }
   
   /**
    * Adds an Invalid record to the array.
    * Exapnds the array as needed
    * @param obj invalid record to add
    */
   public void addInvalidRecord(String obj) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = obj;
   }
   
     /**
    * Reads a file containing CloudStorage records.
    * @param fileNameIn name of CSV File
    * @throws FileNotFoundException if file not found
    */
   public void readFile(String fileNameIn)
                        throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      
      while (fileScan.hasNext()) {
         String line = fileScan.nextLine();
         
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         
         char category = lineScan.next().charAt(0);
         String name = lineScan.next();
         double baseStorageCost = Double.parseDouble(lineScan.next());
         
         CloudStorage obj = null;
         
         switch (category) {
            
            case 'D':
               double serverCost = Double.parseDouble(lineScan.next());
               obj = new DedicatedCloud(name, baseStorageCost, serverCost);
               break;
               
            case 'S':
               double dataStored = Double.parseDouble(lineScan.next());
               double dataLimit = Double.parseDouble(lineScan.next());
               obj = new SharedCloud(
                        name, baseStorageCost, dataStored, dataLimit);
               break;
               
            case 'C':
               double publicData = Double.parseDouble(lineScan.next());
               double publicLimit = Double.parseDouble(lineScan.next());
               obj = new PublicCloud(
                        name, baseStorageCost, publicData, publicLimit);
               break;
            
            case 'P':
               double personalData = Double.parseDouble(lineScan.next());
               double personalLimit = Double.parseDouble(lineScan.next());
               obj = new PersonalCloud(
                        name, baseStorageCost, personalData, personalLimit);
               break;
            
            default:
               addInvalidRecord(line);
               continue;     
         }
          
         addCloudStorage(obj);
      }
      
      
   }
   
   /**
    * Generates a report of the cloud storage objects.
    * In order they were read from the file
    * @return string containing the formatted report
    */
   public String generateReport() { // orignal order from file
      String result = "";
      result += "-------------------------------\n";
      result += "Monthly Cloud Storage Report\n";
      result += "-------------------------------";
      for (CloudStorage obj : cloudStorageArray) {
         result += "\n" + obj.toString() + "\n";
      }
      return result;       
   }
   
    /**
    * Generates a report of the cloud storage objects.
    * Sorted by Name (natural ordering)
    * @return string containing the formatted report
    */
   public String generateReportByName() { // natural ordering from Arrays.sort
      Arrays.sort(getCloudStorageArray());
      String result = "";
      result += "-----------------------------------------\n";
      result += "Monthly Cloud Storage Report (by Name)\n";
      result += "-----------------------------------------";
      for (CloudStorage obj : cloudStorageArray) {
         result += "\n" + obj.toString() + "\n";
      }
      return result; 
   }
   
   /**
    * Generates a report of the cloud storage objects.
    * Sorted by Monthly Cost (highest to lowest)
    * @return string containing the formatted report
    */
   public String generateReportByMonthlyCost() {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String result = "";
      result += "-------------------------------------------------\n";
      result += "Monthly Cloud Storage Report (by Monthly Cost)\n";
      result += "-------------------------------------------------";
      for (CloudStorage obj : cloudStorageArray) {
         result += "\n" + obj.toString() + "\n";
      }
      return result;
   }

}