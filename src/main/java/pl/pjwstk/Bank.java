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
}
