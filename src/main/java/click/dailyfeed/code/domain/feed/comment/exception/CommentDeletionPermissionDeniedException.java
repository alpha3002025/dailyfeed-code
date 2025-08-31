package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class CommentDeletionPermissionDeniedException extends CommentException{
    public CommentDeletionPermissionDeniedException() {
        super(CommentExceptionCode.COMMENT_DELETION_PERMISSION_DENIED);
    }
}
