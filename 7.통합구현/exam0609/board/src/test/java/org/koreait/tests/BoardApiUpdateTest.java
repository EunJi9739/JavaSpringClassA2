package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
public class BoardApiUpdateTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    public void getParams(){
        for(int i = 10; i <= 10 ; i++){
            BoardForm boardForm = new BoardForm();
            boardForm.setId((long)i);
            boardForm.setSubject("제목"+i);
            boardForm.setContent("내용"+i);

            saveService.save(boardForm);
        }
    }

    public String getParams(String sub, String con){
        String params = String.format("{\"subject\":\"%s\", \"content\":\"%s\"}",sub,con);
        return params;
    }

    @Test
    @DisplayName("게시글 수정 성공 -> 응답코드 201")
    void updateSuccessTest() throws Exception {
        getParams();

        String params = getParams("(수정)제목","(수정)내용");

        mockMvc.perform(post("/api/board/update/1")
                .contentType("application/json")
                .content(params))
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("게시글 수정시 필수항목(제목) 입력 여부 확인")
    void requiredSubjectCheck() throws Exception {
        getParams();

        String params = getParams("","(수정)내용");

        String body = mockMvc.perform(post("/api/board/update/1")
                .contentType("application/json")
                .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        assertTrue(body.contains("제목을 입력"));
    }

    @Test
    @DisplayName("게시글 수정시 필수항목(내용) 입력 여부 확인")
    void requiredContentCheck() throws Exception {
        getParams();

        String params = getParams("(수정)제목","");

        String body = mockMvc.perform(post("/api/board/update/1")
                        .contentType("application/json")
                        .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        assertTrue(body.contains("내용을 입력"));
    }

    @Test
    @DisplayName("게시글 수정시 존재하지 않는 게시글일 경우 -> Bad_Request")
    void updateFailTest() throws Exception {
        String params = getParams("(수정)제목","(수정)내용");

        String body = mockMvc.perform(post("/api/board/update/9999")
                .contentType("application/json")
                .content(params))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        assertTrue(body.contains("등록되지 않은"));
    }
}
