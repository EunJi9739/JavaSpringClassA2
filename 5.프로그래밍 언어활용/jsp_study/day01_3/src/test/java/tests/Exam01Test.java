package tests;

import models.member.JoinService;
import models.member.JoinValidationException;
import models.member.Member;
import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD 연습 첫 시간")
public class Exam01Test {

    //자주 쓰이는건 미리 초기화(?)
    private Member member;
    private JoinService service;

    @BeforeAll
    static void allInit(){
        System.out.println("BeforeAll");
    }


    @BeforeEach
    void init(){ //각 단위 테스트 전에 처리할 부분
        member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");

        service = new JoinService();
        System.out.println("BeforeEach");

    }

    @Test
    @DisplayName("더하기 테스트")
    void test1(){ //테스트 케이스(단위 테스트)
        int result = 2 + 3;
        assertEquals(5,result);
    }

    @Test
    @DisplayName("TDD 연습1")
    @Disabled //테스트 안함
    void test2(){
        assertEquals(5,4); //미통과
        assertEquals(5,5); //통과
    }

    @Test
    @DisplayName("TDD 연습2")
    @Disabled //테스트 안함
    void test3(){
        assertAll(() -> assertEquals(5,4),
                () -> assertEquals(5,5),
                () -> assertEquals(10,5)
        );
    }

    @Test
    @DisplayName("회원가입 성공시 예외 없음")
    void test4(){
        //Member member = new Member();
        //JoinService service = new JoinService();
        assertDoesNotThrow(() -> { //예외가 발생하지 않으면 테스트 성공
            service.join(member);
        });


    }

    @Test
    @DisplayName("필수 항목 체크 - UserId 누락시 JoinValidationException 발생")
    void test5(){
        //Member member = new Member();
        //JoinService service = new JoinService();
        JoinValidationException thrown = assertThrows(JoinValidationException.class, () -> {
            member.setUserId("  ");
            service.join(member);
        });

        String message = thrown.getMessage();
        assertTrue(message.contains("아이디"));
    }

    @AfterEach
    void destroy(){
        System.out.println("AfterEach");

    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
}
