package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class CorruptedImageException extends ImageException {

    public CorruptedImageException() {
        super(ImageExceptionCode.CORRUPTED_IMAGE);
    }

    public CorruptedImageException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.CORRUPTED_IMAGE, messageSupplier);
    }
}
