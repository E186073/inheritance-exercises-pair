import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
    private BigDecimal overDraft;
    public CheckingAccount(BigDecimal over) {
        overDraft = over;
    }
    public void addOverdraft(){
        withdraw(getBalance());

   }

    
}
