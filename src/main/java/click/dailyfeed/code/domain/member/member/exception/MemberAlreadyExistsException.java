package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberAlreadyExistsException extends MemberException{

    public MemberAlreadyExistsException() {
        super(MemberExceptionCode.MEMBER_ALREADY_EXISTS);
    }

    public MemberAlreadyExistsException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_ALREADY_EXISTS, messageSupplier);
    }
}
