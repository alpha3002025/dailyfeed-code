package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class PostNotFoundException extends CommentException{
    public PostNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
