//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
import java.util.Date;

public class Transaction {

  private byte type;
  private double amount;
  private Date date = new Date();
  private double fees;
  private String description;

  public Transaction(byte type, double amount, double fees, String description) {
    this.type = type;
    this.amount = amount;
    this.fees = fees;
    this.description = description;
  }

  public Transaction(byte type, double amount, String description) {
    this.type = type;
    this.amount = amount;
    this.description = description;
  }
// it clearly declare the type of transaction
  public String processTransaction() {
    if (type == 0) {
      return "The transaction is deposit:" + amount + "," + date + ", fees:" + fees + "," + description;
    }
    if (type == 1) {
      return "The transaction is withdraw:" + amount + "," + date + ", fees:" + fees + "," + description;
    }
    if (type == 2) {
      return "The transaction is addedInterest:" + amount + "," + date + ", fees:" + fees + "," + description;
    }
    
    return "";
  }
}
		