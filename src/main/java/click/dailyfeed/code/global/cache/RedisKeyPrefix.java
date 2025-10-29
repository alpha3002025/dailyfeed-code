package click.dailyfeed.code.global.cache;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.EnumSet;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RedisKeyPrefix {
    // member
    MEMBER_AUTHENTICATION_BLACKLIST("member:authentication:blacklist:"),
    MEMBER_AUTHENTICATION_REVOKED_REFRESH("member:authentication:revoked_refresh:"),

    // member_activity
    MEMBER_ACTIVITY_KAFKA_EVENT("member_activity:kafka_event:"),
    MEMBER_ACTIVITY_KAFKA_LISTENER("member_activity:kafka_listener:"),
    MEMBER_ACTIVITY_KAFKA_KEY("member_activity:kafka_key:"),
    MEMBER_ACTIVITY_KAFKA_DLQ("member_activity:kafka_dlq:"),

    // timeline/posts
    TIMELINE_API_POSTS_FOLLOWINGS_RECENT_POSTS("timeline:api:posts:followings_recent_posts:"),
    TIMELINE_API_POSTS_MOST_COMMENTED("timeline:api:posts:most_commented:"),
    TIMELINE_API_POSTS_MY_POSTS("timeline:api:posts:my_posts:"),
    TIMELINE_API_POSTS_POST_ITEM("timeline:api:posts:post_item:"),
    TIMELINE_API_POSTS_POPULAR_POSTS("timeline:api:posts:popular_posts:"),
    TIMELINE_API_POSTS_RECENT_ACTIVITIES("timeline:api:posts:recent_activities:"),

    // timeline/comments
    TIMELINE_API_COMMENTS_MY_COMMENTS("timeline:api:comments:my_comments:"),
    TIMELINE_API_COMMENTS_COMMENTS_WITH_COUNT("timeline:api:comments:my_comments:"),
    TIMELINE_API_COMMENTS_COMMENTS_BY_USER("timeline:api:comments:comments_by_user:"),
    TIMELINE_API_COMMENTS_COMMENT_ITEM("timeline:api:comments:comment_item:");

    private final String keyPrefix;

    public static final EnumSet<RedisKeyPrefix> TIMELINE_API_PREFIXES = EnumSet.of(
            TIMELINE_API_POSTS_FOLLOWINGS_RECENT_POSTS,
            TIMELINE_API_POSTS_MOST_COMMENTED,
            TIMELINE_API_POSTS_MY_POSTS,
            TIMELINE_API_POSTS_POST_ITEM,
            TIMELINE_API_POSTS_POPULAR_POSTS,
            TIMELINE_API_POSTS_RECENT_ACTIVITIES
    );

    public static List<String> getTimelineApiNamespaces(){
        return TIMELINE_API_PREFIXES.stream().map(RedisKeyPrefix::getKeyPrefix).toList();
    }
}
