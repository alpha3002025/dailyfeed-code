package click.dailyfeed.code.global.kafka.exception;

import click.dailyfeed.code.global.kafka.code.KafkaExceptionCode;
import lombok.Getter;

@Getter
public class KafkaNetworkErrorException extends KafkaException {
    public KafkaNetworkErrorException() {
        super(KafkaExceptionCode.KAFKA_NETWORK_ERROR);
    }
}
