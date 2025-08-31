package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberNotFoundException extends MemberException {

    public MemberNotFoundException() {
        super(MemberExceptionCode.MEMBER_NOT_FOUND);
    }

    public MemberNotFoundException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_NOT_FOUND, messageSupplier);
    }
}
