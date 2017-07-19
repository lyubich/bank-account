package account.dao.models;

import javax.persistence.*;

/**
 * Created by anastasia on 19.07.17.
 */

@Entity
@Table(name = "bank_account")
public class BankAccount {
    @Id
    @SequenceGenerator(name = "IDCLASS_GENERATOR", sequenceName = "bank_account_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCLASS_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "client_surname")
    private String clientSurname;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_patronymic")
    private String clientPatronymic;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "currency")
    private String currency;

    public BankAccount() {
    }

    public BankAccount(Integer accountNumber, String clientSurname, String clientName, Integer balance,
                       String currency) {
        this.accountNumber = accountNumber;
        this.clientSurname = clientSurname;
        this.clientName = clientName;
        this.balance = balance;
        this.currency = currency;
    }

    public BankAccount(Integer accountNumber, String clientSurname, String clientName, String clientPatronymic,
                       Integer balance, String currency) {
        this.accountNumber = accountNumber;
        this.clientSurname = clientSurname;
        this.clientName = clientName;
        this.clientPatronymic = clientPatronymic;
        this.balance = balance;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPatronymic() {
        return clientPatronymic;
    }

    public void setClientPatronymic(String clientPatronymic) {
        this.clientPatronymic = clientPatronymic;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientPatronymic='" + clientPatronymic + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
