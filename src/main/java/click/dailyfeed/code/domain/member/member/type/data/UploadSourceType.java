package click.dailyfeed.code.domain.member.member.type.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UploadSourceType {
    WEB("web"),
    MOBILE("mobile"),
    API("api"),
    SOCIAL_IMPORT("social_import");

    private String value;
}
