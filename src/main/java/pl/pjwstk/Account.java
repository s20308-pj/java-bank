package pl.pjwstk;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NonNull

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance = new BigDecimal("0");
    private User user;

    public Account(User user, String accountNumber){
        this.accountNumber = accountNumber;
        this.user = user;
    }

    public Account(String firstName, String lastName, int idNumber, String accountNumber) {
        this.user = new User(firstName, lastName, idNumber);
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double many) {
        accountBalance = accountBalance.add(BigDecimal.valueOf(many));
    }

    public void accountBalance() {
        System.out.println("stan konta "+ accountBalance);
    }
}
