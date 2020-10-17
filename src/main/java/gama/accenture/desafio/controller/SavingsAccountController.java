package gama.accenture.desafio.controller;

import gama.accenture.desafio.entity.CheckingAccount;
import gama.accenture.desafio.entity.SavingsAccount;
import gama.accenture.desafio.repository.Database;
import java.util.Hashtable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/savings")
public class SavingsAccountController {

  private Hashtable db = Database.INSTANCE.account();

  @PostMapping
  public ResponseEntity<SavingsAccount> createSavingAccount () {
    SavingsAccount savingsAccount = new SavingsAccount();
    db.put(savingsAccount.getId(), savingsAccount);

    return ResponseEntity.ok(savingsAccount);
  }
}
