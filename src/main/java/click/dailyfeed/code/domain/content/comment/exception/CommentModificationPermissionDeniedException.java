package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class CommentModificationPermissionDeniedException extends CommentException{
    public CommentModificationPermissionDeniedException() {
        super(CommentExceptionCode.COMMENT_MODIFICATION_PERMISSION_DENIED);
    }
}
