package click.dailyfeed.code.domain.feed.comment.exception;

import click.dailyfeed.code.domain.feed.comment.code.CommentExceptionCode;

public class CommentModificationPermissionDeniedException extends CommentException{
    public CommentModificationPermissionDeniedException() {
        super(CommentExceptionCode.COMMENT_MODIFICATION_PERMISSION_DENIED);
    }
}
