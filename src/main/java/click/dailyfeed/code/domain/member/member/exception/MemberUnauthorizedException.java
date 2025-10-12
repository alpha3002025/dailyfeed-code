package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberUnauthorizedException extends MemberException {

    public MemberUnauthorizedException() {
        super(MemberExceptionCode.MEMBER_UNAUTHORIZED);
    }

    public MemberUnauthorizedException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_UNAUTHORIZED, messageSupplier);
    }
}