import java.math.BigDecimal;

public class BankAccount {
    public String accountNumber;
    private BigDecimal balance;


    public BankAccount( ) {
       balance = BigDecimal.ZERO;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
        //method
    public void deposit(BigDecimal amountToDeposit) {
        balance = balance.add(amountToDeposit);
    }
    public void withdraw (BigDecimal amountToWithdraw){
       //need to do validation
            balance = balance.subtract(amountToWithdraw);

    }
    //need to do validation
    public void transfer (BankAccount destination, BigDecimal transferAmount){
        balance = balance.subtract(transferAmount);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }



    }
