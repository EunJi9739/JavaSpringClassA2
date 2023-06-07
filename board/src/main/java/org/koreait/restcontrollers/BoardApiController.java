package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.models.board.BoardSaveService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/board")
@Log
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardSaveService saveService;

    @PostMapping("/write")
    public void write(@RequestBody BoardForm boardForm){
        //log.info(boardData.toString());
        saveService.save(boardForm);
    }
}
