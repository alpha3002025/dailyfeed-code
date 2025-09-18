package click.dailyfeed.code.global.cache;

import java.util.List;

public class RedisKeyConstant {
    public static class PostService {
        public static final String INTERNAL_LIST_GET_POST_LIST_BY_IDS_IN = "content-svc:post-service:internal:list:getPostListByIdsIn";
        public static final String WEB_GET_POST_BY_ID = "content-svc:post-service:info:getPostById";
        public static final String WEB_GET_POSTS_BY_AUTHOR = "content-svc:post-service:page:getPostsByAuthor";
        public static final String WEB_GET_POSTS_ORDER_BY_COMMENT_COUNT = "content-svc:post-service:statistics:getPostsOrderByCommentCount";
        public static final String WEB_STATISTICS_GET_POPULAR_POSTS = "content-svc:post-service:statistics:getPopularPosts";
        public static final String WEB_STATISTICS_GET_POSTS_BY_RECENT_ACTIVITY = "content-svc:post-service:statistics:getPostsByRecentActivity";
        public static final String WEB_SEARCH_SEARCH_POSTS = "content-svc:post-service:search:searchPosts";
        public static final String WEB_SEARCH_GET_POSTS_BY_DATE_RANGE = "content-svc:post-service:search:getPostsByDateRange";

        public static final List<String> SEARCH_CHACHE_LIST = List.of(
                WEB_SEARCH_SEARCH_POSTS,
                WEB_SEARCH_GET_POSTS_BY_DATE_RANGE
        );

        public static final List<String> STATISTICS_CACHE_LIST = List.of(
                WEB_STATISTICS_GET_POPULAR_POSTS,
                WEB_STATISTICS_GET_POSTS_BY_RECENT_ACTIVITY
        );

        public static final List<String> GET_ITEM_BY_ID_CACHE_LIST = List.of(
                WEB_GET_POST_BY_ID
        );

        public static final List<String> GET_PAGE_CACHE_LIST = List.of(
                WEB_GET_POSTS_BY_AUTHOR,
                WEB_GET_POSTS_ORDER_BY_COMMENT_COUNT
        );
    }

    public static class TimelineService {
        public static final String WEB_GET_TIMELINE_ITEMS_DEFAULT = "timeline-svc:timeline-pull-service:followingsActivities";

        public static final List<String> SEARCH_CHACHE_LIST = List.of(
        );

        public static final List<String> STATISTICS_CACHE_LIST = List.of(
        );

        public static final List<String> GET_ITEM_BY_ID_CACHE_LIST = List.of(
        );

        public static final List<String> GET_PAGE_CACHE_LIST = List.of(
                WEB_GET_TIMELINE_ITEMS_DEFAULT
        );
    }

}
