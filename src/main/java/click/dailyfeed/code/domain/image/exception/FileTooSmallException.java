package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;

import java.util.function.Supplier;

public class FileTooSmallException extends ImageException {

    public FileTooSmallException() {
        super(ImageExceptionCode.FILE_TOO_SMALL);
    }

    public FileTooSmallException(Supplier<String> messageSupplier) {
        super(ImageExceptionCode.FILE_TOO_SMALL, messageSupplier);
    }
}
