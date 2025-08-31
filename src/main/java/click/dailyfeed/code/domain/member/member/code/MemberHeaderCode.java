package click.dailyfeed.code.domain.member.member.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberHeaderCode {
    X_TOKEN_REFRESH_NEEDED("X-Token-Refresh-Needed");
    private final String headerKey;
}
