package click.dailyfeed.code.domain.activity.dto;

import click.dailyfeed.code.domain.activity.type.MemberActivityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MemberActivityDto {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberActivity {
        private Long memberId;
        private Long postId;
        private Long commentId;
        private MemberActivityType memberActivityType;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostActivityRequest {
        private Long memberId;
        private Long postId;
        private MemberActivityType activityType;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CommentActivityRequest {
        private Long memberId;
        private Long postId;
        private Long commentId;
        private MemberActivityType activityType;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostLikeActivityRequest {
        private Long memberId;
        private Long postId;
        private MemberActivityType activityType;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CommentLikeActivityRequest {
        private Long memberId;
        private Long postId;
        private Long commentId;
        private MemberActivityType activityType;
    }
}
