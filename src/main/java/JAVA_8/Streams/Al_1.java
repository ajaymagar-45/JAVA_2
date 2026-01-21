package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Al_1 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(23);
        l.add("ajay");
        l.add(40);
        l.add(67);
        l.add(78);
        l.add(91);
        l.add(65);
        l.add(89);
        l.add(0);
        System.out.println(l);
//        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l2);


    }
}
