package click.dailyfeed.code.domain.member.member.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberActivityType {
    LOGIN("LOGIN"),
    SIGNUP("SIGNUP"),
    LOGOUT("LOGOUT"),
    REFRESH_TOKEN("REFRESH_TOKEN");

    private final String activityName;
}
