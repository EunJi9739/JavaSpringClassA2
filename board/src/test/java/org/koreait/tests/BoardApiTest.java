package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
public class BoardApiTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("게시글 작성 성공시 응답코드 201")
    void saveSuccessTest() throws Exception {
        String params = String.format("{\"subject\":\"%s\",\"content\":\"%s\"}","테스트 제목","테스트 내용");

        mockMvc.perform(post("/api/board/write")
                .contentType("application/json")
                .content(params))
                .andExpect(status().isCreated());
    }
}
