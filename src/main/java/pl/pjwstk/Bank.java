package pl.pjwstk;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Bank {
    private String bankName;
    private int idBank;
    private List<Account> listAccount = new ArrayList<>();

    public Bank(String bankName, int idBank) {
        this.bankName = bankName;
        this.idBank = idBank;
    }

    public void addAcount(Account accountNumber) {
        listAccount.add(accountNumber);
    }

    public void printAccount() {
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.println("właściciel: " + listAccount.get(i).getUser().getLastName() + "\nnumer konta: " + listAccount.get(i).getAccountNumber() + "/nSaldo: " + listAccount.get(i).getAccountBalance() + "/n");
        }
    }
}