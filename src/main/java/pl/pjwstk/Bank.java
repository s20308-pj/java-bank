package pl.pjwstk;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    public void getAcount(Account accountAumber) {
        IntStream.range(0, listAccount.size()).forEach(i -> listAccount.get(i));
    }
}