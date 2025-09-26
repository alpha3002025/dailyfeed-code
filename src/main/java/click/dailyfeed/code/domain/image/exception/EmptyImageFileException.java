package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class EmptyImageFileException extends ImageException {

    public EmptyImageFileException() {
        super(ImageExceptionCode.EMPTY_IMAGE_FILE);
    }

    public EmptyImageFileException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.EMPTY_IMAGE_FILE, messageSupplier);
    }
}
