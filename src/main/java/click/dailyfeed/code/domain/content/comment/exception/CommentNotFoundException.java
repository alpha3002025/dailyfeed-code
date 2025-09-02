package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class CommentNotFoundException extends CommentException{
    public CommentNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
