package account.web.controllers;

import account.dao.models.BankAccount;
import account.forms.BankAccountForm;
import account.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anastasia on 18.07.17.
 */

@RestController
public class ClientController {

    @Autowired
    private BankAccountService bankAccountService;

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<BankAccount> find_clients() {
        return bankAccountService.findAllBankAccount();
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    public BankAccount create_client(@ModelAttribute BankAccountForm bankAccountForm) {
        return bankAccountService.createBankAccount(bankAccountForm);
    }

    @RequestMapping(value = "/clients/{id:\\d+}", method = RequestMethod.PUT)
    public BankAccount update_client(@ModelAttribute BankAccountForm bankAccountForm) {
        return bankAccountService.updateBankAccount(bankAccountForm);
    }

    @RequestMapping(value = "/clients/{id:\\d+}", method = RequestMethod.DELETE)
    public String remove_client(@PathVariable(value = "id") Long id) {
        bankAccountService.removeBankAccount(id);
        return "Client has removed!";
    }
}
