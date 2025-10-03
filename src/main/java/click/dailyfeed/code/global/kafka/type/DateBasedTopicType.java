package click.dailyfeed.code.global.kafka.type;

import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public enum DateBasedTopicType {
    MEMBER_ACTIVITY("member-activity-"),
    POST_ACTIVITY("post-activity-"),
    POST_LIKE_ACTIVITY("post-like-activity-"),
    COMMENT_ACTIVITY("like-activity-"),
    COMMENT_LIKE_ACTIVITY("comment-like-activity-");

    private final String topicPrefix;

    public static final String MEMBER_ACTIVITY_PATTERN = "member-activity-.*";
    public static final String POST_ACTIVITY_PATTERN = "post-activity-.*";
    public static final String POST_LIKE_ACTIVITY_PATTERN = "post-like-activity-.*";
    public static final String COMMENT_ACTIVITY_PATTERN = "comment-activity-.*";
    public static final String COMMENT_LIKE_ACTIVITY_PATTERN = "comment-like-activity-.*";

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
