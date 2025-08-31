package click.dailyfeed.code.domain.member.key.exception;

import click.dailyfeed.code.domain.member.key.code.JwtKeyExceptionCode;

public class JwtKeyExpiredException extends JwtKeyException {
    public JwtKeyExpiredException() {
        super(JwtKeyExceptionCode.JWT_KEY_EXPIRED);
    }

    public JwtKeyExpiredException(String message) {
        super(JwtKeyExceptionCode.JWT_KEY_EXPIRED, message);
    }
}
