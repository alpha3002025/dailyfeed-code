package click.dailyfeed.code.domain.content.comment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommentLikeType {
    LIKE("LIKE"),
    DISLIKE("CANCEL");
    private final String likeType;
}
