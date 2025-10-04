package click.dailyfeed.code.global.kafka.type;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public enum DateBasedTopicType {
    MEMBER_ACTIVITY("member-activity-");

    private final String topicPrefix;

    public static final String MEMBER_ACTIVITY_PATTERN = "member-activity-.*";

    DateBasedTopicType(String topicPrefix) {
        this.topicPrefix = topicPrefix;
    }

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public String generateTopicName(LocalDateTime now){
        String currentDateStr = now.format(DATE_FORMATTER);
        return topicPrefix + currentDateStr;
    }

    public String extractDateFromTopicName(String topicName) {
        String prefix = topicPrefix;
        if (topicName.startsWith(prefix)) {
            return topicName.substring(prefix.length());
        }
        return null;
    }

    public String getTopicPattern(){
        return topicPrefix + ".*";
    }
}
