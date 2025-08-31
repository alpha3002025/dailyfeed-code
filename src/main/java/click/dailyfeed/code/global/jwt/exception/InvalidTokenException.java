package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class InvalidTokenException extends JwtException {
    public InvalidTokenException() {
        super(JwtExceptionCode.INVALID_TOKEN);
    }

    public InvalidTokenException(Throwable cause) {
        super(JwtExceptionCode.INVALID_TOKEN, cause);
    }

    public InvalidTokenException(String additionalMessage) {
        super(JwtExceptionCode.INVALID_TOKEN, additionalMessage);
    }
}
