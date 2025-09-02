package click.dailyfeed.code.domain.content.comment.exception;

import click.dailyfeed.code.domain.content.comment.code.CommentExceptionCode;

public class CommentDepthLimitExceedsException extends CommentException{
    public CommentDepthLimitExceedsException() {
        super(CommentExceptionCode.COMMENT_DEPTH_LIMIT_EXCEEDS);
    }
}
