package Collection.ArrayList;
import java.util.*;


public class Queue_1 {
    public static void main(String[] args) {
        Queue q=new LinkedList();
//        q.offer(10);
//        q.offer(39);
//        q.offer("Ajay");
//        q.offer(50);
//        q.offer(60);
//        q.offer(70);
        q.remove("Ajay");

        q.offer(34);
//        System.out.println(q);
//
//        System.out.println( q.peek());
        for(int i=1;i<=10;i++){
            q.offer(i);

        System.out.println(i);}
        System.out.println(q.size());
    }
}
