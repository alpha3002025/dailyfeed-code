package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class CommentDeletionPermissionDeniedException extends CommentException{
    public CommentDeletionPermissionDeniedException() {
        super(CommentExceptionCode.COMMENT_DELETION_PERMISSION_DENIED);
    }
}
