package click.dailyfeed.code.domain.member.member.annotation;

import click.dailyfeed.code.domain.member.member.validator.IdsListSizeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdsListSizeValidator.class)
@Documented
public @interface MaxIdsLimit {
    String message() default "ID_MAX_LIMIT_EXCEEDS";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int value() default 1000;
}
