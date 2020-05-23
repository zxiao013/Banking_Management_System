//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
public class Senior extends Customer {

  private double SAVINGS_INTEREST;
  private double CHECK_INTEREST;
  private double CHECK_CHARGE;
  private double OVERDRAFT_PENALTY = 500.0;
  private boolean VIP;
//the type of customer is senior
  public Senior(String firstName, String lastName, int age, boolean VIP) {
    super(firstName, lastName, age);
    this.VIP = VIP;
  }

  public Senior(String name, int age, boolean VIP) {
    super(name, age);
    this.VIP = VIP;
  }

  public boolean isVIP() {
    return VIP;
  }

  public double getSavingsInterest() {
    if (VIP == true) {
      SAVINGS_INTEREST = 0.1;
    } else {
      SAVINGS_INTEREST = 0.08;
    }
    return SAVINGS_INTEREST;
  }

  public double getCheckInterest() {
    CHECK_INTEREST = 0.04;
    return CHECK_INTEREST;
  }

  public double getCheckCharge() {
    if (VIP == true) {
      CHECK_CHARGE = 0;
    } else {
      CHECK_CHARGE = 1;
    }
    return CHECK_CHARGE;
  }

  public double getOVERDRAFT_PENALTY() {
    return OVERDRAFT_PENALTY;
  }
}
	