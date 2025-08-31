package click.dailyfeed.code.global.jwt.code;

import click.dailyfeed.code.global.jwt.exception.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JwtExceptionCode {
    INVALID_TOKEN("유효하지 않은 토큰입니다", "INVALID_TOKEN", 401),
    JWT_EXPIRED("로그인 유효기간이 지났습니다. 다시 로그인해주세요.", "JWT_EXPIRED", 401),
    TOKEN_PAYLOAD_EMPTY("토큰 내용이 비어있습니다", "TOKEN_PAYLOAD_EMPTY", 400),
    TOKEN_MISSING_CLAIMS("토큰에 필수 정보가 없습니다", "TOKEN_MISSING_CLAIMS", 400),
    TOKEN_MISSING_EXPIRATION("토큰에 만료기한이 없습니다", "TOKEN_MISSING_EXPIRATION", 400),
    BEARER_TOKEN_MISSING("Bearer 토큰이 없습니다", "BEARER_TOKEN_MISSING", 401);

    private final String message;
    private final String reason;
    private final Integer code;

    /**
     * 현재 코드에 해당하는 구체적인 예외 인스턴스를 생성
     * @return 해당하는 JwtException 구현체
     */
    public JwtException createException() {
        switch (this) {
            case INVALID_TOKEN:
                return new InvalidTokenException();
            case JWT_EXPIRED:
                return new JwtExpiredException();
            case TOKEN_PAYLOAD_EMPTY:
                return new TokenPayloadEmptyException();
            case TOKEN_MISSING_CLAIMS:
                return new TokenMissingClaimsException();
            case TOKEN_MISSING_EXPIRATION:
                return new TokenMissingExpirationException();
            case BEARER_TOKEN_MISSING:
                return new BearerTokenMissingException();
            default:
                return new JwtException(this);
        }
    }
}
