package click.dailyfeed.code.global.cache;

import java.util.List;
import java.util.Set;

public class RedisKeyConstant {
    public static class MemberRedisService {
        /// get
        public static final String WEB_GET_MEMBER_BY_ID = "member-svc:member-redis-service:internal:get:getMemberOrThrow";
        public static final String WEB_GET_MEMBER_PROFILE_BY_ID = "member-svc:member-redis-service:internal:get:findMemberProfileById";
        public static final String WEB_GET_MEMBER_PROFILE_SUMMARY_BY_ID = "member-svc:member-redis-service:internal:get:findMemberSummaryById";
        public static final String INTERNAL_GET_MEMBER_PROFILE_BY_HANDLE_IS_EXISTS = "member-svc:member-redis-service:internal:get:isHandleExists";

        /// list
        public static final String INTERNAL_LIST_MEMBERS_BY_IDS_IN = "member-svc:member-redis-service:internal:list:findMembersByIdsIn";

        public static final Set<String> INTERNAL_QUERY_LIST_BY_IDS_IN_KEYS = Set.of(
                INTERNAL_LIST_MEMBERS_BY_IDS_IN
        );

        public static final Set<String> GET_ITEM_BY_ID_CACHE_KEYS = Set.of(
                WEB_GET_MEMBER_BY_ID, WEB_GET_MEMBER_PROFILE_BY_ID, WEB_GET_MEMBER_PROFILE_SUMMARY_BY_ID
        );
    }

    public static class FollowRedisService {
        /// get
        public static final String WEB_GET_FOLLOW_BY_MEMBER_ID = "member-svc:follow-redis-service:web:get:getMemberFollow";

        /// page
        public static final String WEB_PAGE_FOLLOWERS_MORE_BY_MEMBER_ID = "member-svc:follow-redis-service:web:page:getMemberFollowersMore";
        public static final String WEB_PAGE_FOLLOWINGS_MORE_BY_MEMBER_ID = "member-svc:follow-redis-service:web:page:getMemberFollowingsMore";

        /// list
        public static final String INTERNAL_LIST_FOLLOWING_MEMBERS_BY_MEMBER_ID = "member-svc:follow-redis-service:internal:list:getFollowingMembers";

        public static final Set<String> INTERNAL_QUERY_LIST_BY_IDS_IN_KEYS = Set.of(
                INTERNAL_LIST_FOLLOWING_MEMBERS_BY_MEMBER_ID
        );

        public static final Set<String> GET_ITEM_BY_ID_CACHE_KEYS = Set.of(
                WEB_GET_FOLLOW_BY_MEMBER_ID
        );

        public static final Set<String> GET_PAGE_CACHE_KEYS = Set.of(
                WEB_PAGE_FOLLOWERS_MORE_BY_MEMBER_ID,
                WEB_PAGE_FOLLOWINGS_MORE_BY_MEMBER_ID
        );
    }

    public static class PostService {
        /// list
        public static final String INTERNAL_LIST_GET_POST_LIST_BY_IDS_IN = "content-svc:post-service:internal:list:getPostListByIdsIn";
        /// get
        public static final String WEB_GET_POST_BY_ID = "content-svc:post-service:get:getPostById";
        /// page
        public static final String WEB_GET_POSTS_BY_AUTHOR = "content-svc:post-service:page:getPostsByAuthor";
        /// statistics
        public static final String WEB_GET_POSTS_ORDER_BY_COMMENT_COUNT = "content-svc:post-service:statistics:getPostsOrderByCommentCount";
        public static final String WEB_STATISTICS_GET_POPULAR_POSTS = "content-svc:post-service:statistics:getPopularPosts";
        public static final String WEB_STATISTICS_GET_POSTS_BY_RECENT_ACTIVITY = "content-svc:post-service:statistics:getPostsByRecentActivity";
        /// search
        public static final String WEB_SEARCH_SEARCH_POSTS = "content-svc:post-service:search:searchPosts";
        public static final String WEB_SEARCH_GET_POSTS_BY_DATE_RANGE = "content-svc:post-service:search:getPostsByDateRange";

        public static final Set<String> INTERNAL_QUERY_LIST_BY_IDS_IN_KEYS = Set.of(
                INTERNAL_LIST_GET_POST_LIST_BY_IDS_IN
        );

        public static final Set<String> SEARCH_KEYS = Set.of(
                WEB_SEARCH_SEARCH_POSTS,
                WEB_SEARCH_GET_POSTS_BY_DATE_RANGE
        );

        public static final Set<String> STATISTICS_KEYS = Set.of(
                WEB_STATISTICS_GET_POPULAR_POSTS,
                WEB_STATISTICS_GET_POSTS_BY_RECENT_ACTIVITY
        );

        public static final Set<String> GET_ITEM_BY_ID_KEYS = Set.of(
                WEB_GET_POST_BY_ID
        );

        public static final Set<String> GET_PAGE_KEYS = Set.of(
                WEB_GET_POSTS_BY_AUTHOR,
                WEB_GET_POSTS_ORDER_BY_COMMENT_COUNT
        );
    }

    public static class CommentService {
        /// list

        /// get
        public static final String WEB_GET_COMMENT_BY_ID = "content-svc:comment-service:web:get:getCommentById";
        /// page
        public static final String WEB_GET_COMMENTS_BY_MEMBER_ID = "content-svc:comment-service:web:page:getCommentsByMemberId"; // getMyComments, getCommentsByUser
        public static final String WEB_GET_COMMENTS_BY_POST_ID = "content-svc:comment-service:web:page:getCommentsByPostId"; // getMyComments, getCommentsByUser
        public static final String WEB_GET_COMMENTS_BY_PARENT_ID = "content-svc:comment-service:web:page:getCommentsByParentId"; // 대댓글

        public static final Set<String> SEARCH_KEYS = Set.of();

        public static final Set<String> STATISTICS_KEYS = Set.of();

        public static final Set<String> GET_ITEM_BY_ID_KEYS = Set.of(
                WEB_GET_COMMENT_BY_ID
        );

        public static final Set<String> GET_PAGE_KEYS = Set.of(
                WEB_GET_COMMENTS_BY_MEMBER_ID, WEB_GET_COMMENTS_BY_POST_ID, WEB_GET_COMMENTS_BY_PARENT_ID
        );
    }

    public static class TimelinePullService {
        // page (수정 예정) TODO
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
