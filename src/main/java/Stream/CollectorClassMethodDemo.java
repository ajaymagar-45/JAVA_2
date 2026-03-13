package Stream;

import JAVA_8.In;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorClassMethodDemo {
    public static void main(String[] args) {

        List<Integer>ll= Arrays.asList(10,100,20,30,40,50,60);
        List<String>l1= Arrays.asList("Adshj","Bjkdlksjk","C","D","E","F");
        //1.toList
//        List a=ll.stream().collect(Collectors.toList());
//        System.out.println(a);
//        //2.toSet
//        Set b=ll.stream().collect(Collectors.toSet());
//        System.out.println(b);
        //3.toMap
//        Map<Integer,Integer> map=ll.stream().collect(Collectors.toMap(s->s,m->m));
//        System.out.println(map);
        //4.toCollection
//        List<Integer>li=ll.stream().collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(li);
        //5.joining
//        String a=l1.stream().collect(Collectors.joining(","));
//        System.out.println(a);
        //6.counting
//        Long count=ll.stream().collect(Collectors.counting());
//        System.out.println(count);
        //7.groupingBy
//        Map<Integer,List<String>> group=l1.stream().collect(Collectors.groupingBy(String::length));
//        System.out.println(group);
        //8.partitionBy
//        Map<Boolean,List<Integer>>partition=ll.stream().collect(Collectors.partitioningBy(s->s>30));
//        System.out.println(partition);
        //9.summingInt
//        int sum=ll.stream().collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(sum);
        //10.averagingInt
//        double dd=ll.stream().collect(Collectors.averagingInt(Integer::intValue));
//        System.out.println(dd);
        //11.summerizingInt
//        IntSummaryStatistics stats=ll.stream().collect(Collectors.summarizingInt(Integer::intValue));
//        System.out.println(stats);
        //12.minBy
//        Optional min=ll.stream().collect(Collectors.minBy(Integer::compareTo));
//        System.out.println(min);
        //13.maxBy
//        Optional max=ll.stream().collect(Collectors.maxBy(Integer::compareTo));
//        System.out.println(max);
        //14.mapping
//        List<Integer>mapping=ll.stream().collect(Collectors.mapping(a->a+30,Collectors.toList()));
//        System.out.println(mapping);
        //15.collectingAndThen
        List<String> o=l1.stream().collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(o);
    }
}
