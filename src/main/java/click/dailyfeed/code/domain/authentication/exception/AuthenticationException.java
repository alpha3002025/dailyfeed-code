package click.dailyfeed.code.domain.authentication.exception;

import click.dailyfeed.code.domain.authentication.code.AuthenticationExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class AuthenticationException extends RuntimeException {
    private final AuthenticationExceptionCode authenticationExceptionCode;

    public AuthenticationException(AuthenticationExceptionCode authenticationExceptionCode) {
        super(authenticationExceptionCode.getMessage());
        this.authenticationExceptionCode = authenticationExceptionCode;
    }

    public AuthenticationException(AuthenticationExceptionCode authenticationExceptionCode, Supplier<String> messageSupplier) {
        super(messageSupplier.get());
        this.authenticationExceptionCode = authenticationExceptionCode;
    }
}
