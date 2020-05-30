package pl.pjwstk;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NonNull

public class Account {
    private int accountNumber;
    private double accountBalance = 0;
    private User user;

    public Account(User user, int accountNumber){
        this.accountNumber = accountNumber;
        this.user = user;
    }

    public Account(String firstName, String lastName, int idNumber, int accountNumber) {
        this.user = new User(firstName, lastName, idNumber);
        this.accountNumber = accountNumber;
    }

}
