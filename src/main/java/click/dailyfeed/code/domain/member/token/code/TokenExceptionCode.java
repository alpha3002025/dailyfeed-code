package click.dailyfeed.code.domain.member.token.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenExceptionCode {
    TOKEN_REFRESH_NEEDED("인증정보를 새로고침해주세요", "TOKEN_REFRESH_NEEDED", 401),
    KEY_REFRESH_ERROR("잠시 후 다시 시도해주세요", "KEY_REFRESH_ERROR", 500);

    private final String message;
    private final String reason;
    private final Integer code;
}
