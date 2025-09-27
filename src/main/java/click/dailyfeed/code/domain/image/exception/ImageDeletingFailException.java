package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class ImageDeletingFailException extends ImageException {

    public ImageDeletingFailException() {
        super(ImageExceptionCode.IMAGE_DELETING_FAIL);
    }

    public ImageDeletingFailException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.IMAGE_DELETING_FAIL, messageSupplier);
    }
}
