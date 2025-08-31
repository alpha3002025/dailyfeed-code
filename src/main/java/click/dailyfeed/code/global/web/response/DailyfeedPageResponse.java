package click.dailyfeed.code.global.web.response;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedPageResponse<T> {
    private DailyfeedPage<T> dailyfeedPage;
    private String statusCode;
    private String ok;
    private String reason;
}
