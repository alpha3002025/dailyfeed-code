package click.dailyfeed.code.domain.member.key.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JwtKeyExceptionCode {
    PRIMARY_KEY_MISSING("다시 로그인해주세요", "PRIMARY_KEY_MISSING", 401),
    JWT_KEY_EXPIRED("키가 만료되었습니다", "JWT_KEY_EXPIRED", 401),
    PRIMARY_KEY_NOT_EXIST("키가 없습니다. 키를 생성해야 합니다", "PRIMARY_KEY_NOT_EXIST", 401);

    private final String message;
    private final String reason;
    private final Integer code;
}
