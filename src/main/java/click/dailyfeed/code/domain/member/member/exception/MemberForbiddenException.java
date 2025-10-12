package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberForbiddenException extends MemberException {

    public MemberForbiddenException() {
        super(MemberExceptionCode.MEMBER_FORBIDDEN);
    }

    public MemberForbiddenException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_FORBIDDEN, messageSupplier);
    }
}