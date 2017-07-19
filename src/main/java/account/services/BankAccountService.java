package account.services;

import account.dao.models.BankAccount;
import account.dao.repositories.IBankAccountRepository;
import account.forms.BankAccountForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by anastasia on 19.07.17.
 */

@Service
public class BankAccountService {

    @Autowired
    private IBankAccountRepository bankAccountRepository;

    public List<BankAccount> findAllBankAccount() {
        return bankAccountRepository.findAll();
    }

    public BankAccount createBankAccount(BankAccountForm form) {
        BankAccount bankAccount = new BankAccount(form.getAccountNumber(), form.getClientSurname(),
                form.getClientName(), form.getClientPatronymic(), form.getBalance(), form.getCurrency());
        return bankAccountRepository.save(bankAccount);
    }

    public BankAccount updateBankAccount(BankAccountForm form) {
        BankAccount bankAccount = bankAccountRepository.findOne(form.getId());

        bankAccount.setAccountNumber(form.getAccountNumber());
        bankAccount.setClientSurname(form.getClientSurname());
        bankAccount.setClientName(form.getClientName());
        bankAccount.setClientPatronymic(form.getClientPatronymic());
        bankAccount.setBalance(form.getBalance());
        bankAccount.setCurrency(form.getCurrency());
        return bankAccountRepository.save(bankAccount);
    }

    public void removeBankAccount(Long id) {
        bankAccountRepository.delete(id);
    }
}
