import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;
import java.util.stream.*;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList();
        al.add("Java");
        al.add("Python");
        al.add("Php");
        al.add("CSS");
        al.add("Ruby");
        al.add(1,"HTML");//After adding element at the existing position it will shift the all the element by that elements position
        //remove the duplicates from the given list
//        HashSet<ArrayList> hs=new HashSet<>(al);
//        System.out.println(hs);

        //Reverse the given list
//        System.out.println("Original Output : "+al);
//        Collections.reverse(al);
//        System.out.println("Output after reversing the given list :" +al);
//        al.stream()
//                .filter(name -> name.startsWith("P"))
//                .forEach(System.out::println);
        System.out.println(al);



        al.trimToSize();
//        Vector v=new Vector(3);
//        System.out.println("Capacity before inserting elements : "+ v.capacity());
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(4);
//        System.out.println(v);
//        System.out.println("Capacity after insertion exceeds the capacity :  "+v.capacity());
//
    }
}
