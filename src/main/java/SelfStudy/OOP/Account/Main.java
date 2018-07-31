package SelfStudy.OOP.Account;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setMoney(100.00);
        bobsAccount.deposit(30.00);
        bobsAccount.deposit(30.00);
        bobsAccount.withdraw(10.01);
        System.out.println(bobsAccount.getMoney());
        bobsAccount.setNumberOfAccount("114049890896994458208523098293844223222l");
        System.out.println(bobsAccount.getNumberOfAccount());
        System.out.println(bobsAccount.getMoney());
    }

}
