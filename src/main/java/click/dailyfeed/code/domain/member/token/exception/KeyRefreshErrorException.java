package click.dailyfeed.code.domain.member.token.exception;

import click.dailyfeed.code.domain.member.token.code.TokenExceptionCode;

import java.util.function.Supplier;

public class KeyRefreshErrorException extends TokenException {

    public KeyRefreshErrorException() {
        super(TokenExceptionCode.KEY_REFRESH_ERROR);
    }

    public KeyRefreshErrorException(Supplier<String> messageSupplier) {
        super(TokenExceptionCode.KEY_REFRESH_ERROR, messageSupplier);
    }
}
