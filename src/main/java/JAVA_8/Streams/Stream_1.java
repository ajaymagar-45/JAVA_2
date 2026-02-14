package JAVA_8.Streams;

import java.util.stream.Stream;

public class Stream_1 {
    public static void main(String[] args) {
        Stream s= Stream.of(10,67,34,56,78,89,78,6);
        s.forEach(System.out::println);

    }
}
