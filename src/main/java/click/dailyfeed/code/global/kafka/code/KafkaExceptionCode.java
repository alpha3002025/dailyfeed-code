package click.dailyfeed.code.global.kafka.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KafkaExceptionCode {
    KAFKA_NETWORK_ERROR("잠시 후에 다시 시도해주세요", "KAFKA_NETWORK_ERROR", 500),
    KAFKA_KEY_CREATION_ERROR("잠시 후에 다시 시도해주세요", "KAFKA_KEY_CREATION_ERROR", 500);

    private final String message;
    private final String reason;
    private final Integer code;
}
