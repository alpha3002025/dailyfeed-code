package click.dailyfeed.code.global.system.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PublishType {
    KAFKA("KAFKA"),
    FEIGN("FEIGN");

    private final String code;
}
