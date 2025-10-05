package click.dailyfeed.code.domain.member.follow.exception;

import click.dailyfeed.code.domain.member.follow.code.FollowExceptionCode;
import java.util.function.Supplier;

public class FollowLimitExceedsException extends FollowException {

    public FollowLimitExceedsException() {
        super(FollowExceptionCode.FOLLOW_LIMIT_EXCEEDS);
    }

    public FollowLimitExceedsException(Supplier<String> messageSupplier) {
        super(FollowExceptionCode.FOLLOW_LIMIT_EXCEEDS, messageSupplier);
    }
}
