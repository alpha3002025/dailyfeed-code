package click.dailyfeed.code.domain.content.post.exception;

import click.dailyfeed.code.domain.content.post.code.PostExceptionCode;
import lombok.Getter;

@Getter
public class PostException extends RuntimeException {
    private final PostExceptionCode postExceptionCode;

    public PostException(PostExceptionCode postExceptionCode) {
        super(postExceptionCode.getMessage());
        this.postExceptionCode = postExceptionCode;
    }

    public PostException(PostExceptionCode postExceptionCode, String message) {
        super(postExceptionCode.getMessage() + " " + message);
        this.postExceptionCode = postExceptionCode;
    }
}
