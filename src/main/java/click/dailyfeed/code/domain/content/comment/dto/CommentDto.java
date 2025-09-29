package click.dailyfeed.code.domain.content.comment.dto;

import click.dailyfeed.code.domain.content.comment.type.CommentActivityType;
import click.dailyfeed.code.domain.content.comment.type.CommentLikeType;
import click.dailyfeed.code.domain.member.member.dto.MemberProfileDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
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
    public static class Comment{
        private Long id;
        private String content;
        private Long authorId;
        private String authorName;
        private String authorHandle;
        private Long postId;
        private Long parentId;
        private Integer depth;
        private List<Comment> children;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public void updateAuthor(MemberProfileDto.Summary author) {
            this.authorId = author.getId();
            this.authorName = author.getMemberName();
            this.authorHandle = author.getMemberHandle();
        }

        public void updateAuthorRecursively(Map<Long, MemberProfileDto.Summary> authorMap) {
            // 현재 댓글의 작성자 정보 설정
            MemberProfileDto.Summary author = authorMap.get(this.authorId);
            if (author != null) {
                this.authorId = author.getId();
                this.authorName = author.getMemberName();
                this.authorHandle = author.getMemberHandle();
            }

            // 자식 댓글들의 작성자 정보도 설정
            this.children.forEach(child -> child.updateAuthorRecursively(authorMap));
        }
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CommentSummary {
        private Long id;
        private String content;
        private Long authorId;
        private MemberProfileDto.Summary author;
        private Long postId;
        private String postTitle; // 게시글 제목
        private Long parentId;
        private Integer depth;
        private Long likeCount;
        private int childrenCount;
        private LocalDateTime createdAt;

        public void updateAuthor(MemberProfileDto.Summary author) {
            this.author = author;
        }
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

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CommentActivityEvent { // MongoDB에서 읽어들일때는 PostActivityType = DELETED 가 아닌 데이터 + followingId = ?, Sort = UpdatedAt DESC 을 Paging
        private Long memberId;
        private Long commentId;
        private CommentActivityType commentActivityType;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LikeActivityEvent { // MongoDB에서 읽어들일때는 PostActivityType = DELETED 가 아닌 데이터 + followingId = ?, Sort = UpdatedAt DESC 을 Paging
        private Long memberId;
        private Long commentId;
        private CommentLikeType commentLikeType;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }
}
