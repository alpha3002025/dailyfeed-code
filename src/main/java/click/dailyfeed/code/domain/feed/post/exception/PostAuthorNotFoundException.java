package click.dailyfeed.code.domain.feed.post.exception;

import click.dailyfeed.code.domain.feed.post.code.PostExceptionCode;

public class PostAuthorNotFoundException extends PostException{
    public PostAuthorNotFoundException(PostExceptionCode postExceptionCode) {
        super(postExceptionCode);
    }

    public PostAuthorNotFoundException(PostExceptionCode postExceptionCode, String message) {
        super(postExceptionCode, message);
    }
}
