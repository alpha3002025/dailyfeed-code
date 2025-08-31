package click.dailyfeed.code.global.web.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DailyfeedErrorResponse {
    private String message;
    private String reason;
    private Integer code;
    private String timestamp;
    private String path;

    public static DailyfeedErrorResponse of(String message, String reason, Integer code, String path) {
        return new DailyfeedErrorResponse(
                message,
                reason,
                code,
                java.time.LocalDateTime.now().toString(),
                path
        );
    }
}
