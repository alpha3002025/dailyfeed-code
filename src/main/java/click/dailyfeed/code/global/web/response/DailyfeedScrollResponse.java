package click.dailyfeed.code.global.web.response;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedScrollResponse<T> {
    private DailyfeedScrollPage<T> content;
    private String statusCode;
    private String ok;
    private String reason;
}
