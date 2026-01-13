package JAVA_8;
import java.util.function.Function;
public class Function_1 {

    public static void main(String[] args) {
        Function<Integer,Double> f=i->i* i.doubleValue();
        System.out.println(f.apply(10));

//When parameters are different
        Function<String,Integer>f1=i->i.length();
        System.out.println(f1.apply("AJAY "));

        //If return type is also of String type
        Function<String,String>f2=i->i.toUpperCase();
        System.out.println(f2.apply(" hi my name is ajay"));

    }

}
