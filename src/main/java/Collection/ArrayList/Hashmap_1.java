package Collection.ArrayList;

import java.util.*;

public class Hashmap_1 {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put(101,"Ajay");
        m.put(102,"Ravi");
        m.put("op",29);
        System.out.println(m);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();//Entry is inner interface of
        System.out.println(s1);

        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey() + " " + m1.getValue());
            if(m1.getKey().equals("Ajay")){
                m1.setValue("kisan");
            }
        }
        System.out.println(m);
//        Hashtable t=new Hashtable();
//        Hashtable t1=new Hashtable(10);
//        Hashtable t2=new Hashtable(10,2.5f);
    }
}
