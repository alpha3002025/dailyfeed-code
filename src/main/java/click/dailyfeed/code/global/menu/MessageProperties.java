package click.dailyfeed.code.global.menu;

import lombok.Getter;

// 임시 TODO: 추후 다국어 지원시 yaml 기반으로 Property 로딩하도록 지정 예정
public class MessageProperties {
    @Getter
    public static class KO {
        public static final String DELETED_USER = "탈퇴한 사용자";
        public static final String DELETED_HANDLE = "deleted";
        public static final String AVATAR_URL = null;
    }
}
