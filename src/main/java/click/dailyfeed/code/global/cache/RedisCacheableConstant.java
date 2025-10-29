package click.dailyfeed.code.global.cache;

// Cacheable 용도의 상수
public class RedisCacheableConstant {
    // RedisKeyPrefix enum values for annotation usage
    public static class MemberPrefix {
        // member/item
        public static final String API_GET_MEMBER_BY_ID = "member:api:members:item:";
        public static final String API_GET_MEMBER_PROFILE_BY_ID = "member:api:memberProfiles:item:";
        public static final String API_GET_MEMBER_PROFILE_SUMMARY_BY_ID = "member:api:memberProfileSummaries:item:";
        // member/handle/exists
        public static final String API_GET_MEMBER_HANDLE_EXISTS = "member:api:handle:exists:";
        // query
        public static final String API_INTERNAL_LIST_MEMBERS_BY_IDS_IN = "member:internal:memberProfileSummaries:list";
    }

    public static class FollowPrefix {
        // query
        public static final String API_INTERNAL_LIST_FOLLOWING_MEMBERS_BY_MEMBER_ID = "member:internal:follows:following-members:list";
    }
}
