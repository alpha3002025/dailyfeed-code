package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class ThumbnailProcessingFailException extends ImageException {

    public ThumbnailProcessingFailException() {
        super(ImageExceptionCode.THUMBNAIL_PROCESSING_FAIL);
    }

    public ThumbnailProcessingFailException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.THUMBNAIL_PROCESSING_FAIL, messageSupplier);
    }
}
