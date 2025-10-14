package click.dailyfeed.code.domain.content.comment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

public class CommentDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreateCommentRequest {
        @NotBlank(message = "댓글 내용은 필수입니다")
        @Size(max = 1000, message = "댓글은 1000자 이하여야 합니다")
        private String content;

        @NotNull(message = "게시글 ID는 필수입니다")
        private Long postId;

        // 대댓글인 경우 부모 댓글 ID
        private Long parentId;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UpdateCommentRequest {
        @NotBlank(message = "댓글 내용은 필수입니다")
        @Size(max = 1000, message = "댓글은 1000자 이하여야 합니다")
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class ReplyComment {
        private Long id;
        private String content;
        private Long authorId;
        private String authorName;
        private String authorHandle;
        private String authorAvatarUrl;
        private Long postId;
        private Long parentId;
        private Integer depth;
        private Long likeCount;
        private Long replyCount;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CommentSearchResult {
        private Long pk;
        private Long parentPk;
        private Long postPk;
        private String content;
        private String author;
        private String path;
        private Integer depth;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Integer replyCount; // 자식 댓글 수
        private Integer totalReplies; // 전체 하위 댓글 수
    }


    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CommentLikeCountBulkRequest {
        private Set<Long> commentIds;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CommentLikeCountStatistics {
        private Integer likeCount;
        private Long commentPk;
    }
}
