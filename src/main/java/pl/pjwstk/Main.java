package pl.pjwstk;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Janusz", "Kowalski", 300520);
        Account account1 = new Account(user1,"12345678901234567890123456");
        Account account2 = new Account("Jan","Piertuszka",300521,"98765432109876543210987654");
        Bank bank = new Bank("PKO", 4026);
        account1.setAccountBalance(100);
        account1.setAccountBalance(50);
        account1.accountBalance();
        bank.addAcount(account1);
        bank.addAcount(account2);
        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " " + user1.getIdNumber());
        System.out.println(account1.getAccountNumber() + " " +account1.getUser().getFirstName()+" "+ account1.getUser().getLastName());
        System.out.println(account2.getAccountNumber() + " " +account2.getUser().getFirstName());
        System.out.println(bank.getBankName() + " " + bank.getListAccount());
        System.out.println(bank.getListAccount());
        bank.printAccount();
    }
}
