package gama.accenture.desafio.controller;

import gama.accenture.desafio.entity.Account;
import gama.accenture.desafio.repository.Database;
import java.util.ArrayList;
import java.util.Hashtable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  private Hashtable db = Database.INSTANCE.account();

  @GetMapping("/accounts")
  public ResponseEntity<ArrayList<Account>> listAccounts () {

    ArrayList<Account> accountsList = new ArrayList(db.values());

    return ResponseEntity.ok(accountsList);
  }

  @PostMapping("/deposit/{id}")
  public ResponseEntity<Account> deposit (@PathVariable String id, @RequestBody double depositAmount) {
    Account account = (Account) db.get(id);
    account.deposit(depositAmount);
    return ResponseEntity.accepted().body(account);
  }

}
