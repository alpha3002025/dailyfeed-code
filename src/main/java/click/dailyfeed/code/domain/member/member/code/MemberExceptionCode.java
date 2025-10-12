package click.dailyfeed.code.domain.member.member.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum MemberExceptionCode {
    MEMBER_ALREADY_EXISTS("이미 존재하는 사용자입니다", "MEMBER_ALREADY_EXISTS", 400),
    MEMBER_HANDLE_ALREADY_EXISTS("이미 존재하는 handle 입니다", "MEMBER_HANDLE_ALREADY_EXISTS", 400),
    MEMBER_IDS_LIMIT_EXCEEDS("허용되는 조회 건수를 초과했습니다", "MEMBER_IDS_LIMIT_EXCEEDS", 400),
    MEMBER_UNAUTHORIZED("유효하지 않거나 만료된 인증 토큰입니다", "MEMBER_UNAUTHORIZED", 401),
    MEMBER_FORBIDDEN("해당 요청에 대한 권한이 없습니다", "MEMBER_FORBIDDEN", 403),
    MEMBER_NOT_FOUND("존재하지 않는 사용자입니다", "MEMBER_NOT_FOUND", 404),
    MEMBER_PASSWORD_INVALID("유효하지 않은 패스워드입니다", "MEMBER_PASSWORD_INVALID", 403),
    MEMBER_API_CONNECTION_ERROR("계정 정보 조회 중 네트워크 오류가 발생했습니다", "MEMBER_API_CONNECTION_ERROR", 503),
    FEIGN_SERIALIZE_FAIL("잠시 후 다시 시도해주시기 바랍니다", "FEIGN_SERIALIZE_FAIL", 500),
    MEMBER_UNDEFINED_ERROR("잠시 후 다시 시도해주시기 바랍니다", "MEMBER_UNDEFINED_ERROR", 500);

    private final String message;
    private final String reason;
    private final Integer code;

    private final static Map<String, MemberExceptionCode> reasonMap = new HashMap<>();
    static {
        MemberExceptionCode[] values = MemberExceptionCode.values();
        for (MemberExceptionCode value : values) {
            reasonMap.put(value.reason, value);
        }
    }

    public static MemberExceptionCode fromReason(String reason) {
        return reasonMap.getOrDefault(reason, MEMBER_UNDEFINED_ERROR);
    }
}
