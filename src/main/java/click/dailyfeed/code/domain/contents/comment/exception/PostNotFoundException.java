package click.dailyfeed.code.domain.contents.comment.exception;

import click.dailyfeed.code.domain.contents.comment.code.CommentExceptionCode;

public class PostNotFoundException extends CommentException{
    public PostNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
