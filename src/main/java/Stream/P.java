package Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P {


    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,10,20,20,40,50,50,60,87);

        //1.filter() used to filter data
//        al.stream().filter(i->i>20).forEach(System.out::println);


        //2.map()  perform some action or procees the existing data
//        al.stream().map(i->i*100).forEach(System.out::println);

        //3.distinct
//        al.stream().distinct().forEach(System.out::println);

        //4.sorted
//        al.stream().sorted().forEach(System.out::println);

        //5.limit
//        al.stream().limit(2).forEach(System.out::println);

        //6.skip
//        al.stream().skip(2).forEach(System.out::println);
        //7.count
//        long a=al.stream().count();
//        System.out.println(a);
        //8.min
//        Optional o= al.stream().min(Integer::compareTo);
//        System.out.println(o);
        //9.max
//       Optional o1= al.stream().max(Integer::compareTo);
//        System.out.println(o1);
        //10.reduce
//       int sum= al.stream().reduce(0,Integer::sum);
//        System.out.println(sum);
        //reduce
//       int max=al.stream().reduce(0,(a1,b1)->a1>b1?a1:b1);
//        System.out.println(max);
        //11.anymatch
//        boolean c=al.stream().anyMatch(a->a>56);
//        System.out.println(c);
//
        //12.noneMatch
//        boolean n=al.stream().noneMatch(i->i>300);
//        System.out.println(n);
        //13.findfirst
//        Optional ff=al.stream().findFirst();
//        System.out.println(ff.get());
        //14.collect
//        List<Integer>ll=al.stream().collect(Collectors.toList());
//        System.out.println(ll);
        //15.groupingBy
//        Map<Integer,List<Integer>>m=al.stream().collect(Collectors.groupingBy(i->i*10));
//        System.out.println(m);
        //16.partialGrouping
        Map<Boolean,List<Integer>>pb=al.stream().collect(Collectors.partitioningBy(i->i>40));
        System.out.println(pb);
        //17.averagingInt
//        double ak=al.stream().collect(Collectors.averagingInt(x->x));
//        System.out.println(ak);








//        Predicate<Integer>p=(i->i>2);
//        System.out.println(p.test(20));
//
//        Function<Integer,Integer>f=(i->i*5);
//        System.out.println(f.apply(56));
//
//        Consumer<String> c= x->System.out.println(x);
//        c.accept("Hello java");
//
//        Supplier s=()->Math.random();
//        System.out.println(s.get());
    }
}
