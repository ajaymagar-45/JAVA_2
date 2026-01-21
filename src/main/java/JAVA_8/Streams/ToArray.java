package JAVA_8.Streams;

import java.util.ArrayList;
import  java.util.stream.*;
import java.util.function.*;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        System.out.println(l);
        Integer arr[]= (Integer[]) l.stream().toArray(Integer[]::new);
        Stream.of(arr).forEach(System.out::println);
//        for(Integer i:arr)
//            System.out.println(i);


    }
}
