package click.dailyfeed.code.domain.member.member.validator;

public class MemberProfileValidation {
    public static final class HandleValidation {
//        public static final String PATTERN = "^[a-zA-Z0-9_]+$";
        public static final String PATTERN = "^[a-zA-Z0-9_]{3,50}$";
        public static final int MIN_LENGTH = 3;
        public static final int MAX_LENGTH = 50;

        private HandleValidation() {}
    }

    public static final class EmailValidation {
        public static final String PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
    }

    public static final class PasswordValidation {
//        public static final String PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]";
        public static final String PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]+$";
        public static final int MIN_LENGTH = 8;
        public static final int MAX_LENGTH = 50;
    }
}
