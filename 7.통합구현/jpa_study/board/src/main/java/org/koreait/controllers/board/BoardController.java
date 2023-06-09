package org.koreait.controllers.board;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.BoardData;
import org.koreait.models.board.BoardListService;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardDataRepository boardDataRepository;
    private final MemberRepository memberRepository;
    private final BoardListService listService;

    @GetMapping
    @ResponseBody
    public void index(){

        //1
         //insertData();

        //2
         //BoardData boardData = boardDataRepository.findById(1L).orElse(null);

        //3
        //Member member = memberRepository.findById(1L).orElse(null);
        //List<BoardData> items =member.getBoardDatas();
        //items.stream().forEach(System.out::println);

        //4
        //BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        //Member member =boardData.getMember();
        //String userId = member.getUserId();

        //5
        //List<BoardData> items = boardDataRepository.getBoardDatas();
        //BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        //Member member =boardData.getMember();
        //String userId = member.getUserId();

        //6
        //List<BoardData> items = listService.gets();
        //items.stream().forEach(System.out::println);

        //7
        //insertData();

        //8
        BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        boardData.setSubject("(수정)제목1");
        boardDataRepository.flush();

    }

    private void insertData(){
        /*
        Member member = Member.builder()
                .userId("user01")
                .userNm("사용자01")
                .userPw("123456")
                .email("user01@test.org")
                .mobile("01000000000")
                .build();

        member=memberRepository.saveAndFlush(member);


         */
        List<BoardData> items = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            BoardData item = BoardData.builder()
                    .subject("제목"+i)
                    .content("내용"+i)
                    .poster("작성자"+i)
                   //.member(member)
                    .build();
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);
    }
}
