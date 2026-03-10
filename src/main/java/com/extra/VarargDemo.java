package com.extra;

import java.util.Arrays;
import java.util.Map;

public class VarargDemo {
    int[] a(int ...n){
        return n;

    }




    public static void main(String[] args) {
        VarargDemo o=new VarargDemo();
        int [] res= o.a(10,20,30);
        System.out.println(Arrays.toString(res));
        Map<Integer,String>map=Map.of(1,"Ajay",2,"Rahul");
        System.out.println(map);
        //After java 10
        var map1=Map.of(1,"A",2,"B",3,"C");
        System.out.println(map1);





    }
}
