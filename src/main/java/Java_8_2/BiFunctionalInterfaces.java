package Java_8_2;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiFunctionalInterfaces {
    public static void main(String[] args) {

//        BiConsumer<String,Integer> bic=(name,age)-> System.out.println(name + " " +age);
//        bic.accept("Ajay",23);
//        Consumer<String>c=name->System.out.println(name);
//        c.accept("Ajay");

//Supplier
        Supplier<Integer>n=()->new Random().nextInt(1000);
        System.out.println(n.get());

    }
}
