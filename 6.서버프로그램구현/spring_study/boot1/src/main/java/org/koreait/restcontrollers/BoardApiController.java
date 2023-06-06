package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {
    private final BoardListService listService;

    @GetMapping("/list")
    public List<Board> list(){
        List<Board> items = listService.gets();
        return items;
    }
}
