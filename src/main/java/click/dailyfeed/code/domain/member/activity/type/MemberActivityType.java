package click.dailyfeed.code.domain.member.activity.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;

@Getter
@AllArgsConstructor
public enum MemberActivityType {
    POST_CREATE("POST_CREATE", "글 작성"),
    POST_UPDATE("POST_UPDATE", "글 수정"),
    POST_DELETE("POST_DELETE", "글 삭제"),
    POST_READ("POST_READ", "글 상세 조회"),

    LIKE_POST("LIKE_POST", "글 좋아요"),
    LIKE_POST_CANCEL("LIKE_CANCEL_POST", "글 좋아요 취소"),
    LIKE_COMMENT("LIKE_COMMENT", "댓글 좋아요"),
    LIKE_COMMENT_CANCEL("LIKE_COMMENT_CANCEL", "댓글 좋아요 취소"),

    COMMENT_CREATE("COMMENT_CREATE", "댓글 작성"),
    COMMENT_UPDATE("COMMENT_UPDATE", "댓글 수정"),
    COMMENT_DELETE("COMMENT_DELETE", "댓글 삭제"),
    COMMENT_READ("COMMENT_READ", "댓글 상세 조회"),

    MEMBER_FOLLOW("MEMBER_FOLLOW", "회원 팔로우"),
    MEMBER_UNFOLLOW("MEMBER_UNFOLLOW", "회원 언팔로우"),
    MEMBER_SIGNUP("MEMBER_SIGNUP", "회원 가입"),
    MEMBER_LOGIN("MEMBER_LOGIN", "회원 로그인"),
    MEMBER_LOGOUT("MEMBER_LOGOUT", "회원 로그아웃");

    private final String code;
    private final String message;

    public static final EnumSet<MemberActivityType> postEventTypes = EnumSet.of(
            POST_CREATE,
            POST_UPDATE,
            POST_DELETE,
            POST_READ
    );

    public static final EnumSet<MemberActivityType> postLikeEventTypes = EnumSet.of(
            LIKE_POST,
            LIKE_POST_CANCEL
    );

    public static final EnumSet<MemberActivityType> commentLikeEventTypes = EnumSet.of(
            LIKE_COMMENT,
            LIKE_COMMENT_CANCEL
    );

    public static final EnumSet<MemberActivityType> commentEventTypes = EnumSet.of(
            COMMENT_CREATE,
            COMMENT_UPDATE,
            COMMENT_DELETE,
            COMMENT_READ
    );

    public static final EnumSet<MemberActivityType> memberEventTypes = EnumSet.of(
            MEMBER_FOLLOW,
            MEMBER_UNFOLLOW,
            MEMBER_LOGOUT,
            MEMBER_LOGIN,
            MEMBER_SIGNUP
    );


}
