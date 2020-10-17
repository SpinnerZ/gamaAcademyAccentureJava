package gama.accenture.desafio.repository;

import gama.accenture.desafio.entity.Account;
import java.util.Hashtable;

public enum Database {
  INSTANCE;

  private final Hashtable<String, Account> account;

  Database() {
    account = new Hashtable<>();
  }

  public Hashtable account() {
    return this.account;
  }
}

