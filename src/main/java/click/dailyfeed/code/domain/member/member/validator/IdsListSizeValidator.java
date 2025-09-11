package click.dailyfeed.code.domain.member.member.validator;

import click.dailyfeed.code.domain.member.member.annotation.MaxIdsLimit;
import click.dailyfeed.code.domain.member.member.exception.MemberIdsLimitExceedsException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class IdsListSizeValidator implements ConstraintValidator<MaxIdsLimit, List<?>> {
    private int maxSize;

    @Override
    public void initialize(MaxIdsLimit constraintAnnotation) {
        this.maxSize = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(List<?> list, ConstraintValidatorContext constraintValidatorContext) {
        if (list == null){
            return true;
        }

        if (list.size() > maxSize){
            throw new MemberIdsLimitExceedsException();
        }

        return true;
    }
}
