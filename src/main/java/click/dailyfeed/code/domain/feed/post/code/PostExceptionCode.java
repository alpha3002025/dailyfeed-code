package click.dailyfeed.code.domain.feed.post.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PostExceptionCode {
    POST_NOT_FOUND("게시글을 찾을 수 없습니다", "POST_NOT_FOUND", 404),
    POST_UPDATE_FORBIDDEN("게시글을 수정할 권한이 없습니다", "POST_UPDATE_FORBIDDEN", 403),
    POST_DELETE_FORBIDDEN("게시글을 삭제할 권한이 없습니다", "POST_DELETE_FORBIDDEN", 403),
    POST_CONTENT_EMPTY("게시글 내용이 비어있습니다", "POST_CONTENT_EMPTY", 400),
    POST_TITLE_TOO_LONG("게시글 제목이 너무 깁니다", "POST_TITLE_TOO_LONG", 400),
    POST_ALREADY_DELETED("이미 삭제된 게시글입니다", "POST_ALREADY_DELETED", 410);

    private final String message;
    private final String reason;
    private final Integer code;
}
