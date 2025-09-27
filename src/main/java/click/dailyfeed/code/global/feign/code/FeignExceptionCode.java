package click.dailyfeed.code.global.feign.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FeignExceptionCode {
    API_COMMUNICATION_FAIL("잠시 후 다시 시도해주세요", "API_COMMUNICATION_FAIL", 500),
    API_SERIALIZATION_FAIL("잠시 후 다시 시도해주세요", "API_SERIALIZATION_FAIL", 500);
    private final String message;
    private final String reason;
    private final Integer code;
}
