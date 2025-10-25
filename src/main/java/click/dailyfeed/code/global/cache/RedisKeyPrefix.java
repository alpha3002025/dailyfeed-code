package click.dailyfeed.code.global.cache;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RedisKeyPrefix {
    MEMBER_AUTHENTICATION_BLACKLIST("member:authentication:blacklist:"),
    MEMBER_AUTHENTICATION_REVOKED_REFRESH("member:authentication:revoked_refresh:"),
    MEMBER_ACTIVITY_KAFKA_EVENT("member_activity:kafka_event:"),
    MEMBER_ACTIVITY_KAFKA_LISTENER("member_activity:kafka_listener:"),
    MEMBER_ACTIVITY_KAFKA_KEY("member_activity:kafka_key:"),
    MEMBER_ACTIVITY_KAFKA_DLQ("member_activity:kafka_dlq:");
    private final String keyPrefix;
}
