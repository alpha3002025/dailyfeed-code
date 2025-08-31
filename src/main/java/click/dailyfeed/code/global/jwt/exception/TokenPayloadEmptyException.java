package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class TokenPayloadEmptyException extends JwtException {
    public TokenPayloadEmptyException() {
        super(JwtExceptionCode.TOKEN_PAYLOAD_EMPTY);
    }

    public TokenPayloadEmptyException(Throwable cause) {
        super(JwtExceptionCode.TOKEN_PAYLOAD_EMPTY, cause);
    }
}
