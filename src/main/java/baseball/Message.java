package baseball;

public class Message {
    public static final String START = "숫자 야구 게임을 시작합니다.";
    public static final String TYPE_EXCEPTION = "숫자를 입력해주세요.";
    public static final String DIGIT_LENGTH_EXCEPTION = Config.DIGIT_SIZE + "자리 수를 입력해주세요.";
    public static final String STATE_LENGTH_EXCEPTION = Config.STATE_SIZE + "자리 수를 입력해주세요.";
    public static final String DUPLICATION_EXCEPTION = "서로 다른 수를 입력해주세요.";
    public static final String DIGIT_RANGE_EXCEPTION = Config.DIGIT_MIN + "부터 " + Config.DIGIT_MAX + "까지의 수를 입력해주세요.";
    public static final String STATE_NUMBER_EXCEPTION = Config.STATE_RESTART + " 또는 " + Config.STATE_SHUTDOWN + "를 입력해주세요.";
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";
    public static final String NOTHING = "낫싱";
    public static final String BLANK = " ";
}
