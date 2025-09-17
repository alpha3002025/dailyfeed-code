package click.dailyfeed.code.domain.content.comment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommentLikeType {
    LIKE("LIKE"),
    CANCEL("CANCEL");
    private final String likeType;
}
