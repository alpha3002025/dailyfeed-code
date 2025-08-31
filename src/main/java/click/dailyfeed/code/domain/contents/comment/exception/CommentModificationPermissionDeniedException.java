package click.dailyfeed.code.domain.contents.comment.exception;

import click.dailyfeed.code.domain.contents.comment.code.CommentExceptionCode;

public class CommentModificationPermissionDeniedException extends CommentException{
    public CommentModificationPermissionDeniedException() {
        super(CommentExceptionCode.COMMENT_MODIFICATION_PERMISSION_DENIED);
    }
}
