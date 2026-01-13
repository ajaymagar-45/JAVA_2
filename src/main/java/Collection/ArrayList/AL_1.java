package Collection.ArrayList;
import java.awt.image.RasterOp;
import java.util.ArrayList;
import java.util.Collection.*;
import java.util.Collections;

public class AL_1 {
//    void ab(){
//        System.out.println("First method");
//    }
    public static void main(String[] args) {
        //Arraylist is not thread safe so multiple threads can access at time
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(45);
//        a.add(null);
       // a.clear();
//        a=null;
        System.out.println(Collections.binarySearch(a,45));
//        System.out.println(Collections.reverseOrder());

        System.out.println(a.size());
        System.out.println(a.isEmpty());



//        System.out.println(v.capacity());// we can check capacity for vector only there is no method to check capacity arraylist
//        System.out.println(Thread.currentThread().getThreadGroup().getName());
//        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//        AL_1 n=new AL_1(){
//            @Override
//            void ab() {
//                System.out.println("Method overridden from original");
//            }
//        };
//        n.ab();

    }
}
