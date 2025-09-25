package click.dailyfeed.code.domain.timeline.timeline.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

public class TimelineDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class TimelinePostActivity {
        private String id;
        private Long authorId;
        private String authorName;
        private String memberHandle;
        private Long postId;
        private String activityType;
        private String title;
        private String content;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;

        // TODO : 아직 결정을 못했다.
        // Post 정보 (조인된 데이터)
//        private String postContent;
//        private Long viewCount;
//        private Long likeCount;

    }
}
