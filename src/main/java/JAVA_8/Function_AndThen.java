package JAVA_8;

import java.util.function.Function;

public class Function_AndThen {
    public static void main(String[] args) {
        Function<Integer,Integer>f1=s->s*2;
        Function<Integer,Integer>f2=p->p*p*p;
        //andThen
        System.out.println(f1.andThen(f2).apply(4));
        //Compose
        System.out.println(f1.compose(f2).apply(4));
    }
}
