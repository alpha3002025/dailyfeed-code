package click.dailyfeed.code.global.web.response;

import click.dailyfeed.code.global.web.page.DailyfeedPage;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedPageResponse<T> {
    private DailyfeedPage<T> content;
    private String statusCode;
    private String ok;
    private String reason;
}
