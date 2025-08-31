package click.dailyfeed.code.domain.contents.post.exception;

import click.dailyfeed.code.domain.contents.post.code.PostExceptionCode;

public class PostNotFoundException extends PostException {
    public PostNotFoundException() {
        super(PostExceptionCode.POST_NOT_FOUND);
    }
    public PostNotFoundException(String message) {
        super(PostExceptionCode.POST_NOT_FOUND, message);
    }
}
