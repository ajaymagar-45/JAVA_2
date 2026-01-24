package Java_8_2;

import java.util.function.BiConsumer;

public class BiFunctionalInterfaces {
    public static void main(String[] args) {

        BiConsumer<String,Integer> bic=(name,age)-> System.out.println(name + " " +age);
        bic.accept("Ajay",23);

    }
}
