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
        private Long authorId;
        private String authorName;
        private String authorHandle;
        private String authorAvatarUrl;
        private Long id;
        private String activityType;
        private String title;
        private String content;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime createdAt;

        private Long viewCount;
        private Long likeCount;
        private Long commentCount;
    }
}
