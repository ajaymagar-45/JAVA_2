package com.extra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DD {
   static void a(){
        System.out.println("a");
    }
    static int b(){
        return 3+6;
    }
    int var(int ... numbers){
       int total=0;
       for(int n:numbers)
           total+=n;
       return total;
    }

    public static void main(String[] args) {
//
        Map<Integer, List<Integer>> map=new HashMap<>();
        map.put(10, Arrays.asList(10,20,30));
        map.put(12, Arrays.asList(29,67,90));
        map.put(20, Arrays.asList(70,90,40));
        map.put(30, Arrays.asList(30,80,30));
        System.out.println(map);
       List<Integer>flat= map.values().stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(flat);
        DD o=new DD();
        System.out.println(o.var(1));
        System.out.println(o.var(12,23,45,56,78));


    }
}
