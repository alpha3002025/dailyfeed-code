package click.dailyfeed.code.global.web.response;

import click.dailyfeed.code.global.web.code.ResponseSuccessCode;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedScrollResponse<T> {
    private T data;
    private Integer status;
    private ResponseSuccessCode result;
}
