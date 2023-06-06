package models.member;

public class JoinValidationException extends RuntimeException { //실행 예외로 선언
                                                                //느슨하게 정보만 제공하고 싶은 경우?
    public JoinValidationException(String message) {
        super(message);
    }
}
