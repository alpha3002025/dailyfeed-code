package click.dailyfeed.code.global.web.response;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DailyfeedServerResponse<T> {
    private String statusCode;
    private String ok;
    private String reason;
    private T data;
}
