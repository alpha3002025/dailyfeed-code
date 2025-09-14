package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VerificationStatus {
    NONE("none"),
    PENDING("pending"),
    VERIFIED("verified");

    private final String value;
}
