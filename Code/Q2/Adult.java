//Student Name #1:Kaiwen Song Student Number #1:300028982
//Student Name #2:Zihan Xiao Student Number #2:300048507
public class Adult extends Customer {

  private double SAVINGS_INTEREST = 0.03;
  private double CHECK_INTEREST = 0.01;
  private double CHECK_CHARGE = 0.03;
  private int OVERDRAFT_PENALTY = 25;
//the type of customer is adult
  public Adult(String firstName, String lastName, int age) {
    super(firstName, lastName, age);
  }

  public Adult(String name, int age) {
    super(name, age);
  }

  public double getSavingsInterest() {
    return SAVINGS_INTEREST;
  }

  public double getCheckInterest() {
    return CHECK_INTEREST;
  }

  public double getCheckCharge() {
    return CHECK_CHARGE;
  }

  public int getOVERDRAFT_PENALTY() {
    return OVERDRAFT_PENALTY;
  }


}
	