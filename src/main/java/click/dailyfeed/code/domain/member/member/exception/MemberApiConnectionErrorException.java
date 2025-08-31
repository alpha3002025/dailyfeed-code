package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberApiConnectionErrorException extends MemberException {
    public MemberApiConnectionErrorException() {
        super(MemberExceptionCode.MEMBER_API_CONNECTION_ERROR);
    }

    public MemberApiConnectionErrorException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_API_CONNECTION_ERROR, messageSupplier);
    }
}
