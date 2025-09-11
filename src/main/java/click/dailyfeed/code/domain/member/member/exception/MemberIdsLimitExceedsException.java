package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberIdsLimitExceedsException extends MemberException {
    public MemberIdsLimitExceedsException() {
        super(MemberExceptionCode.MEMBER_IDS_LIMIT_EXCEEDS);
    }

    public MemberIdsLimitExceedsException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.MEMBER_IDS_LIMIT_EXCEEDS, messageSupplier);
    }
}
