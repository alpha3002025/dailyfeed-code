package click.dailyfeed.code.global.jwt.exception;

import click.dailyfeed.code.global.jwt.code.JwtExceptionCode;

public class TokenMissingClaimsException extends JwtException {
    public TokenMissingClaimsException() {
        super(JwtExceptionCode.TOKEN_MISSING_CLAIMS);
    }

    public TokenMissingClaimsException(String missingClaim) {
        super(JwtExceptionCode.TOKEN_MISSING_CLAIMS, "Missing claim: " + missingClaim);
    }

    public TokenMissingClaimsException(Throwable cause) {
        super(JwtExceptionCode.TOKEN_MISSING_CLAIMS, cause);
    }
}
