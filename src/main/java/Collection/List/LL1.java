package Collection.List;

import java.util.*;
 public class LL1 {
    public static void main(String[] args) {
        ArrayList o=new ArrayList();
        o.add(10);
        o.add("Ajay");
        o.add('a');
        o.add(30);
        o.add(89);

        LinkedList ll=new LinkedList();
        ll.add(20);
        ll.add("Sam");
        ll.add("Ravi");
        ll.add(34);

        Vector v=new  Vector();
        v.add(78);
        v.add(67);
        v.add("Ramesh");
        v.add("K");
        v.add(10.908);

        Stack s=new Stack();
        s.add(10);
        s.add("Swami");
        s.add(20);
        s.add(40);


       ArrayList n=new ArrayList(v);
        System.out.println(n);


       ArrayList n1=new ArrayList(s);
        System.out.println(n1);
        
        ArrayList n3=new ArrayList(ll);
        System.out.println(n3);

    }
}
