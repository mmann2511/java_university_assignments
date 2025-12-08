import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Test;

 /** 
 * BankLoan Testing.
 * Tests methods in BankLoan
 *
 * Activity 1
 * @author Michael Mann - CPSC - 1220
 * @version 10/21/2025
*/
public class BankLoanTest {

   /** Tests the chargeInterest method of the BankLoan Class. */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
   
  /** Tests borrowing money increases the balance properly. */
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      //Valid
      boolean result = loan1.borrowFromBank(500.0);
      Assert.assertTrue(result);
      Assert.assertEquals(500.0, loan1.getBalance(), 0.000001);
      //Invalid
      result = loan1.borrowFromBank(100001.0);
      Assert.assertFalse(result);
      Assert.assertEquals(500.0, loan1.getBalance(), 0.000001);
   }
  

   /** Tests paying the bank decreases the balance properly. */
   @Test public void payBankTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(500.0);
      double overpay = loan1.payBank(200.0);
      Assert.assertEquals(300.0, loan1.getBalance(), 0.000001);
      Assert.assertEquals(0.0, overpay, 0.000001);
   }

   /** Tests overpayment returns correct refund amount. */
   @Test public void payBankOverpaymentTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(100.0);
      double overpay = loan1.payBank(150.0);
      Assert.assertEquals(0.0, loan1.getBalance(), 0.000001);
      Assert.assertEquals(50.0, overpay, 0.000001);
   }

   /** Tests setting a valid interest rate. */
   @Test public void setInterestRateValidTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      //Valid
      Assert.assertTrue(loan1.setInterestRate(0.5));
      Assert.assertEquals(0.5, loan1.getInterestRate(), 0.000001);
      //Invalid n < 0
      Assert.assertFalse(loan1.setInterestRate(-2.0));
      Assert.assertEquals(0.5, loan1.getInterestRate(), 0.000001);
      //Invalid n > 1
      Assert.assertFalse(loan1.setInterestRate(2.0));
      Assert.assertEquals(0.5, loan1.getInterestRate(), 0.000001);
   }

   /** Tests isAmountValid returns correct result. */
   @Test public void isAmountValidTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      Assert.assertTrue(BankLoan.isAmountValid(500.0));
      Assert.assertFalse(BankLoan.isAmountValid(-1.0));
   }

   /** Tests isInDebt returns true when balance is greater than 0. */
   @Test public void isInDebtTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(100.0);
      Assert.assertTrue(BankLoan.isInDebt(loan1));
      loan1.payBank(100.0);
      Assert.assertFalse(BankLoan.isInDebt(loan1));
   }

   /** Tests static loan counter methods. */
   @Test public void loansCreatedTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      int currentCount = BankLoan.getLoansCreated();
      BankLoan loan2 = new BankLoan("John", 0.05);
      Assert.assertEquals(currentCount + 1, BankLoan.getLoansCreated());
      BankLoan.resetLoansCreated();
      Assert.assertEquals(0, BankLoan.getLoansCreated());
   }

   /** Tests toString includes key loan info. */
   @Test public void toStringTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(250.0);
      String output = loan1.toString();
      Assert.assertTrue(output.contains("Jane"));
      Assert.assertTrue(output.contains("Balance"));
   }
   
         /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
   //}
}
