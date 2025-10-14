package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class CommentLikeAlreadyExistsException extends CommentException{
    public CommentLikeAlreadyExistsException(){
        super(CommentExceptionCode.PARENT_COMMENT_NOT_FOUND);
    }
}
