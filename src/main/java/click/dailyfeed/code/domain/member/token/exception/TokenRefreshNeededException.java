package click.dailyfeed.code.domain.member.token.exception;

import click.dailyfeed.code.domain.member.token.code.TokenExceptionCode;
import lombok.Getter;

import java.util.function.Supplier;

@Getter
public class TokenRefreshNeededException extends TokenException {
    private final TokenExceptionCode tokenExceptionCode;

    public TokenRefreshNeededException() {
        super(TokenExceptionCode.TOKEN_REFRESH_NEEDED);
        this.tokenExceptionCode = TokenExceptionCode.TOKEN_REFRESH_NEEDED;
    }

    public TokenRefreshNeededException(Supplier<String> messageSupplier) {
        super(TokenExceptionCode.TOKEN_REFRESH_NEEDED, messageSupplier);
        this.tokenExceptionCode = TokenExceptionCode.TOKEN_REFRESH_NEEDED;
    }
}
