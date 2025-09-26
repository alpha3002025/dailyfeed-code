package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class ImageReadingFailException extends ImageException {

    public ImageReadingFailException() {
        super(ImageExceptionCode.IMAGE_READING_FAIL);
    }

    public ImageReadingFailException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.IMAGE_READING_FAIL, messageSupplier);
    }
}
