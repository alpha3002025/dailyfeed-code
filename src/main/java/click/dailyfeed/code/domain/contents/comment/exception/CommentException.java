package click.dailyfeed.code.domain.contents.comment.exception;

import click.dailyfeed.code.domain.contents.comment.code.CommentExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class CommentException extends RuntimeException{
    private final CommentExceptionCode commentExceptionCode;

    public CommentException(CommentExceptionCode commentExceptionCode) {
        super(commentExceptionCode.getMessage());
        this.commentExceptionCode = commentExceptionCode;
    }

    public CommentException(CommentExceptionCode commentExceptionCode, Throwable cause) {
        super(commentExceptionCode.getMessage(), cause);
        this.commentExceptionCode = commentExceptionCode;
    }

    public CommentException(CommentExceptionCode commentExceptionCode, Supplier<String> additionalMessage) {
        super(commentExceptionCode.getMessage() + " " + additionalMessage.get());
        this.commentExceptionCode = commentExceptionCode;
    }
}
