package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args){
        Person p1 = new Person(20, "이름");
        Class cls1 = p1.getClass();

        Class cls2 = Person.class;

        Field[] fields = cls2.getFields();
        Method[] methods = cls2.getMethods();
        Constructor[] constructors = cls2.getConstructors();

        System.out.println("=============Fields=============");
        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println("=============Method=============");
        for(Method method : methods){
            System.out.println(method);
        }
        System.out.println("=============Constructor=============");
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }
}
