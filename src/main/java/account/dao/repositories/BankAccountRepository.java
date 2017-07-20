package account.dao.repositories;

import account.dao.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by anastasia on 19.07.17.
 */

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
