package Stream;

import java.util.*;
import java.util.stream.*;

public class StreamMethodsDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 4, 6);

        // filter()
        System.out.println("Filter (>5):");
        list.stream()
                .filter(x -> x > 5)
                .forEach(System.out::println);

        // map()
        System.out.println("\nMap (square):");
        list.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        // distinct()
        System.out.println("\nDistinct:");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        // sorted()
        System.out.println("\nSorted:");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        // limit()
        System.out.println("\nLimit (first 3):");
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip()
        System.out.println("\nSkip first 2:");
        list.stream()
                .skip(2)
                .forEach(System.out::println);

        // count()
        long count = list.stream().count();
        System.out.println("\nCount: " + count);

        // min()
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("Min: " + min.get());

        // max()
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("Max: " + max.get());

        // reduce()
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum);

        // anyMatch()
        boolean any = list.stream().anyMatch(x -> x > 9);
        System.out.println("Any > 9: " + any);

        // allMatch()
        boolean all = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println("All even: " + all);

        // noneMatch()
        boolean none = list.stream().noneMatch(x -> x < 0);
        System.out.println("None negative: " + none);

        // findFirst()
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("First element: " + first.get());

        // collect()
        List<Integer> collected = list.stream()
                .filter(x -> x > 4)
                .collect(Collectors.toList());

        System.out.println("Collected List (>4): " + collected);

        // groupingBy()
        Map<String, List<Integer>> grouped =
                list.stream().collect(Collectors.groupingBy(
                        x -> x % 2 == 0 ? "Even" : "Odd"));

        System.out.println("GroupingBy: " + grouped);

        // partitioningBy()
        Map<Boolean, List<Integer>> partition =
                list.stream().collect(Collectors.partitioningBy(x -> x > 5));

        System.out.println("PartitioningBy (>5): " + partition);

        // summingInt()
        int total = list.stream().collect(Collectors.summingInt(x -> x));
        System.out.println("Sum using collector: " + total);

        // averagingInt()
        double avg = list.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + avg);
    }
}