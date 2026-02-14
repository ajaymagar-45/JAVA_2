package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementingVariousSortingInStream {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList();
        l.add(34);
        l.add(10);
        l.add(78);
        l.add(67);
        l.add(77);
        l.add(46);
        l.add(89);
        l.add(73);
        System.out.println(l);
        List<Integer> l2=l.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted method also sort in assecending order: "+l2);
        List<Integer> l1=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Default sorting by using copareTo method : "+l1);
        List<Integer> l3=l.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        List<Integer> l4=l.stream().sorted((i1,i2)->i2-i1).collect(Collectors.toList());
        System.out.println("Custom sorting by using comparator : "+ l4);

    }
}
