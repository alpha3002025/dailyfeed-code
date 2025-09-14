package click.dailyfeed.code.domain.member.member.validator;

public class MemberProfileValidation {
    public static final class HandleValidation {
        public static final String PATTERN = "^[a-zA-Z0-9_]{3,50}$";
        public static final int MIN_LENGTH = 3;
        public static final int MAX_LENGTH = 50;

        private HandleValidation() {}
    }
}
