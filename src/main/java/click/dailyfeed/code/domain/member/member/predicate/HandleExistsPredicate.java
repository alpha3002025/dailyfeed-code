package click.dailyfeed.code.domain.member.member.predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HandleExistsPredicate {
    EXISTS("EXISTS"),
    NOT_EXISTS("NOT_EXISTS");

    private final String value;
}
