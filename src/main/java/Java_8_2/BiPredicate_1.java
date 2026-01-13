package Java_8_2;

import java.util.function.BiPredicate;

public class BiPredicate_1 {
    public static void main(String[] args) {
        BiPredicate<Integer ,Integer> b1=(a,b)->(a+b)%2==0;
        System.out.println(b1.test(10,20));
    }
}
