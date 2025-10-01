package click.dailyfeed.code.domain.timeline.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class TimelineStatisticsDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PostItemCounts {
        private Long commentCount;
        private Long likeCount;
    }
}
