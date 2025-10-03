package click.dailyfeed.code.domain.member.activity.exception;

import click.dailyfeed.code.domain.member.activity.code.MemberActivityExceptionCode;

import java.util.function.Supplier;

public class UndefinedMemberActivityEventTypeException extends MemberActivityException {

    public UndefinedMemberActivityEventTypeException() {
        super(MemberActivityExceptionCode.UNDEFINED_ACTIVITY_EVENT_TYPE);
    }

    public UndefinedMemberActivityEventTypeException(Supplier<String> messageSupplier) {
        super(MemberActivityExceptionCode.UNDEFINED_ACTIVITY_EVENT_TYPE, messageSupplier);
    }
}
