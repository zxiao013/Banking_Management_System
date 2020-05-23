//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
public abstract class Account {

  protected Customer customer;
  protected double balance;
  protected int accountNumber;
  public static int lastaccountNumber = 9999;
  protected Transaction[] transactions;
  //the number of elements transactions contains
  private int size = 0;
  private static final int INITSIZE = 25;

  public Account(Customer customer) {
    transactions = new Transaction[INITSIZE];
    this.customer = customer;
    this.accountNumber = lastaccountNumber;
    lastaccountNumber++;
  }

  //add transaction to transactions
  public boolean add(Transaction e) {
    if (size >= INITSIZE) {
      reallocate(transactions);
    }
    transactions[size++] = e;
    return true;
  }

  public abstract void deposit(double amount);

  public abstract void withdraw(double amount);

  public abstract void addInterest(double amount);

  public void reallocate(Transaction[] transactions) {
    Transaction[] tmp = new Transaction[2 * transactions.length];
    System.arraycopy(transactions, 0, tmp, 0, transactions.length);
    this.transactions = tmp;
  }

  public double getBalance() {
    return balance;
  }

  public Customer getCustomer() {
    return customer;
  }

  public String toString() {
    return ("Account number: " + accountNumber + "Balance:" + balance);
  }

  public void setCustomer(Customer c) {
    this.customer = c;
  }

  public String getAccountNumber() {
    return accountNumber + "";
  }
}
	
		