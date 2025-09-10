package click.dailyfeed.code.domain.timeline.timeline.predicate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PushPullPredicate {
    PUSH("PUSH"),
    PULL("PULL");
    private final String predicateName;
}
