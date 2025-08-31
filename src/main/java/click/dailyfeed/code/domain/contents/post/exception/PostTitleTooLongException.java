package click.dailyfeed.code.domain.contents.post.exception;

import click.dailyfeed.code.domain.contents.post.code.PostExceptionCode;

public class PostTitleTooLongException extends PostException {

    public PostTitleTooLongException() {
        super(PostExceptionCode.POST_TITLE_TOO_LONG);
    }

    public PostTitleTooLongException(String message) {
        super(PostExceptionCode.POST_TITLE_TOO_LONG, message);
    }
}
