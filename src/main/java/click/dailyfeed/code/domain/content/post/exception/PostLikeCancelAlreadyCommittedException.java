package click.dailyfeed.code.domain.content.post.exception;

import click.dailyfeed.code.domain.content.post.code.PostExceptionCode;

public class PostLikeCancelAlreadyCommittedException extends PostException {
    public PostLikeCancelAlreadyCommittedException() {
        super(PostExceptionCode.POST_LIKE_CANCEL_ALREADY_COMMITTED);
    }

    public PostLikeCancelAlreadyCommittedException(String message) {
        super(PostExceptionCode.POST_LIKE_CANCEL_ALREADY_COMMITTED, message);
    }
}
