package click.dailyfeed.code.global.web.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseSuccessCode {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private final String code;
}
