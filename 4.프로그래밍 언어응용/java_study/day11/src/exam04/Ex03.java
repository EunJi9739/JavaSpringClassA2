package exam04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex03 {
    public static void main(String[] args){
        //ArrayList<String> names = new ArrayList<>();
        LinkedList<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        printData(names);
/*
        for(int i = 0; i< names.size(); i++){
            names.remove(i);
        }


        for(int i = names.size() - 1;  i>=0; i--){
            names.remove(i);
        }*/
        //System.out.println(names);
    }

    public static void printData(LinkedList<String> names){
        System.out.println(names);
    }
}
