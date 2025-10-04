package click.dailyfeed.code.domain.activity.transport;

import click.dailyfeed.code.domain.activity.type.MemberActivityType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MemberActivityTransportDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MemberActivityEvent {
        private Long memberId;
        private Long postId;
        private Long commentId;
        private MemberActivityType memberActivityType;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }
}
