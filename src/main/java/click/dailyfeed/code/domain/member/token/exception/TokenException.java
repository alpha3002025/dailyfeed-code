package click.dailyfeed.code.domain.member.token.exception;

import click.dailyfeed.code.domain.member.token.code.TokenExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class TokenException extends RuntimeException {
    private final TokenExceptionCode tokenExceptionCode;

    public TokenException(TokenExceptionCode tokenExceptionCode) {
        super(tokenExceptionCode.getMessage());
        this.tokenExceptionCode = tokenExceptionCode;
    }

    public TokenException(TokenExceptionCode tokenExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.tokenExceptionCode = tokenExceptionCode;
    }
}
