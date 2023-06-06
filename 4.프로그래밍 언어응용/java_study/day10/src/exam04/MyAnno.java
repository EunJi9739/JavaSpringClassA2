package exam04;

import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE,FIELD,METHOD, PARAMETER, })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String[] value() default {"값1", "값2"};
    int min() default 10;//항목을 설정하지 않으면 자동으로 10.
    int max() default 100;//항목을 설정 100
}
