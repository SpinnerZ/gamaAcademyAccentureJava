package gama.accenture.desafio.entity;

import java.util.UUID;

public abstract class Account {

  protected double balance;
  protected String id;

  public Account() {
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public abstract String getType();

  public double getBalance() {
    return this.balance;
  }

  public double deposit (double amount) {
    this.balance += amount;
    return this.balance;
  }

  public boolean withdraw (double amount) {

    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    }

    return false;
  }

  public double accountIncome () {
    return this.balance * .7;
  }

  public boolean transfer (double amount, Account targetAccount) {

    if (withdraw(amount)) {
      targetAccount.deposit(amount);
      return true;
    }

    return false;
  }
}
