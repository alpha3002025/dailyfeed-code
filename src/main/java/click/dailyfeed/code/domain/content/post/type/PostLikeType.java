package click.dailyfeed.code.domain.content.post.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PostLikeType {
    LIKE("LIKE"),
    DISLIKE("CANCEL");
    private final String likeType;
}
