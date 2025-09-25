package click.dailyfeed.code.domain.member.member.dto;

import click.dailyfeed.code.domain.member.member.type.data.CountryCode;
import click.dailyfeed.code.domain.member.member.type.data.GenderType;
import click.dailyfeed.code.domain.member.member.type.data.PrivacyLevel;
import click.dailyfeed.code.domain.member.member.type.data.VerificationStatus;
import click.dailyfeed.code.domain.member.member.validator.MemberProfileValidation;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class MemberProfileDto {

    ///  dto
    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class MemberProfile{
        private Long id;
        private Long memberId;
        private String memberName;
        private String handle;
        private String displayName;
        private String bio;
        private String location;
        private String websiteUrl;
        private LocalDate birthDate;
        private GenderType gender;
        @Builder.Default
        private String timezone = "UTC";
        @Builder.Default
        private String languageCode = "en";
        private CountryCode countryCode;
        @Builder.Default
        private VerificationStatus verificationStatus = VerificationStatus.NONE;
        @Builder.Default
        private PrivacyLevel privacyLevel = PrivacyLevel.PUBLIC;
        @Builder.Default
        private Integer profileCompletionScore = 0;
        @Builder.Default
        private Boolean isActive = Boolean.TRUE;
        private String avatarUrl;
        private String coverUrl;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime createdAt;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime updatedAt;
        private Long followersCount;
        private Long followingsCount;
    }

    /**
     * 프로필 요약 정보 DTO (리스트 조회용)
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Summary {
        private Long memberId;
        private Long id;
        private String memberName;
        private String memberHandle;
        private String displayName;
        private VerificationStatus verificationStatus;
        private String avatarUrl;
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime updatedAt;

        public static Summary from(MemberProfile profile) {
            return Summary.builder()
                    .memberId(profile.getMemberId())
                    .id(profile.getId())
                    .memberName(profile.getMemberName())
                    .memberHandle(profile.getHandle())
                    .displayName(profile.getDisplayName())
                    .verificationStatus(profile.getVerificationStatus())
                    .updatedAt(profile.getUpdatedAt())
                    .build();
        }
    }

    ///  request
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreateRequest {
        @NotNull(message = "회원 ID는 필수입니다")
        private Long memberId;

        @NotBlank(message = "이름은 필수입니다")
        @Size(max = 100, message = "이름은 100자를 초과할 수 없습니다")
        private String name;

        @NotBlank(message = "핸들은 필수입니다")
        @Pattern(regexp = MemberProfileValidation.HandleValidation.PATTERN,
                message = "핸들은 영문, 숫자, 언더스코어만 사용 가능하며 3-50자여야 합니다")
        private String handle;

        @Size(max = 100, message = "표시명은 100자를 초과할 수 없습니다")
        private String displayName;

        @Size(max = 1000, message = "소개는 1000자를 초과할 수 없습니다")
        private String bio;

        @Size(max = 100, message = "위치는 100자를 초과할 수 없습니다")
        private String location;

        @URL(message = "올바른 웹사이트 URL을 입력해주세요")
        @Size(max = 500, message = "웹사이트 URL은 500자를 초과할 수 없습니다")
        private String websiteUrl;

        @Past(message = "생년월일은 과거 날짜여야 합니다")
        private LocalDate birthDate;

        private GenderType gender;

        @Pattern(regexp = "^[a-zA-Z_/]+$", message = "올바른 시간대 형식이 아닙니다")
        private String timezone;

        @Size(max = 10, message = "언어 코드는 10자를 초과할 수 없습니다")
        private String languageCode;

        @Size(min = 2, max = 2, message = "국가 코드는 2자리여야 합니다")
        private String countryCode;

        private PrivacyLevel privacyLevel;
    }

    /**
     * 프로필 업데이트 요청 DTO
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateRequest {

        @Size(max = 100, message = "이름은 100자를 초과할 수 없습니다")
        private String name;

        @Size(max = 100, message = "표시명은 100자를 초과할 수 없습니다")
        private String displayName;

        @Size(max = 1000, message = "소개는 1000자를 초과할 수 없습니다")
        private String bio;

        @Size(max = 100, message = "위치는 100자를 초과할 수 없습니다")
        private String location;

        @URL(message = "올바른 웹사이트 URL을 입력해주세요")
        @Size(max = 500, message = "웹사이트 URL은 500자를 초과할 수 없습니다")
        private String websiteUrl;

        @Past(message = "생년월일은 과거 날짜여야 합니다")
        private LocalDate birthDate;

        private GenderType gender;

        @Pattern(regexp = "^[a-zA-Z_/]+$", message = "올바른 시간대 형식이 아닙니다")
        private String timezone;

        @Size(max = 10, message = "언어 코드는 10자를 초과할 수 없습니다")
        private String languageCode;

        @Size(min = 2, max = 2, message = "국가 코드는 2자리여야 합니다")
        private String countryCode;

        private PrivacyLevel privacyLevel;
    }

    /**
     * Handle 변경 요청 DTO
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HandleChangeRequest {

        @NotBlank(message = "새 핸들은 필수입니다")
//        @Pattern(regexp = "^[a-zA-Z0-9_]{3,50}$",
        @Pattern(regexp = MemberProfileValidation.HandleValidation.PATTERN,
                message = "핸들은 영문, 숫자, 언더스코어만 사용 가능하며 3-50자여야 합니다")
        private String newHandle;

        private String reason; // 변경 사유
    }

    ///  response
    /**
     * 프로필 응답 DTO
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Long profileId;
        private Long memberId;
        private String name;
        private String handle;
        private String displayName;
        private String bio;
        private String location;
        private String websiteUrl;
        private LocalDate birthDate;
        private GenderType gender;
        private String timezone;
        private String languageCode;
        private CountryCode countryCode;
        private VerificationStatus verificationStatus;
        private PrivacyLevel privacyLevel;
        private Integer profileCompletionScore;
        private Boolean isActive;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        // 이미지 정보 (맵 형태로 사이즈별 URL 제공)
        private Map<String, String> avatarUrls;  // {"small": "url", "medium": "url", ...}
        private Map<String, String> coverUrls;

        // 메인 이미지 URL들
        private String primaryAvatarUrl;
        private String primaryCoverUrl;

        /**
         * Entity를 DTO로 변환하는 정적 메서드
         */
        public static Response from(MemberProfile profile) {
            return Response.builder()
                    .profileId(profile.getId())
                    .memberId(profile.getMemberId())
                    .name(profile.getMemberName())
                    .handle(profile.getHandle())
                    .displayName(profile.getDisplayName())
                    .bio(profile.getBio())
                    .location(profile.getLocation())
                    .websiteUrl(profile.getWebsiteUrl())
                    .birthDate(profile.getBirthDate())
                    .gender(profile.getGender())
                    .timezone(profile.getTimezone())
                    .languageCode(profile.getLanguageCode())
                    .countryCode(profile.getCountryCode())
                    .verificationStatus(profile.getVerificationStatus())
                    .privacyLevel(profile.getPrivacyLevel())
                    .profileCompletionScore(profile.getProfileCompletionScore())
                    .isActive(profile.getIsActive())
                    .createdAt(profile.getCreatedAt())
                    .updatedAt(profile.getUpdatedAt())
                    .build();
        }
    }
}
