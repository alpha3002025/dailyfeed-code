package click.dailyfeed.code.domain.image.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ImageExceptionCode {
    CORRUPTED_IMAGE("CORRUPTED_IMAGE", "손상된 이미지는 업로드 불가능합니다", 400),
    THUMBNAIL_PROCESSING_FAIL("THUMBNAIL_PROCESS_FAIL", "썸네일로 생성할 수 없는 이미지입니다", 400),
    IMAGE_PROCESSING_FAIL("IMAGE_PROCESSING_FAIL", "이미지 처리에 실패했습니다", 500),
    IMAGE_READING_FAIL("IMAGE_READING_FAIL", "이미지 읽기에 실패했습니다", 500),
    IMAGE_CLEANING_UP_FAIL("IMAGE_CLEANING_UP_FAIL", "이미지 처리에 실패했습니다. 잠시후 다시 시도해주세요", 500),
    EMPTY_IMAGE_FILE("EMPTY_IMAGE_FILE", "비어있는 이미지는 업로드할 수 없습니다", 400),
    FILE_TOO_SMALL("FILE_TOO_SMALL", "파일이 너무 작습니다", 400),
    INVALID_IMAGE_SIGNATURE("INVALID_IMAGE_SIGNATURE", "유효하지 않은 형식의 이미지입니다 (jpeg,png,gif,bmp,webp 만 지원)", 400);
    private final String code;
    private final String message;
    private final int statusCode;
}
