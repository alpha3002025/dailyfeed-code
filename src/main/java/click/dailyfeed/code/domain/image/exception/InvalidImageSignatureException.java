package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class InvalidImageSignatureException extends ImageException {

    public InvalidImageSignatureException() {
        super(ImageExceptionCode.INVALID_IMAGE_SIGNATURE);
    }

    public InvalidImageSignatureException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.INVALID_IMAGE_SIGNATURE, messageSupplier);
    }
}
