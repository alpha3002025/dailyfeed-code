package click.dailyfeed.code.domain.member.member.dto;

import click.dailyfeed.code.domain.member.member.type.MemberActivityType;
import lombok.*;

import java.util.Date;
import java.util.List;

public class MemberDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class JwtDto {
        private Long id;
        private String email;
        //        private String username;
        private String password;
        private Date expiration;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Member {
        private Long id;
        private String name;
        private String email;
    }

    // TODO : 결정을 아직 못했다. 그래서 일단은 MemberProfile 이라는 이름으로 정해두었다.
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MemberProfile {
        private Long id;
        private String name;
        private String email;
        private Integer followerCount;
        private Integer followingCount;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MembersBulkRequest {
        private List<Long> ids;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MemberActivity{
        private Long id;
        private MemberActivityType activityType;
    }

}
