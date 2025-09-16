package click.dailyfeed.code.domain.member.member.type.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CountryCode {
    KR("KR", "South Korea"),
    US("US", "United States"),
    JP("JP", "Japan"),
    CN("CN", "China"),
    GB("GB", "United Kingdom"),
    DE("DE", "Germany"),
    FR("FR", "France"),
    CA("CA", "Canada"),
    AU("AU", "Australia"),
    IN("IN", "India");

    private final String code;
    private final String displayName;

    @JsonValue
    public String getJsonValue(){
        return code;
    }

    @JsonCreator
    public static CountryCode fromCode(String code) {
        if (code == null) {
            return null;
        }

        for (CountryCode countryCode : values()) {
            if (countryCode.code.equals(code) || countryCode.name().equals(code)) {
                return countryCode;
            }
        }
        throw new IllegalArgumentException("Invalid country code: " + code);
    }

    public boolean isAsianCountry() {
        return this == KR || this == JP || this == CN;
    }

    public String getTimezoneDefault() {
        return switch (this) {
            case KR -> "Asia/Seoul";
            case US -> "America/New_York";
            case JP -> "Asia/Tokyo";
            default -> "UTC";
        };
    }
}
