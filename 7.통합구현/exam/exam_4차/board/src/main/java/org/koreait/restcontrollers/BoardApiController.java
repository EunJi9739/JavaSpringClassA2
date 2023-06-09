package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardDeleteService;
import org.koreait.models.board.BoardInfoService;
import org.koreait.models.board.BoardListService;
import org.koreait.models.board.BoardSaveService;
import org.springframework.web.bind.annotation.*;

@RestController
@Log
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardApiController {

    private final BoardDeleteService deleteService;
    private final BoardInfoService infoService;
    private final BoardListService listService;
    private final BoardSaveService saveService;

    @PostMapping("/write")
    public void write(@RequestBody BoardForm boardForm){
        saveService.save(boardForm);
    }

    @GetMapping("/list")
    public void list(){

    }

    @GetMapping("/get/{id}")
    public void get(){

    }

    @PostMapping("/update/{id}")
    public void update(){

    }

    @GetMapping("/delete/{id}")
    public void delete(){

    }
}
