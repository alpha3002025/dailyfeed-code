package click.dailyfeed.code.global.web.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WebExceptionCode {
    TOO_MANY_REQUEST("TOO_MANY_REQUEST", 429);
    private String exceptionCode;
    private int statusCode;
}
