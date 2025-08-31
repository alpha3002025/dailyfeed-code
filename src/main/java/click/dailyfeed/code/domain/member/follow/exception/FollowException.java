package click.dailyfeed.code.domain.member.follow.exception;

import click.dailyfeed.code.domain.member.follow.code.FollowExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class FollowException extends RuntimeException {
    private final FollowExceptionCode followExceptionCode;

    public FollowException(FollowExceptionCode followExceptionCode) {
        super(followExceptionCode.getMessage());
        this.followExceptionCode = followExceptionCode;
    }

    public FollowException(FollowExceptionCode followExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.followExceptionCode = followExceptionCode;
    }
}
