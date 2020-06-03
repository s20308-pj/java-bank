
package pl.pjwstk;

import pl.pjwstk.InterfaceAccount;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountValidator implements ConstraintValidator<InterfaceAccount, String> {


    @Override
    public void initialize(InterfaceAccount constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        s=s.replace(" ","");
        boolean check = false;
        if (26 == s.length()) {
            check = true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!isNumber(s.substring(i,i+1))){
                return false;
            }
        }
        return check;
    }

    static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

}
