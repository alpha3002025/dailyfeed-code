package click.dailyfeed.code.global.web.response;

import click.dailyfeed.code.global.web.code.ResponseSuccessCode;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedServerResponse<T> {
    private Integer status;
    private ResponseSuccessCode result;
    private T data;
}
