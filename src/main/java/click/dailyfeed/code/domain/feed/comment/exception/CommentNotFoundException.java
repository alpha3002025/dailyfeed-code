package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class CommentNotFoundException extends CommentException{
    public CommentNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
