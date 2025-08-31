package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class PostNotFoundException extends CommentException{
    public PostNotFoundException(){
        super(CommentExceptionCode.POST_NOT_FOUND);
    }
}
