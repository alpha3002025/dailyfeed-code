package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberHandleAlreadyExistsException extends MemberException{

    public MemberHandleAlreadyExistsException() {
        super(MemberExceptionCode.MEMBER_HANDLE_ALREADY_EXISTS);
    }

    public MemberHandleAlreadyExistsException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_HANDLE_ALREADY_EXISTS, messageSupplier);
    }
}
