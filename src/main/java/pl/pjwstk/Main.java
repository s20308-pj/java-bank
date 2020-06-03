package pl.pjwstk;

import javax.validation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Janusz", "Kowalski", 300520);
        Account account1 = new Account(user1,"12345678901234567890123456a");
        Account account2 = new Account("Jan","Piertuszka",300521,"98765432109876543210987654");
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Account>>violations1 = validator.validate(account1);
        Set<ConstraintViolation<Account>>violations2 = validator.validate(account2);
        List<Account> accountList = new ArrayList<>();
        Bank bank = new Bank(01,accountList);

    }
}
