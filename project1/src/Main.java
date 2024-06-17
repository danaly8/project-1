import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //COMPLETE THE main METHOD
        //Add a new account holder with the first name "John", last name "Doe", and date of birth "01/01/2000"
        //Set up a new savings account with an initial balance of £1000 and an interest rate of 5%
        //Deposit £1000 into the savings account every year for 10 years
        //Print the balance after each deposit
        //Set the deposit date of the savings account to the opening date

        // Step 1 create an account holder with the required information
        AccountHolder Ach1 = new AccountHolder("John", "Doe", "01/01/2000");
        // Step 2 create a saving account with the required information
        SavingsAccount Sva1 = new SavingsAccount(Ach1, 1000, 0.05);
        LocalDate depositDate = LocalDate.now();

        // Step 3 and 4 deposit 1000£ every year for ten years and prints the balance after each deposit
        for(int i=0;i<10;i++){
            if(i==0){
                Sva1.deposit(1000);
                System.out.println("year "+(i+1)+" balance £ " +String.format("%.2f", Sva1.getBalance()));
            }
            else{
                Sva1.deposit(1000, depositDate);
                System.out.println("year "+(i+1)+" balance £ " +String.format("%.2f", Sva1.getBalance()));
            }
            depositDate = depositDate.plusYears(1);

        }
    }
}