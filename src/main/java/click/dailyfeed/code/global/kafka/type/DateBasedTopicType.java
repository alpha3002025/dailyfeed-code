package click.dailyfeed.code.global.kafka.type;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public enum DateBasedTopicType {
    POST_ACTIVITY("post-activity-"),
    POST_LIKE_ACTIVITY("post-like-activity-"),
    COMMENT_ACTIVITY("like-activity-"),
    COMMENT_LIKE_ACTIVITY("comment-like-activity-");

    private final String topicPrefix;

    DateBasedTopicType(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public String generateTopicName(LocalDateTime now){
        String currentDateStr = now.format(DATE_FORMATTER);
        return topicPrefix + currentDateStr;
    }
}
