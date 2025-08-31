package click.dailyfeed.code.domain.contents.post.exception;

import click.dailyfeed.code.domain.contents.post.code.PostExceptionCode;

public class PostAlreadyDeletedException extends PostException {
    public PostAlreadyDeletedException() {
        super(PostExceptionCode.POST_ALREADY_DELETED);
    }

    public PostAlreadyDeletedException(String message) {
        super(PostExceptionCode.POST_ALREADY_DELETED, message);
    }
}
