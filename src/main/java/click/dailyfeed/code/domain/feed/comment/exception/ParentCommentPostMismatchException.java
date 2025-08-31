package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class ParentCommentPostMismatchException extends CommentException{
    public ParentCommentPostMismatchException(){
        super(CommentExceptionCode.PARENT_COMMENT_NOT_FOUND);
    }
}
