package gama.accenture.desafio.controller;

import gama.accenture.desafio.entity.CheckingAccount;
import gama.accenture.desafio.repository.Database;
import java.util.Hashtable;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/checking")
public class CheckingAccountController {

  private Hashtable db = Database.INSTANCE.account();

  @PostMapping
  public ResponseEntity<CheckingAccount> createCheckingAccount () {
    CheckingAccount checkingAccount = new CheckingAccount();
    db.put(checkingAccount.getId(), checkingAccount);

    return ResponseEntity.ok(checkingAccount);
  }
}
