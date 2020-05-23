//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
public class SavingsAccount extends Account {

  public SavingsAccount(Customer customer) {
    super(customer);
  }
//this method calculate the deposit
  public void deposit(double amount) {
    balance = balance + amount;
    Transaction deposit1 = new Transaction((byte) 0, amount, "deposit" + amount);

    add(deposit1);
  }
//this method calculate the withdraw
  public void withdraw(double amount) {
    if (this.customer instanceof Adult) {
      if (balance < amount) {
        if ((balance + 500) >= amount) {
          balance = balance - amount - 25.0;
          Transaction withdraw1 = new Transaction((byte) 1, amount, 25.0, "withdraw" + amount + ",overdraft" + (amount - balance));
          add(withdraw1);

        }
      }
      if (balance > amount) {
        balance = balance - amount;
        Transaction withdraw2 = new Transaction((byte) 1, amount, 0.0, "withdraw" + amount);
        add(withdraw2);
      }
    }
    if (this.customer instanceof Student) {
      if (balance > amount) {
        balance = balance - amount;
        Transaction withdraw3 = new Transaction((byte) 1, amount, 0.0, "withdraw" + amount);
        add(withdraw3);
      }
    }
    if (this.customer instanceof Senior) {
      Senior senior = (Senior) customer;
      if (senior.isVIP()) {
        if (balance < amount) {
          if ((amount - balance) < 100) {
            balance = balance - amount;
            Transaction withdraw6 = new Transaction((byte) 1, amount, 0.0, "withdraw" + amount + ",overdraft" + (amount - balance));
            add(withdraw6);
          }
          if (100 < (amount - balance) && (amount - balance) < 500) {
            balance = balance - amount - 5.0;
            Transaction withdraw7 = new Transaction((byte) 1, amount, 5.0, "withdraw" + amount + ",overdraft" + (amount - balance));
            add(withdraw7);
          }

        }
        if (balance > amount) {
          balance = balance - amount;
          Transaction withdraw8 = new Transaction((byte) 1, amount, 0.0, "withdraw" + amount);
          add(withdraw8);
        }
      } else {
        if (balance < amount) {
          if ((balance + 500) >= amount) {
            balance = balance - amount - 10.0;
            Transaction withdraw4 = new Transaction((byte) 1, amount, 10.0, "withdraw" + amount + ",overdraft" + (amount - balance));
            add(withdraw4);
          }
        }
        if (balance > amount) {
          balance = balance - amount;
          Transaction withdraw5 = new Transaction((byte) 1, amount, 0.0, "withdraw" + amount);
          add(withdraw5);
        }
      }
    }
  }

//this method get the interest
  public void addInterest(double amount) {
    if (this.customer instanceof Adult) {
      balance = balance + (amount * 0.01);
    }
    if (this.customer instanceof Student) {
      balance = balance + (amount * 0.03);
    }
    if (this.customer instanceof Senior) {
      balance = balance + (amount * 0.04);
    }
  }

}