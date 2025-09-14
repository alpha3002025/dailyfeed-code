package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PrivacyLevel {
    PUBLIC("public"),
    FRIENDS("friends"),
    PRIVATE("private");

    private final String value;
}
