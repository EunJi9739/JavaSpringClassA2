package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class MemberInfoService {

    @Autowired
    private MemberDao memberDao;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");

    //@Autowired(required = false)
    //의존하고 있는 객체가 없으면 호출 X
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter; //this.formatter = null; 널값을 주입.?
    }

    public void print(String userId) {
        Member member = memberDao.get(userId);

        System.out.println(member);
        if (formatter != null) {
            System.out.println(formatter.format(member.getRegDt()));
        }
    }

}
