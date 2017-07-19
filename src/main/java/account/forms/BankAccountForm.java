package account.forms;

/**
 * Created by anastasia on 19.07.17.
 */
public class BankAccountForm {
    private Long id;
    private Integer accountNumber;
    private String clientSurname;
    private String clientName;
    private String clientPatronymic;
    private Integer balance;
    private String currency;

    public BankAccountForm() {
    }

    public BankAccountForm(Long id, Integer accountNumber, String clientSurname, String clientName, Integer balance,
                           String currency) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.clientSurname = clientSurname;
        this.clientName = clientName;
        this.balance = balance;
        this.currency = currency;
    }

    public BankAccountForm(Long id, Integer accountNumber, String clientSurname, String clientName,
                           String clientPatronymic, Integer balance, String currency) {
        this.id = id;
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
}
