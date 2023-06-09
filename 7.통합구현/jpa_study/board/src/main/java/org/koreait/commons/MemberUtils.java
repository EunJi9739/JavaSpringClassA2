package org.koreait.commons;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.commons.constants.MemberType;
import org.koreait.entities.Member;
import org.koreait.models.member.MemberInfo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtils {
    private final HttpSession session;

    public boolean isLogin(){
        return getMember() != null;
    }

    public boolean isAdmin(){

       return isLogin() && getMember().getType() == MemberType.ADMIN;
    }

    public MemberInfo getMember(){
        MemberInfo memberInfo = (MemberInfo) session.getAttribute("memberInfo");
        return memberInfo;
    }

    public Member getEntity(){
        if(isLogin()){
            Member member = new ModelMapper().map(getMember(), Member.class);
            return member;
        }

        return null;
    }
}
