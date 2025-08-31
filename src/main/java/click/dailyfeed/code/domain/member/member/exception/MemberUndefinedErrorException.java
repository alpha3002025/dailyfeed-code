package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberUndefinedErrorException extends MemberException {
    public MemberUndefinedErrorException() {
        super(MemberExceptionCode.MEMBER_UNDEFINED_ERROR);
    }

    public MemberUndefinedErrorException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_UNDEFINED_ERROR, messageSupplier);
    }
}
