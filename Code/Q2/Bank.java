//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank {

  private Account[] accounts;
  private int size;
  private int capacity;

  private static final int SAVINGS = 0;
  private static final int CHECKING = 1;
  private static final int SENIOR = 0;
  private static final int ADULT = 1;
  private static final int STUDENT = 2;
  private static final int INIT_CAPACITY = 100;

  /**
   * Creates a new instance of Bank
   */
  public Bank() {
    this.accounts = new Account[100];
  }


  //add transaction to transactions
  public boolean add(Account e) {
    if (size >= INIT_CAPACITY) {
      reallocate();
    }
    accounts[size++] = e;
    return true;
  }


  /********************************************************************
   * Creates a new account.
   * pre: customer information must be not null and types must be valid
   * post: New account added to bank
   * @param customerName String Account owner's name
   * @param customerAddress String Owner's address
   * @param customerAge int Owner's age (in years)
   * @param customerPhoneNumber String Owner's phone number
   * @param customerType int Owner's type of customer within bank
   * @param typeAccount int Account type (savings or checking)
   * @return String New account number
   */
  public String addAccount(String customerName, int customerAge, int customerType, Boolean vip, int typeAccount) {
    if (typeAccount == 0) {
      if (customerType == 0) {
        Customer newCustomer = new Senior(customerName, customerAge, false);
        Account newAccount = new SavingsAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      } else if (customerType == 1) {
        Customer newCustomer = new Adult(customerName, customerAge);
        Account newAccount = new SavingsAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      } else {
        Customer newCustomer = new Student(customerName, customerAge);
        Account newAccount = new SavingsAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      }

    } else {
      if (customerType == 0) {
        Customer newCustomer = new Senior(customerName, customerAge, false);
        Account newAccount = new CheckingAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      } else if (customerType == 1) {
        Customer newCustomer = new Adult(customerName, customerAge);
        Account newAccount = new CheckingAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      } else {
        Customer newCustomer = new Student(customerName, customerAge);
        Account newAccount = new CheckingAccount(newCustomer);
        add(newAccount);
        return newAccount.getAccountNumber() + "";
      }

    }


  }


  /***********************************************************************
   * Make a deposit into account.
   * pre: amount must be a positive integer
   * post: Account's balance increases
   * @param accountNumber String Account's number
   * @param amount double Amount to deposit
   * @return double New balance
   */
  public String makeDeposit(String accountNumber, double amount) {
    int index = find(accountNumber);
    if (index == -1) {
      return null;
    }
    accounts[index].deposit(amount);
    return Double.toString(accounts[index].getBalance());
  }

  /***********************************************************************
   * Make a withdrawal from account.
   * pre: amount must be a positive integer
   * post: Account's balance decreases
   * @param accountNumber String Account's number
   * @param amount double Amount to withdraw
   * @return double New balance
   */
  public String makeWithdrawal(String accountNumber, double amount) {
    int index = find(accountNumber);
    if (index == -1) {
      return null;
    }
    accounts[index].withdraw(amount);
    return Double.toString(accounts[index].getBalance());
  }

  /***********************************************************************
   * Returns account information as a string so it can be displayed
   * @param accountNumber String Account's number
   * @return String Account information as a String object
   */
  public String getAccount(String accountNumber) {
    int index = find(accountNumber);
    if (index == -1) {
      return null;
    }
    return accounts[index].toString();

  }

  public Account getAccountItem(String accountNumber) {
    int index = find(accountNumber);
    if (index == -1) {
      return null;
    }
    return accounts[index];

  }

  /***********************************************************************
   * Given an account number tells if the account exists or not
   * @param accountNumber String Account's number
   * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
   */
  private int find(String accountNumber) {
    for (int i = 0; i < size; i++) {
      if ((accounts[i].getAccountNumber()).equals(accountNumber)) {
        return i;
      }


    }
    return -1;
  }

  /***********************************************************************


   /** You need to create private method : Allocate to allocate a new array to hold the transactions. */
  private void reallocate() {
    Account[] tmp = new Account[2 * accounts.length];
    System.arraycopy(accounts, 0, tmp, 0, accounts.length);
    accounts = tmp;
  }
}

