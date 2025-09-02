package click.dailyfeed.code.domain.content.post.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeedAlgorithm {
    CHRONOLOGICAL("시간순", "최신 게시물 우선"),
    ENGAGEMENT_BASED("인게이지먼트 기반", "좋아요/댓글/리포스트 기준"),
    INTEREST_BASED("관심사 기반", "사용자 관심사와 유사도 기준"),
    SOCIAL_SIGNALS("소셜 신호", "팔로잉 사용자들의 활동 기준"),
    ML_PERSONALIZED("ML 개인화", "머신러닝 기반 개인화");

    private final String displayName;
    private final String description;
}
