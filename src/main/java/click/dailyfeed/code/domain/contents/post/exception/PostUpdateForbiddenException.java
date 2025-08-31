package click.dailyfeed.code.domain.contents.post.exception;

import click.dailyfeed.code.domain.contents.post.code.PostExceptionCode;

public class PostUpdateForbiddenException extends PostException {

    public PostUpdateForbiddenException() {
        super(PostExceptionCode.POST_UPDATE_FORBIDDEN);
    }

    public PostUpdateForbiddenException(String message) {
        super(PostExceptionCode.POST_UPDATE_FORBIDDEN, message);
    }
}
