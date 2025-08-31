package click.dailyfeed.code.domain.member.key.exception;

import click.dailyfeed.code.domain.member.key.code.JwtKeyExceptionCode;

public class PrimaryKeyMissingException extends JwtKeyException {

    public PrimaryKeyMissingException() {
        super(JwtKeyExceptionCode.PRIMARY_KEY_MISSING);
    }

    public PrimaryKeyMissingException(String message) {
        super(JwtKeyExceptionCode.PRIMARY_KEY_MISSING, message);
    }
}
