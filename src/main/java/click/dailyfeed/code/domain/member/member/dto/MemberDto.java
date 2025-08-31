package click.dailyfeed.code.domain.member.member.dto;

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

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MembersBulkRequest {
        private List<Long> ids;
    }

}
