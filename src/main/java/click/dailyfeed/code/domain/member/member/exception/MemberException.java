package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class MemberException extends RuntimeException {
    private final MemberExceptionCode memberExceptionCode;

    public MemberException(MemberExceptionCode memberExceptionCode) {
        super(memberExceptionCode.getMessage());
        this.memberExceptionCode = memberExceptionCode;
    }

    public MemberException(MemberExceptionCode memberExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.memberExceptionCode = memberExceptionCode;
    }
}
