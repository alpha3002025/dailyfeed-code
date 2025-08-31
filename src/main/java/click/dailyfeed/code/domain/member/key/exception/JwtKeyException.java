package click.dailyfeed.code.domain.member.key.exception;

import click.dailyfeed.code.domain.member.key.code.JwtKeyExceptionCode;
import lombok.Getter;

@Getter
public class JwtKeyException extends RuntimeException {
    private final JwtKeyExceptionCode jwtKeyExceptionCode;

    public JwtKeyException(JwtKeyExceptionCode jwtKeyExceptionCode) {
        this.jwtKeyExceptionCode = jwtKeyExceptionCode;
    }

    public JwtKeyException(JwtKeyExceptionCode jwtExceptionCode, String message) {
        super(jwtExceptionCode.getMessage() + " " + message);
        this.jwtKeyExceptionCode = jwtExceptionCode;
    }
}
