package SelfStudy.OOP.Account;

public class Account {
    private double balance;
    private String numberOfAccount;
    private String name;
    private String email;
    private int phoneNumber;

    public double setMoney(double balance) {
        this.balance = balance;
        return this.balance;
    }

    public double getMoney() {
        return this.balance;

    }

    public double deposit(double deposit) {
        this.balance = this.balance + deposit;
        System.out.println("You deposit " + deposit + " Now the balance is " + this.balance);
        return this.balance;
    }

    public double withdraw(double withdraw) {
        if (withdraw > this.balance) {
            System.out.println("You have only " + this.balance);
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("You withdraw " + withdraw + " Now the balance is " + this.balance);
        }
        return this.balance;
    }

    public String setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
        return this.numberOfAccount;
    }

    public String getNumberOfAccount() {
        return this.numberOfAccount;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public int setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this.phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String setEmail(String email) {
        this.email = email;
        return this.email;
    }

    public String getEmail() {
        return this.email;
    }
}
