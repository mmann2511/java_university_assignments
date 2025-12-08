import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;
import java.io.FileNotFoundException;
  /**
 * CloudStorageListTest Testing.
 * 
 * Test methods in CloudStorageList
 *
 * Project 11
 * @author Michael Mann - CPSC - 1220
 * @version 11/21/2025
 */ 

public class CloudStorageListTest {

/** Tests readFile, array sizes, and invalidRecords.
  * @throws FileNotFoundException if data file cannot be found
 */
   @Test public void readFileTest() 
                              throws FileNotFoundException {
      CloudStorageList list = new CloudStorageList();
      
      // using the file given
      list.readFile("cloud_storage_data_1.csv");
   
      // valid records
      Assert.assertTrue(list.getCloudStorageArray().length > 0);
   
      // invalid records
      Assert.assertTrue(list.getInvalidRecordsArray().length >= 0);
   }

   /** Tests addCloudStorage method. */
   @Test public void addCloudStorageTest() {
      CloudStorageList list = new CloudStorageList();
      CloudStorage cs = new DedicatedCloud("Test", 10.0, 5.0);
   
      list.addCloudStorage(cs);
   
      Assert.assertEquals(1, list.getCloudStorageArray().length);
      Assert.assertEquals("Test", list.getCloudStorageArray()[0].getName());
   }

   /** Tests addInvalidRecord method. */
   @Test public void addInvalidRecordTest() {
      CloudStorageList list = new CloudStorageList();
      list.addInvalidRecord("Test");
   
      Assert.assertEquals(1, list.getInvalidRecordsArray().length);
      Assert.assertEquals("Test", list.getInvalidRecordsArray()[0]);
   }

   /** Tests generateReport method.
     * @throws FileNotFoundException if data file cannot be found
     */
   @Test public void generateReportTest() 
                           throws FileNotFoundException  {
      CloudStorageList list = new CloudStorageList();
      list.readFile("cloud_storage_data_1.csv");
      
   
      String report = list.generateReport();
   
      Assert.assertTrue(report.contains("Monthly Cloud Storage Report"));
   }

   /** Tests generateReportByName method.
     * @throws FileNotFoundException if data file cannot be found
     */
   @Test public void generateReportByNameTest() 
                              throws FileNotFoundException {
      CloudStorageList list = new CloudStorageList();
      list.readFile("cloud_storage_data_1.csv");
   
      String report = list.generateReportByName();
   
      // Should sort and have "Cloud Five" First
      Assert.assertTrue(report.contains(
                        "Monthly Cloud Storage Report (by Name)"));
      Assert.assertEquals("Cloud Five",
                          list.getCloudStorageArray()[0].getName());
   }

   /** Tests generateReportByMonthlyCost method.
     * @throws FileNotFoundException if data file cannot be found
     */
   @Test public void generateReportByMonthlyCostTest() 
                              throws FileNotFoundException {
      CloudStorageList list = new CloudStorageList();
      list.readFile("cloud_storage_data_1.csv");
   
      String report = list.generateReportByMonthlyCost();
   
      // Should sort and have "Cloud One" First
      Assert.assertTrue(report.contains(
                        "Monthly Cloud Storage Report (by Monthly Cost)"));
      Assert.assertEquals("Cloud One",
                               list.getCloudStorageArray()[0].getName()); 
   }

}
