package click.dailyfeed.code.domain.member.follow.exception;

import click.dailyfeed.code.domain.member.follow.code.FollowExceptionCode;

public class FollowRelationshipNotFoundException extends FollowException {
    public FollowRelationshipNotFoundException() {
        super(FollowExceptionCode.FOLLOW_RELATIONSHIP_NOT_FOUND);
    }
}
