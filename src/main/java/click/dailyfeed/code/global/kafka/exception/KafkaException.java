package click.dailyfeed.code.global.kafka.exception;

import click.dailyfeed.code.global.kafka.code.KafkaExceptionCode;
import lombok.Getter;

@Getter
public class KafkaException extends RuntimeException {
    private final KafkaExceptionCode kafkaExceptionCode;

    public KafkaException(KafkaExceptionCode kafkaExceptionCode) {
        super(kafkaExceptionCode.getMessage());
        this.kafkaExceptionCode = kafkaExceptionCode;
    }
}
