/** 
 * BankLoan.java.
 * Creates instances of BankLoans
 * Contains methods to interract with bank
 * Borrow Money, Pay back money, charge interest
 * manage information about loan instances
 *
 * Activity 1
 * @author Michael Mann - CPSC - 1220
 * @version 10/21/2025
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
   /** 
    * Constructs a BankLoan object with customer name.
    * and interest rate.  
    * Balance is intiially set to 0.
    *
    * @param customerNameIn the name of the loan customer
    * @param interestRateIn the annual interest rate as a decimal
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
    
    /**
     * Attempts to Borrow an amount from bank.
     * If loan was successful
     * @param amount to borrow
     * @return true if loan was succesful
     * false if amount exceeds max loan limit
     */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
    /**
     * Pays bank an amount toward the loan balance.
     * If payment exceeds current balance,
     * overpayment is returned
     *
     * @param amountPaid amount to pay
     * @return the overpayment amount if the balance
     * becomes negative
     */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Returns the current balance of the loan.
    *
    * @return the loan  balance
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Sets the interest rate for the loan if the rate.
    * is valid between 0 and 1
    *
    * @param interestRateIn the interest rate as a decimal
    * @return true if the interest rate was succesful
    * false if not succesful
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Returns the current interest rate for the loan.
    *
    * @return the interest rate as a decimal
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Charges interest to the loan by increasing the balance.
    * based on the current interest rate
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Checks to see if a loan amount if valid.
    * @param amount to check
    * @return true if amount is greater than or
    * equal to 0
    * false if not
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;  
   }
   
   /**
    * Determines if a BankLoan object has ddebt.
    *
    * @param loan the BankLoan object to check
    * @return true if the loan's balance is greater than 0
    * false if not
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   
   }
   
   /**
    * Returns the number of BankLoan objects created.
    *
    * @return the number of loans created
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * Resets the count of Loans created to 0.
    *
    * @return the updated count (0)
    */
   public static int resetLoansCreated() {
      loansCreated = 0;
      return loansCreated;
   }
   
   /**
    * Returns a string represenation of the loan.
    * includes customer's name, interest rate, and balance
    * 
    * @return a formatted string describing the loan
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
