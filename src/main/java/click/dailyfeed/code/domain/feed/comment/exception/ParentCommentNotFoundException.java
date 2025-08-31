package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class ParentCommentNotFoundException extends CommentException{
    public ParentCommentNotFoundException(){
        super(CommentExceptionCode.PARENT_COMMENT_NOT_FOUND);
    }
}
