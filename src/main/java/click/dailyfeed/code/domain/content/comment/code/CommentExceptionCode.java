package click.dailyfeed.code.domain.content.comment.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommentExceptionCode {
    POST_NOT_FOUND("게시글이 존재하지 않습니다", "POST_NOT_FOUND", 404),
    COMMENT_NOT_FOUND("댓글이 존재하지 않습니다.", "COMMENT_NOT_FOUND", 404),
    PARENT_COMMENT_NOT_FOUND("부모 댓글을 찾을 수 없습니다.", "PARENT_COMMENT_NOT_FOUND", 404),
    PARENT_COMMENT_POST_ID_NOT_EQUALS("부모 댓글의 게시글과 다른 글입니다", "PARENT_COMMENT_POST_ID_NOT_EQUALS", 400),
    COMMENT_DEPTH_LIMIT_EXCEEDS("댓글은 최대 3 단계까지만 가능합니다.", "COMMENT_DEPTH_LIMIT_EXCEEDS", 400),
    COMMENT_MODIFICATION_PERMISSION_DENIED("댓글을 수정할 권한이 없습니다.", "COMMENT_MODIFICATION_PERMISSION_DENIED", 403),
    COMMENT_DELETION_PERMISSION_DENIED("댓글을 삭제할 권한이 없습니다.", "COMMENT_DELETION_PERMISSION_DENIED", 403);

    private final String message;
    private final String reason;
    private final Integer code;
}
