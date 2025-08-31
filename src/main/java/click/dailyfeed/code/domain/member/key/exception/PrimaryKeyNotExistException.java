package click.dailyfeed.code.domain.member.key.exception;

import click.dailyfeed.code.domain.member.key.code.JwtKeyExceptionCode;

public class PrimaryKeyNotExistException extends JwtKeyException {

    public PrimaryKeyNotExistException() {
        super(JwtKeyExceptionCode.PRIMARY_KEY_NOT_EXIST);
    }

    public PrimaryKeyNotExistException(String message) {
        super(JwtKeyExceptionCode.PRIMARY_KEY_NOT_EXIST, message);
    }
}
