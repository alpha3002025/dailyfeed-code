package click.dailyfeed.code.domain.member.follow.dto;

import click.dailyfeed.code.domain.content.post.type.PostActivityType;
import click.dailyfeed.code.global.web.response.DailyfeedPage;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

public class FollowDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Follower {
        private Long memberId;
        private String name;
        private String email;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Following {
        private Long memberId;
        private String name;
        private String email;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class FollowPage {
        DailyfeedPage<Follower> followers;
        DailyfeedPage<Following> followings;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LatestPost {
        private Long memberId;
        private Long postId;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class FollowActivity {
        private Long followingMemberId;
        private String followingMemberName;
        private Long postId;
        private PostActivityType activityType;
        private LocalDateTime updatedAt;

        public static FollowActivity of(Long followingMemberId, String followingMemberName, Long postId, PostActivityType activityType, LocalDateTime updatedAt){
            return FollowActivity.builder()
                    .followingMemberId(followingMemberId)
                    .followingMemberName(followingMemberName)
                    .postId(postId)
                    .activityType(activityType)
                    .updatedAt(updatedAt)
                    .build();
        }
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class FollowRequest {
        private Long memberIdToFollow;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UnfollowRequest {
        private Long memberIdToUnfollow;
    }
}
