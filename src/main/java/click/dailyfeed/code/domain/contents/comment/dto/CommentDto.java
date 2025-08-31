package click.dailyfeed.code.domain.contents.comment.dto;

import click.dailyfeed.code.domain.member.member.dto.MemberDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

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
        private String authorEmail;
        private Long postId;
        private Long parentId;
        private Integer depth;
        private List<Comment> children;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;
        private MemberDto.Member author;

        public void updateAuthor(MemberDto.Member author) {
            this.author = author;
        }

        public void updateAuthorRecursively(Map<Long, MemberDto.Member> authorMap) {
            // 현재 댓글의 작성자 정보 설정
            MemberDto.Member author = authorMap.get(this.authorId);
            if (author != null) {
                this.author = author;
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
        private MemberDto.Member author;
        private Long postId;
        private String postTitle; // 게시글 제목
        private Long parentId;
        private Integer depth;
        private Long likeCount;
        private int childrenCount;
        private LocalDateTime createdDate;

        public void updateAuthor(MemberDto.Member author) {
            this.author = author;
        }
    }


}
