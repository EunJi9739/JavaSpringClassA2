package models.member;

import validators.Validator;

public class JoinService {

    private Validator validator;
    private MemberDao memberDao;
    public JoinService(MemberDao memberDao,Validator validator){
        this.memberDao = memberDao;
        this.validator = validator;
    }
    public void join(Member member) {
        validator.check(member);
        //회원 가입 처리
        memberDao.insert(member);

    }
}
