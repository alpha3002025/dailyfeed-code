package click.dailyfeed.code.global.kafka.exception;

import click.dailyfeed.code.global.kafka.code.KafkaExceptionCode;
import lombok.Getter;

@Getter
public class KafkaMessageKeyCreationException extends KafkaException {
    public KafkaMessageKeyCreationException() {
        super(KafkaExceptionCode.KAFKA_KEY_CREATION_ERROR);
    }
}
