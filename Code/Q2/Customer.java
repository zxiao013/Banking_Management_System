//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
public abstract class Customer {

  protected String firstName;
  protected String lastName;
  protected int age;
  protected int customerNumber;
  public static int lastCustomerNumber = 9999;
//it declare the customer
  public Customer(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.customerNumber = lastCustomerNumber;
    lastCustomerNumber++;
  }

  public Customer(String name, int age) {
    this.firstName = firstName;
    this.age = age;
    this.customerNumber = lastCustomerNumber;
    lastCustomerNumber++;
  }

  public String getfirstName() {
    return firstName;
  }

  public String getlastName() {
    return lastName;
  }

  public int getage() {
    return age;
  }

  public int getcustomerNumber() {
    return customerNumber;
  }

  public void changefirstName(String newfirstName) {
    this.firstName = newfirstName;
  }

  public void changelastName(String newlastName) {
    this.lastName = newlastName;
  }

  public void changeage(int newage) {
    this.age = newage;
  }

  public void changecustomerNumber(int newcustomerNumber) {
    this.customerNumber = newcustomerNumber;
  }

  public boolean equals(Customer other) {
    return this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age && this.customerNumber == other.customerNumber;
  }

  public String toString() {
    return ("First name: " + firstName + "Last name: " + lastName + "Age:" + age + "Customer Number: " + customerNumber);
  }

  public abstract double getSavingsInterest();

  public abstract double getCheckInterest();

  public abstract double getCheckCharge();


} 
	