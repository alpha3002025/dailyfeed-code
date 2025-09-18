package click.dailyfeed.code.global.web.response;

import click.dailyfeed.code.global.web.code.ResponseSuccessCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DailyfeedErrorResponse {
    private Integer statusCode;
    private ResponseSuccessCode resultCode;
    private String message;
    private String path;

    public static DailyfeedErrorResponse of(Integer statusCode, ResponseSuccessCode resultCode, String message, String path) {
        return new DailyfeedErrorResponse(statusCode, resultCode, message, path);
    }
}
