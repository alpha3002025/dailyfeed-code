package click.dailyfeed.code.domain.activity.exception;

import click.dailyfeed.code.domain.activity.code.MemberActivityExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class MemberActivityException extends RuntimeException {
    private final MemberActivityExceptionCode memberActivityExceptionCode;

    public MemberActivityException(MemberActivityExceptionCode memberActivityExceptionCode) {
        super(memberActivityExceptionCode.getMessage());
        this.memberActivityExceptionCode = memberActivityExceptionCode;
    }

    public MemberActivityException(MemberActivityExceptionCode memberActivityExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.memberActivityExceptionCode = memberActivityExceptionCode;
    }
}
