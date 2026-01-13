package Collection.ArrayList;
import java.util.*;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap m= new HashMap();
        m.put(1,"shiva");
        m.put(2,"Ajay");
        m.put(3,"pratik");
        m.put(4,"Ravi");
        m.put(5,"vishwa");


        System.out.println(m);
m.remove(3,"pratik");
//        System.out.println( m.containsValue("Ravi"));
        m.replace(2,"Ajay","Tushar");
        System.out.println( m.entrySet());
        System.out.println(m);
         m.remove(4,"Ravi");
         m.put(3,"Ganesh");
//        System.out.println(m.size());
//        System.out.println(m);
////        System.out.println(m.keySet());
//       System.out.println(m.values());
//       System.out.println(m.entrySet());
//
//        System.out.println(m.containsValue("Ajay"));
    }
}
