package click.dailyfeed.code.domain.content.post.dto;

import click.dailyfeed.code.domain.content.post.type.PostActivityType;
import click.dailyfeed.code.domain.content.post.type.PostLikeType;
import click.dailyfeed.code.domain.content.post.type.PostSortType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

public class PostDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreatePostRequest {
//        @NotBlank(message = "제목은 필수입니다")
//        @Size(max = 100, message = "제목은 100자 이하여야 합니다")
        private String title;

        @NotBlank(message = "내용은 필수입니다")
        @Size(max = 5000, message = "제목은 50000자 이하여야 합니다")
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class UpdatePostRequest {
//        @NotBlank(message = "제목은 필수입니다")
//        @Size(max = 100, message = "제목은 100자 이하여야 합니다")
        private String title;

        @NotBlank(message = "내용은 필수입니다")
        @Size(max = 5000, message = "제목은 5000자 이하여야 합니다")
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostsBulkRequest {
        private Set<Long> ids;
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
        private String authorHandle;
        private String authorAvatarUrl;
        private Long viewCount; // TODO SEASON 2
        private Long likeCount;
        private Long commentCount;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updatedAt;
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
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostActivityEvent { // MongoDB에서 읽어들일때는 PostActivityType = DELETED 가 아닌 데이터 + followingId = ?, Sort = UpdatedAt DESC 을 Paging
        private Long memberId;
        private Long followingId;
        private Long postId;
        private PostActivityType postActivityType;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updatedAt;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class LikeActivityEvent { // MongoDB에서 읽어들일때는 PostActivityType = DELETED 가 아닌 데이터 + followingId = ?, Sort = UpdatedAt DESC 을 Paging
        private Long memberId;
        private Long postId;
        private PostLikeType postLikeType;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updatedAt;
    }

    /// 통계
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostLikeCountQueryBulkRequest {
        private Set<Long> postPks;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostLikeCountStatistics {
        private Long postPk;
        private Integer likeCount;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostCommentCountQueryBulkRequest {
        private Set<Long> postPks;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostCommentCountStatistics {
        private Long postPk;
        private Integer commentCount;
    }

    /// 삭제 예정 //////
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class PostSearchResult {
        private Long postPk;
        private String title;
        private String content;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime updatedAt;
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
