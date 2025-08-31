package click.dailyfeed.code.domain.member.follow.exception;

import click.dailyfeed.code.domain.member.follow.code.FollowExceptionCode;

import java.util.function.Supplier;

public class FollowRelationshipAlreadyExistsException extends FollowException {

    public FollowRelationshipAlreadyExistsException() {
        super(FollowExceptionCode.FOLLOW_RELATIONSHIP_ALREADY_EXISTS);
    }

    public FollowRelationshipAlreadyExistsException(Supplier<String> messageSupplier) {
        super(FollowExceptionCode.FOLLOW_RELATIONSHIP_ALREADY_EXISTS, messageSupplier);
    }
}
