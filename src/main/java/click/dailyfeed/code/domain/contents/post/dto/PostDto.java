package click.dailyfeed.code.domain.contents.post.dto;

import click.dailyfeed.code.domain.contents.post.type.PostSortType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

public class PostDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreatePostRequest {
        @NotBlank(message = "제목은 필수입니다")
        @Size(max = 100, message = "제목은 100자 이하여야 합니다")
        private String title;

        @NotBlank(message = "내용은 필수입니다")
        @Size(max = 5000, message = "제목은 5000자 이하여야 합니다")
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UpdatePostRequest {
        @NotBlank(message = "제목은 필수입니다")
        @Size(max = 100, message = "제목은 100자 이하여야 합니다")
        private String title;

        @NotBlank(message = "내용은 필수입니다")
        @Size(max = 5000, message = "제목은 5000자 이하여야 합니다")
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Post{
        private Long id;
        private String title;
        private String content;
        private Long authorId;
        private String authorName;
        private String authorEmail;
        private Long viewCount;
        private Long likeCount;
        private Integer commentCount;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;

        public void updateAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public void updateAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
        }
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostSummary {
        private Long id;
        private String title;
        private Long authorId;
        private String authorName;
        private Long viewCount;
        private Long likeCount;
        private Integer commentCount;
        private LocalDateTime createdAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostSearchCriteria {
        private String keyword;        // 제목/내용 검색 키워드
        private String title;          // 제목 검색
        private String content;        // 내용 검색
        private Long authorId;         // 작성자 ID
        private PostSortType sortType; // 정렬 방식
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostStatistics {
        private long totalPosts;        // 전체 게시글 수
        private long totalViews;        // 전체 조회수
        private long totalLikes;        // 전체 좋아요 수
        private long totalComments;     // 전체 댓글 수
        private double averageViewsPerPost;  // 게시글당 평균 조회수
        private double averageLikesPerPost;  // 게시글당 평균 좋아요 수
        private double averageCommentsPerPost; // 게시글당 평균 댓글 수
    }
}
