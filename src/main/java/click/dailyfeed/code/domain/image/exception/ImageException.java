package click.dailyfeed.code.domain.image.exception;

import click.dailyfeed.code.domain.image.code.ImageExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class ImageException extends RuntimeException {
    private final ImageExceptionCode imageExceptionCode;

    public ImageException(ImageExceptionCode imageExceptionCode) {
        super(imageExceptionCode.getMessage());
        this.imageExceptionCode = imageExceptionCode;
    }

    public ImageException(ImageExceptionCode imageExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.imageExceptionCode = imageExceptionCode;
    }
}
