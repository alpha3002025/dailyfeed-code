package click.dailyfeed.code.domain.member.member.predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BlackListedPredicate {
    BLACKLISTED("BLACKLISTED"),
    NOT_BLACKLISTED("NOT_BLACKLISTED");
    private final String code;
}
