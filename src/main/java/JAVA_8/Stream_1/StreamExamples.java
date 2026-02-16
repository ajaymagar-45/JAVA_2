package JAVA_8.Stream_1;

import JAVA_8.In;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> ll = Arrays.asList("apple","banana","cherry","apple", "avocado", "", null, "grape", "orange123");
//        // 1. Convert to uppercase, sort, and print
//        ll.stream().filter(Objects::nonNull).map(String::toUpperCase).sorted().forEach(System.out::println);
//
//        //2.Get count where string length is greater than 5
//        long count_1=ll.stream().filter(i->i!=null &&i.length()>5).count();
//        System.out.println(count_1);

        //Remove duplicates
//        List<String> unique=ll.stream().filter(Objects::nonNull).
//                distinct().
//                collect(Collectors.toList());
//        System.out.println(unique);
//
//        // 4. Get strings containing a specific word (e.g., "apple")
//        ll.stream()
//                .filter(i->i!=null &&i.contains("apple")).forEach(System.out::println);

        // 5. Remove strings starting with a specific word (e.g., "a")
//        List<String> withoutPrefix=ll.stream()
//                .filter(i->i!=null && !i.startsWith("a")).collect(Collectors.toList());
//        System.out.println(withoutPrefix);


        // 6. Find first element starting with a specific letter (e.g., 'b')
//        List<String> withprefix=ll.stream().filter(i->i!=null && i.startsWith("b")).collect(Collectors.toList());
//        System.out.println(withPrefix);

        // 7. Get the length of each string
//        List<Integer> lengthOfEachStringElement=ll.stream().filter(Objects::nonNull).map(String::length).collect(Collectors.toList());
//        System.out.println(lengthOfEachStringElement);
//        List<String> sortedByLengthAsc = ll.stream()
//                .filter(Objects::nonNull)
//                .sorted(Comparator.comparingInt(String::length))
//                .collect(Collectors.toList());
//        System.out.println("Sorted by length (asc): " + sortedByLengthAsc);

        // 9. Find the longest word
        ll.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

    }
}
