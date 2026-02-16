package JAVA_8;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {
    public static void main(String[] args) {
        ArrayList ll=new ArrayList();
        ll.add(10);
        ll.add("A");
        ll.add("aa");
        try {
            int a=10;
            System.out.println(a/0);
            for (Object s : ll) {
                ll.add("Will");
                System.out.println(s);
            }
        }catch (ArithmeticException c){
            System.out.println(c.getMessage());
        }catch(ConcurrentModificationException e){
            System.out.println(e.getMessage());

        }

    }
}
