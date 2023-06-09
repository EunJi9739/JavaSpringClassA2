package org.koreait.entities;

import jakarta.persistence.*; //*로 변경
import lombok.*;
import org.koreait.commons.constants.MemberType;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @Builder
@AllArgsConstructor @NoArgsConstructor
//@EqualsAndHashCode(callSuper = true) //오류
public class Member extends BaseEntity{
    @Id @GeneratedValue
    private Long userNo; //회원번호

    @Column(length = 40, nullable = false,unique = true)
    private String userId; //아이디

    @Column(length = 65, nullable = false)
    private String userPw; //비밀번호

    @Column(length = 40, nullable = false)
    private String userNm; //회원명

    @Column(length = 100)
    private String email; //이메일

    @Column(length = 11)
    private String mobile; //휴대전화번호

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    //@Builder.Default//오류
    private MemberType type=MemberType.USER; //USER - 사용자, ADMIN - 관리자

    @OneToMany(mappedBy = "member")
    //@Builder.Default//오류
    private List<BoardData> boardDatas = new ArrayList<>();
}
