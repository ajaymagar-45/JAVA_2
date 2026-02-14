package Java_8_2;

import java.util.function.*;

interface Itr{
    public int use(int a,int b);
}

public class Fun_1  {
    public static void main(String[] args) {
        Itr a1=(a,b)->a+b;
        System.out.println(a1.use(33,67));

        Itr a2=(a,b)->a*b;
        System.out.println(a2.use(42,57));

        Predicate<Integer> p=i->i>=5;
        System.out.println(p.test(10));

        Function<Integer,Integer> f=(a)->a+5;
        System.out.println(f.apply(10));

        Consumer c= System.out::println;
        c.accept("Hi! output is by using consumer");

        BiPredicate<Integer,Integer> bi=(a,b)->a>b;
        System.out.println(bi.test(10,10));

        BiFunction<Integer,Integer,Integer> bi1=(i1,i2)->(i1+i2)*6;
        System.out.println(bi1.apply(23,45));

        Supplier si=()->100+8899;
        System.out.println(si.get());


    }

}
