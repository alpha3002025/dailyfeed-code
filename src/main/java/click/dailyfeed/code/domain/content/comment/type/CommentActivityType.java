package click.dailyfeed.code.domain.content.comment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommentActivityType {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    SOFT_DELETE("SOFT_DELETE"),
    HARD_DELETE("HARD_DELETE");

    private final String activityName;
}
