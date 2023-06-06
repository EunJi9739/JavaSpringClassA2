package exam03.models.member;

import java.time.LocalDateTime;

//멤버는 객체니까 컴포너트 스캔 할필요 없음
public class Member {
    private String userId;
    private String userPw;
    private String userPwRe;

    private String userNm;

    private LocalDateTime regDt;


    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserPwRe() {
        return userPwRe;
    }

    public void setUserPwRe(String userPwRe) {
        this.userPwRe = userPwRe;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userPwRe='" + userPwRe + '\'' +
                ", userNm='" + userNm + '\'' +
                ", regDt=" + regDt +
                '}';
    }
}