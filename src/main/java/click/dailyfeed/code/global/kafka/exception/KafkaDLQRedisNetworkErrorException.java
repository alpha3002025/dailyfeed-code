package click.dailyfeed.code.global.kafka.exception;

import click.dailyfeed.code.global.kafka.code.KafkaExceptionCode;
import lombok.Getter;

@Getter
public class KafkaDLQRedisNetworkErrorException extends KafkaException {
    private final String redisKey;
    private final String payload;

    public KafkaDLQRedisNetworkErrorException(String key, String payload) {
        super(KafkaExceptionCode.KAFKA_DLQ_REDIS_NETWORK_ERROR);
        this.redisKey = key;
        this.payload = payload;
    }
}
