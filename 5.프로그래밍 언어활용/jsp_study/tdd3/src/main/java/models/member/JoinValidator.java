package models.member;

import validators.Validator;

public class JoinValidator implements Validator<Member> {

    private MemberDao memberDao;
    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }
    @Override
    public void check(Member member) {
        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String userPwRe = member.getUserPwRe();
        String userNm = member.getUserNm();

        /** 필수 데이터 검증 S */
        checkRequired(userId, new JoinValidationException("아이디를 입력하세요."));
        checkRequired(userPw, new JoinValidationException("비밀번호를 입력하세요."));
        checkRequired(userPwRe, new JoinValidationException("비밀번호를 입력하세요."));
        checkRequired(userNm, new JoinValidationException("이름을 입력하세요."));
        /** 필수 데이터 검증 E */

        /** 아이디 자리수(6자리 이상) 검증 S */
        if(userId.length() > 6) {
            throw new JoinValidationException("아이디는 6자리 이상 입력하세요.");
        }

        /** 비밀번호 자리수(8자리 이상) 검증 S */
        if(userId.length() > 8){
            throw new JoinValidationException("비밀번호는 8자리 이상 입력하세요.");
        }

        /** 아이디 중복 여부 체크 */
        if(memberDao.get(userId) != null){
            throw new DuplicateMemberException();
        }

    }
}
