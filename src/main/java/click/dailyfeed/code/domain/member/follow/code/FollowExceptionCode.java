package click.dailyfeed.code.domain.member.follow.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FollowExceptionCode {
    FOLLOWER_NOT_FOUND("해당 팔로워는 존재하지 않는 사용자입니다", "FOLLOWER_NOT_FOUND", 404),
    FOLLOW_RELATIONSHIP_NOT_FOUND("팔로워,팔로우 관계가 존재하지 않습니다", "FOLLOW_RELATIONSHIP_NOT_FOUND", 404),
    FOLLOW_RELATIONSHIP_ALREADY_EXISTS("팔로우 관계가 이미 존재합니다", "FOLLOW_RELATIONSHIP_ALREADY_EXISTS", 409);

    private final String message;
    private final String reason;
    private final Integer code;
}
