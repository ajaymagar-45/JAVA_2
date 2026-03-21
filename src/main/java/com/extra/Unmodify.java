package com.extra;

import java.util.*;

public class Unmodify {
    public static void main(String[] args) {
        List l=  List.of(1,2,3);
//        l.add("A");
//        l.add("B");
//        l.add(12);
//        l.add(90);
        System.out.println("Before modification : "+l);

//        List<Object> ul=l.stream().collect(Collectors.toUnmodifiableList());
//        System.out.println(ul);
//        try{l.add(100);
//        System.out.println("After Modification : "+l);} catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        List l2=new ArrayList();
//        l2.add(1);
//        l2.add(2);
//        l2.add(4);
//
//        List l3=List.of(l2);
//        l2.add(23);
//        System.out.println("Trying to modify collection through immutable list :"+l3);
//        List l4= Collections.unmodifiableList(l2);
//        l2.add(1000);
//        System.out.println("After modification by unmodifiableList:"+l4);
//
//        List l6= List.of(10,"A",10);
//        System.out.println(l6);
//        System.out.println("If we try to modify list.of or unmodifiable list instead of the original it will raise an exception .And we can modify original collection in both cases" +
//                " ");

        Map map=new HashMap();
        System.out.println(map);
        HashSet set=new HashSet();
        set.add(null);
        set.add("Ajay");
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());



    }
}
