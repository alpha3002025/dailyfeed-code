package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class JwtExpiredException extends JwtException {
    public JwtExpiredException() {
        super(JwtExceptionCode.JWT_EXPIRED);
    }

    public JwtExpiredException(Throwable cause) {
        super(JwtExceptionCode.JWT_EXPIRED, cause);
    }
}
