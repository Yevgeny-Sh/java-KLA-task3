public class MySecondBankClass {
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;

    public MySecondBankClass(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0;
    }

    public double getBalance(){
        return this.accountBalance;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new NegativeNumberException("Negative or zero numbers are not allowed.");
            }
            accountBalance += amount;
            System.out.println("Deposit of $" + amount + " successful");
        } catch (NegativeNumberException e) {
           // System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount > 0) {
                if (accountBalance >= amount) {
                    accountBalance -= amount;
                    System.out.println("Withdrawal of $" + amount + " successful");
                } else {
                    throw new InsufficientFundsException("stop being poor!");
                }
            } else {
                throw new NegativeNumberException("Negative or zero numbers are not allowed.");
                //there is also Illegal Argument Exception if needed:
                //throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
        } catch (Exception e ){
           // System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + accountBalance);
    }
}
