package click.dailyfeed.code.domain.contents.comment.exception;

import click.dailyfeed.code.domain.contents.comment.code.CommentExceptionCode;

public class CommentNotFoundException extends CommentException{
    public CommentNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
