package click.dailyfeed.code.domain.content.post.exception;

import click.dailyfeed.code.domain.content.post.code.PostExceptionCode;

public class PostLikeAlreadyExistsException extends PostException {
    public PostLikeAlreadyExistsException() {
        super(PostExceptionCode.POST_LIKE_ALREADY_EXISTS);
    }

    public PostLikeAlreadyExistsException(String message) {
        super(PostExceptionCode.POST_LIKE_ALREADY_EXISTS, message);
    }
}
