package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberPasswordInvalidException extends MemberException{
    public MemberPasswordInvalidException() {
        super(MemberExceptionCode.MEMBER_PASSWORD_INVALID);
    }

    public MemberPasswordInvalidException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_PASSWORD_INVALID, messageSupplier);
    }
}
