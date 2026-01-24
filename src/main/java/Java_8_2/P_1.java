package Java_8_2;
import  java.util.function.*;

public class P_1 {
    public static void main(String[] args) {
        int arr[]={11,21,22,24,23,45,88,67,89};
        Predicate<Integer>p=i->i%2==0;
        for(int x1:arr){
            if(p.test(x1)) {
                System.out.println(x1);
            }


        }
        double b=Math.sqrt(99);
        System.out.println(b);
    }
}
