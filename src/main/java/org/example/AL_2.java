package org.example;
import java.util.*;

public class AL_2 {


    public static void main(String[] args) {
       ArrayList u=new ArrayList();


        u.add(10);
        u.add(20);
        u.add(30);

       u.add("Ajay");
//        System.out.println(u);
//        LinkedList l=new LinkedList(u);
//        System.out.println(l);

        Set set = new HashSet(u);
// switch later
        set = new HashSet(u);
        System.out.println(set);
        PriorityQueue y=new PriorityQueue();
        y.add(10);
        y.add(783);
        y.add(763);
        y.offer(36);
        y.offer(61);
        y.offer(61);
        y.offer(68);
        System.out.println(y);
        //if element is not present in queuue then it will return null
        System.out.println(y.peek());
        //If element is not present in queue then this method raise an exception
        System.out.println(y.element());




    }


}
