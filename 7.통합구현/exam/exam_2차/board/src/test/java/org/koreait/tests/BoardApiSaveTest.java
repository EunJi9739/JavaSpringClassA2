package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
public class BoardApiSaveTest {

    @Autowired
    private MockMvc mockMvc;

    private String getParams(String sub, String con){
        String params = String.format("{\"subject\" : \"%s\", \"content\" : \"%s\"}", sub, con );

        return params;
    }

    @Test
    @DisplayName("게시글 저장 성공 -> 응답코드 201")
    void saveSuccessTest() throws Exception {
        String param = getParams("제목", "내용");

        mockMvc.perform(post("/api/board/write")
                        .contentType("application/json")
                        .content(param))
                .andExpect(status().isCreated());

    }

    @Test
    @DisplayName("게시글 필수항목(제목) 여부 확인")
    void requiredSubjectTest() throws Exception {
        String param = getParams("","내용");

        String body = mockMvc.perform(post("/api/board/write")
                .contentType("application/json")
                .content(param))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        assertTrue(body.contains("제목을 입력"));

    }

    @Test
    @DisplayName("게시글 필수항목(내용) 여부 확인")
    void requiredContentTest() throws Exception {
        String param = getParams("제목","");

        String body = mockMvc.perform(post("/api/board/write")
                        .contentType("application/json")
                .content(param))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        assertTrue(body.contains("내용을 입력"));
    }


}
