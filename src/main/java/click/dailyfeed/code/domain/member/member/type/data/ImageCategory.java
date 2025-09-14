package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageCategory {
    ORIGINAL("original"),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    THUMBNAIL("thumbnail");

    private final String value;
    // 사이즈 순서 정의 (작은 것부터)
    public int getSizeOrder() {
        return switch (this) {
            case THUMBNAIL -> 1;
            case SMALL -> 2;
            case MEDIUM -> 3;
            case LARGE -> 4;
            case ORIGINAL -> 5;
        };
    }

    // 일반적인 픽셀 크기 반환 (참고용)
    public int getTypicalSize() {
        return switch (this) {
            case THUMBNAIL -> 64;
            case SMALL -> 150;
            case MEDIUM -> 300;
            case LARGE -> 600;
            case ORIGINAL -> 0; // 원본 크기
        };
    }
}
