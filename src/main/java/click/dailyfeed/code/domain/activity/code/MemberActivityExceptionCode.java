package click.dailyfeed.code.domain.activity.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberActivityExceptionCode {
    UNDEFINED_ACTIVITY_EVENT_TYPE("잠시 후에 다시 시도해주세요", "UNDEFINED_ACTIVITY_EVENT_TYPE", 500);

    private final String message;
    private final String reason;
    private final Integer code;
}
