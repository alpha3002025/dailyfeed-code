package click.dailyfeed.code.global.cache;

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

        public static final Set<String> GET_ITEM_BY_ID_KEYS = Set.of(
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

        public static final Set<String> GET_ITEM_BY_ID_KEYS = Set.of(
                WEB_GET_FOLLOW_BY_MEMBER_ID
        );

        public static final Set<String> GET_PAGE_KEYS = Set.of(
                WEB_PAGE_FOLLOWERS_MORE_BY_MEMBER_ID,
                WEB_PAGE_FOLLOWINGS_MORE_BY_MEMBER_ID
        );
    }

}
