package tests;

import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JoinTest {

    private Member member = new Member();

    @BeforeEach
    void init(){

    }

    @Test
    @DisplayName("회원가입 성공 여부")
    void joinSuccessTest(){
        JoinTest joinTest = new JoinTest();
        member.setUserId("user01");
        member.setUserPw("12345678");
        member.setUserPwRe("12345678");
        member.setUserNm("사용자01");
    }

    @Test
    @DisplayName("필수 값 존재 여부(userId, userPw, userPwRe, userNm")
    void joinValueExist(){

    }

    @Test
    @DisplayName("userId - 8~16자리, userPw - 10~16자리")
    void joinLength(){

    }




}
