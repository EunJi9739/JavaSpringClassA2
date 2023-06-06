package tests;

import models.member.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import validators.Validator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 테스트")
public class JoinTest {

    private JoinService joinService;

    @BeforeEach
    void init(){

        joinService = new ServiceManager().getJoinService();
    }
    private Member getMember(){
        Member member = new Member();
        member.setUserId("user01");
        member.setUserNm("사용자01");
        member.setUserPw("123456789");
        member.setUserPwRe(member.getUserPw());
        return member;
    }

    @Test
    @DisplayName("회원가입 성공시 예외 발생 없음")
    void joinSuccessTest(){
        Member member = getMember();
        member.setUserId("user99");
        assertDoesNotThrow(() -> {
           joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 항목(userId, userPw, userPwRe, userNm) 검증 - 실패시 JoinValidationException 발생")
    void requiredFieldsTest(){
        assertAll(
                //userId가 null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId(null);
                    joinService.join(member);
                }),
                //userId가 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId("    ");
                    joinService.join(member);
                }),
                //userPw가 null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw(null);
                    joinService.join(member);
                }),
                //userPw가 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPw("    ");
                    joinService.join(member);
                }),
                //userPwRe가 null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPwRe(null);
                    joinService.join(member);
                }),
                //userPwRe가 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserPwRe("    ");
                    joinService.join(member);
                }),
                //userNm가 null
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId(null);
                    joinService.join(member);
                }),
                //userNm가 공백
                () -> assertThrows(JoinValidationException.class, () -> {
                    Member member = getMember();
                    member.setUserId("    ");
                    joinService.join(member);
                })
        );
    }

    @Test
    @DisplayName("아이디가 6자리 이상, 검증 실패 - JoinValidationException, 문구 - 아이디는 6자리 이상 입력하세요.")
    void userIdLengthCheckTest(){
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
           Member member = getMember();
           member.setUserId("user"); //검증에 실패할 수 있는 데이터 넣어주기
            joinService.join(member);
        });

        String mesasge = thrown.getMessage();
        assertTrue(mesasge.contains("아이디는 6자리"));

    }

    @Test
    @DisplayName("비밀번호가 8자리 이상, 검증 실패 - JoinValidationException, 문구 - 비밀번호는 8자리 이상 입력하세요.")
    void userPwLengthCheckTest(){
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
           Member member = getMember();
           member.setUserPw("1234");
           joinService.join(member);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("비밀번호는 8자리"));

    }

    @Test
    @DisplayName("아이디 중복이 되면 DuplicateMemberException")
    void duplicateUserIdTest(){
        assertThrows(DuplicateMemberException.class, () -> {
            Member member = getMember();
            joinService.join(member);
            joinService.join(member); //가입 두번
        });
    }
}
