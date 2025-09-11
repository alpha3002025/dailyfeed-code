package click.dailyfeed.code.global.feign.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FeignExceptionCode {
    API_COMMUNICATION_FAIL("API 통신 실패", "API_COMMUNICATION_FAIL", 500);
    private final String message;
    private final String reason;
    private final Integer code;
}
