package click.dailyfeed.code.domain.content.post.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PostActivityType {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    SOFT_DELETE("SOFT_DELETE"),
    HARD_DELETE("HARD_DELETE");

    private final String activityName;
}
