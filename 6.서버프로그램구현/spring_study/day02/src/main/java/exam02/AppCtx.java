package exam02;

import exam01.config.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean(initMethod = "init",destroyMethod = "close")
    public Message message(){
        return new Message();
    }


}
