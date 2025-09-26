package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class ImageProcessingFailException extends ImageException {

    public ImageProcessingFailException() {
        super(ImageExceptionCode.IMAGE_PROCESSING_FAIL);
    }

    public ImageProcessingFailException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.IMAGE_PROCESSING_FAIL, messageSupplier);
    }
}
