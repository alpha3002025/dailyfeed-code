package click.dailyfeed.code.global.web.excecption;

import click.dailyfeed.code.global.web.code.WebExceptionCode;

import java.util.function.Supplier;

public class DailyfeedWebTooManyRequestException extends DailyfeedWebException {

    public DailyfeedWebTooManyRequestException() {
        super(WebExceptionCode.TOO_MANY_REQUEST);
    }

    public DailyfeedWebTooManyRequestException(Supplier<String> messageSupplier) {
        super(WebExceptionCode.TOO_MANY_REQUEST, messageSupplier);
    }
}