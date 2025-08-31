package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;
import lombok.Getter;

@Getter
public class JwtException extends RuntimeException {
    private final JwtExceptionCode jwtExceptionCode;

    public JwtException(JwtExceptionCode jwtExceptionCode) {
        super(jwtExceptionCode.getMessage());
        this.jwtExceptionCode = jwtExceptionCode;
    }

    public JwtException(JwtExceptionCode jwtExceptionCode, Throwable cause) {
        super(jwtExceptionCode.getMessage(), cause);
        this.jwtExceptionCode = jwtExceptionCode;
    }

    public JwtException(JwtExceptionCode jwtExceptionCode, String additionalMessage) {
        super(jwtExceptionCode.getMessage() + " " + additionalMessage);
        this.jwtExceptionCode = jwtExceptionCode;
    }

    public JwtException(JwtExceptionCode jwtExceptionCode, String additionalMessage, Throwable cause) {
        super(jwtExceptionCode.getMessage() + " " + additionalMessage, cause);
        this.jwtExceptionCode = jwtExceptionCode;
    }
}
