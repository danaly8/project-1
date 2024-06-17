import java.time.LocalDate;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(AccountHolder accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, LocalDate.now(), balance);
        this.overdraftLimit = overdraftLimit;
    }
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance + overdraftLimit >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
        return balance;
    }
}
