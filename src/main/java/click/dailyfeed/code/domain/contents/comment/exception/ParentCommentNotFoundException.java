package click.dailyfeed.code.domain.contents.comment.exception;

import click.dailyfeed.code.domain.contents.comment.code.CommentExceptionCode;

public class ParentCommentNotFoundException extends CommentException{
    public ParentCommentNotFoundException(){
        super(CommentExceptionCode.PARENT_COMMENT_NOT_FOUND);
    }
}
