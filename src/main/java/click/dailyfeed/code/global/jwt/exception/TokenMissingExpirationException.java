package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class TokenMissingExpirationException extends JwtException {
    public TokenMissingExpirationException() {
        super(JwtExceptionCode.TOKEN_MISSING_EXPIRATION);
    }

    public TokenMissingExpirationException(Throwable cause) {
        super(JwtExceptionCode.TOKEN_MISSING_EXPIRATION, cause);
    }
}
