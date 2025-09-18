package click.dailyfeed.code.domain.authentication.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthenticationExceptionCode {
    LOGOUT_FAIL_BAD_REQUEST("잘못된 요청입니다", "LOGOUT_FAIL_BAD_REQUEST", 400),
    LOGOUT_FAIL_UNAUTHORIZED("로그아웃 도중 에러가 발생했습니다", "LOGOUT_FAIL_UNAUTHORIZED", 401), // 인증토큰 문제
    LOGOUT_FAIL_INTERNAL_SERVER_ERROR("서버 내부 오류가 발생했습니다", "LOGOUT_FAIL_INTERNAL_SERVER_ERROR", 500);

    private final String message;
    private final String reason;
    private final Integer code;
}
