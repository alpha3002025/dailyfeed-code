package click.dailyfeed.code.global.web.response;

import click.dailyfeed.code.global.web.code.ResponseSuccessCode;
import click.dailyfeed.code.global.web.page.DailyfeedPage;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedPageResponse<T> {
    private DailyfeedPage<T> data;
    private Integer status;
    private ResponseSuccessCode result;
}
