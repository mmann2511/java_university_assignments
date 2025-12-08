/**
  * Customer.java.
  *
  * Creates a Customer object
  * Recieves String name and allows you
  * to set location and balance of customer
  * Allows you to compare different customer objects
  * Activity 8
  * @author Michael Mann - CPSC - 1220
  * @version 10/28/2025
  */


public class Customer implements Comparable<Customer> {
   // instance variables
   private String name = "";
   private String location = "";
   private double balance = 0;
   
   
   /**
     * Constructs a Customer object with name.
     * Initalizes location to empty string
     * and balance to 0
     *
     * @param nameIn - name of object
     */
   public Customer(String nameIn) {
      this.name = nameIn;
      this.location = "";
      this.balance = 0;
   
   }
   
   /**
     * Sets location of Customer with.
     * 1 parameter
     * @param locationIn - location of customer
     */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
     * Sets location of Customer with.
     * 2 parameeters
     * @param city - city of location
     * @param state - state of location
     */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
     * Changes balance of customer account.
     * Input amount
     * @param amount - amount to change Balance
     */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
     * Returns location of Customer.
     * @return location
     */
   public String getLocation() {
      return location;
   }
   
   /** 
     * Returns Balance of Customer.
     * @return balance
     */
   public double getBalance() {
      return balance;
   }
   
   /**
     * Compares 2 Customer Objects Balances.
     * @param obj - a seperate Customer obj
     * 
     * @return 0 if balances are equal
     * -1 if obj1 is less than obj2
     * 1 if obj1 is greater than obj2
     */
   public int compareTo(Customer obj) {
      
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //consider equal
      }
      else if (this.balance < obj.getBalance()) {
         return -1; // should return a negative number
      }
      else {
         return 1; // should return a posiitve number
      }         
   }
   
   /**
     * Returns string representation of Customer Info.
     * Includes Name, Location, and Balance 
     * @return formatted string of Customer Info
     */
   public String toString() {
      String output = name + "\n"
         + location + "\n" + "$" + balance;
      return output;   
   }
   

}