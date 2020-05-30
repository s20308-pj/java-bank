package pl.pjwstk;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Janusz", "Kowalski", 300520);
        Account account1 = new Account(user1,001);
        Account account2 = new Account("Jan","Piertuszka",300521,002);
        Bank bank = new Bank("PKO", 4026);
        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " " + user1.getIdNumber());
        System.out.println(account1.getAccountNumber() + " " +account1.getUser().getFirstName());
        System.out.println(account2.getAccountNumber() + " " +account2.getUser().getFirstName());
        System.out.println(bank.getBankName() + " " + bank.getListAccount());
    }
}
