package pl.pjwstk;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Bank {
    private int idBank;
    private List<Account> listAccount = new ArrayList<>();

    public Bank(int idBank, List<Account> listAccount) {
        this.idBank = idBank;
        this.listAccount = listAccount;

    }
}