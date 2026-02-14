package JAVA_8;

import java.util.function.UnaryOperator;

public class Unary_1 {
    public static void main(String[] args) {
        UnaryOperator<String>s1=str->str.toUpperCase();
        System.out.println(s1.apply("ajay"));
    }
}
