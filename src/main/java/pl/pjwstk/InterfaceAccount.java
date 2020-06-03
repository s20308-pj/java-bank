package pl.pjwstk;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AccountValidator.class)
public @interface InterfaceAccount {
    public String someAccountNumber() default "";

    String message() default "Invlid accound number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
