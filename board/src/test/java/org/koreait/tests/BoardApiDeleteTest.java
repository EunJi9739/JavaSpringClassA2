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

@SpringBootTest
@TestPropertySource(locations = "application-test.properties")
@AutoConfigureMockMvc
public class BoardApiDeleteTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private BoardSaveService saveService;

    private void getParams(){
        for(int i = 1; i <= 10; i++){
            BoardForm item = new BoardForm();
            item.setId((long)i);
            item.setSubject("제목"+i);
            item.setContent("내용"+i);
            saveService.save(item);
        }
    }

    @Test
    @DisplayName("게시글 삭제 성공시 응답코드 200 발생")
    void deleteSuccessTest() throws Exception {
        getParams();

        String body = mockMvc.perform(get("/api/board/delete/1")
                .contentType("application/json"))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));

        System.out.println(body);
    }

    @Test
    @DisplayName("게시글 삭제 실패 시 Bad_Request 발생")
    void deleteFailTest() throws Exception {
        String body = mockMvc.perform(get("/api/board/delete/999")
                        .contentType("application/json"))
                .andReturn()
                .getResponse()
                .getContentAsString(Charset.forName("UTF-8"));
        assertTrue(body.contains("삭제에 실패"));
    }

}
