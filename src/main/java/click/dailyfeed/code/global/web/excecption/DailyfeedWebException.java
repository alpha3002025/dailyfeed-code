package click.dailyfeed.code.global.web.excecption;

import click.dailyfeed.code.global.web.code.WebExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class DailyfeedWebException extends RuntimeException {
    private final WebExceptionCode webExceptionCode;

    public DailyfeedWebException(WebExceptionCode webExceptionCode) {
        super(webExceptionCode.getExceptionCode());
        this.webExceptionCode = webExceptionCode;
    }

    public DailyfeedWebException(WebExceptionCode webExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.webExceptionCode = webExceptionCode;
    }
}
