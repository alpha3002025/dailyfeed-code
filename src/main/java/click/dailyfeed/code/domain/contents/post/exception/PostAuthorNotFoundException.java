package click.dailyfeed.code.domain.contents.post.exception;

import click.dailyfeed.code.domain.contents.post.code.PostExceptionCode;

public class PostAuthorNotFoundException extends PostException{
    public PostAuthorNotFoundException(PostExceptionCode postExceptionCode) {
        super(postExceptionCode);
    }

    public PostAuthorNotFoundException(PostExceptionCode postExceptionCode, String message) {
        super(postExceptionCode, message);
    }
}
