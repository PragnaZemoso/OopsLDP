package com.zemosotraining.oops;

// Data Hiding: Technique to hide internal object details - data members by using private variables
// Abstraction: Process of hiding the implementation details & showing the essential features only.
// Encapsulation = Data hiding + Abstraction

class BankAccount{ // tightly Encapsulated class
    private String accountHolderName = "Pragna";
    private double accountBalance = 90000;
    private String password = "123456";

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance(String accountHolderName, String password) {
        if(accountHolderName.equals(this.accountHolderName) && password.equals(this.password))
            return accountBalance;
        else
            return 0;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        bankAcc.setAccountHolderName("Pragna");
        bankAcc.setPassword("123456");
        double balance = bankAcc.getAccountBalance(bankAcc.getAccountHolderName(), bankAcc.getPassword());
        System.out.println("The account balance of bankAcc : " + balance);
    }
}
