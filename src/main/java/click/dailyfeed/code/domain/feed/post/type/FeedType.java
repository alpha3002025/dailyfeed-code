package click.dailyfeed.code.domain.feed.post.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeedType {
    FOLLOWING("팔로잉", "팔로잉한 사용자들의 게시물"),
    RECOMMENDED("추천", "추천 알고리즘 기반 게시물"),
    POPULAR("인기", "실시간 인기 게시물"),
    MIXED("혼합", "팔로잉 + 추천 게시물 혼합");

    private final String displayName;
    private final String description;
}
