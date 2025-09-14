package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageType {
    AVATAR("avatar"),
    COVER("cover"),
    GALLERY("gallery");

    private final String value;
}
