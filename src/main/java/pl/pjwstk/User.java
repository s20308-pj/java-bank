package pl.pjwstk;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private String firstName;
    private String lastName;
    private int idNumber;

    public User(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
}
