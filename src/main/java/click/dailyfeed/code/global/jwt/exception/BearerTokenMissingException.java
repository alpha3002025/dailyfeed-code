package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class BearerTokenMissingException extends JwtException {
    public BearerTokenMissingException() {
        super(JwtExceptionCode.BEARER_TOKEN_MISSING);
    }

    public BearerTokenMissingException(String headerInfo) {
        super(JwtExceptionCode.BEARER_TOKEN_MISSING, "Header: " + headerInfo);
    }
}
