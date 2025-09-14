package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderType {
    MALE("male"),
    FEMALE("female"),
    OTHER("other"),
    PREFER_NOT_TO_SAY("prefer_not_to_say");

    private final String value;
}
