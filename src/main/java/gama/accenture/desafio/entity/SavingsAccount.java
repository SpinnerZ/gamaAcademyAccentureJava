package gama.accenture.desafio.entity;

public class SavingsAccount extends Account {

  @Override
  public String getType() {
    return "Savings Account";
  }

  @Override
  public boolean withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount - 0.1;
      return true;
    }

    return false;
  }
}
