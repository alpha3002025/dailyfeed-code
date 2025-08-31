package click.dailyfeed.code.domain.feed.post.exception;

import click.dailyfeed.code.domain.feed.post.code.PostExceptionCode;

public class PostDeleteForbiddenException extends PostException {
    public PostDeleteForbiddenException() {
        super(PostExceptionCode.POST_DELETE_FORBIDDEN);
    }

    public PostDeleteForbiddenException(String message) {
        super(PostExceptionCode.POST_DELETE_FORBIDDEN, message);
    }
}
