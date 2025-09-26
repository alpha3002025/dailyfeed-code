package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class ImageCleaningUpFailException extends ImageException {

    public ImageCleaningUpFailException() {
        super(ImageExceptionCode.IMAGE_CLEANING_UP_FAIL);
    }

    public ImageCleaningUpFailException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.IMAGE_CLEANING_UP_FAIL, messageSupplier);
    }
}
