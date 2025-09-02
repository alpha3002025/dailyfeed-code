package click.dailyfeed.code.domain.content.post.exception;

import click.dailyfeed.code.domain.content.post.code.PostExceptionCode;

public class PostContentEmptyException extends PostException {
    public PostContentEmptyException() {
        super(PostExceptionCode.POST_CONTENT_EMPTY);
    }

    public PostContentEmptyException(String message) {
        super(PostExceptionCode.POST_CONTENT_EMPTY, message);
    }
}
