package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        l.stream().forEach(System.out::println);

        Consumer<Integer> c=i->{
        System.out.println("Square of "+i+"is : "+(i*i));};
        l.stream().forEach(c);

        l.stream().forEach(i->{
            System.out.println("The number is : "+i);
        });


    }
}
