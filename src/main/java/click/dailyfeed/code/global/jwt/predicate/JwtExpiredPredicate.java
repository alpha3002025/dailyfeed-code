package click.dailyfeed.code.global.jwt.predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum JwtExpiredPredicate {
    EXPIRED("EXPIRED"),
    NOT_EXPIRED("NOT_EXPIRED");

    private final String predicateName;
}
