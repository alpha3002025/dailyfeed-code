package click.dailyfeed.code.domain.member.member.predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberExistsPredicate {
    NOT_EXISTS("NOT_EXISTS"),
    EXISTS("EXISTS");

    private final String predicateName;
}
