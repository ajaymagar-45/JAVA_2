package JAVA_8;

import java.util.*;
public class ToStringDemo {
    int no;
    String name;
    ToStringDemo(int no,String name){
        this.no=no;
        this.name=name;
    }

    @Override
    public String toString() {
        return (no +" "+name);
    }

    public static void main(String[] args) {
//        JAVA_8.ToStringDemo t=new JAVA_8.ToStringDemo(10,"Ajay");
//        System.out.println(t);
        ArrayList<ToStringDemo> l=new ArrayList<ToStringDemo>();
        l.add(new ToStringDemo(10,"ajay"));
        l.add(new ToStringDemo(11,"Shiva"));
        l.add(new ToStringDemo(30,"Ram"));

//        System.out.println(l);
        //Sorting by no by using sort method present inside of collections class
        Collections.sort(l, (e1,e2)->(e1.no<e2.no)?-1:(e1.no>e2.no)?1:0);

        System.out.println("Sorting by using no : "+l);
        //Sorting by alphabatical order by using copaareTo method
        Collections.sort(l, (e1,e2)->(e1.name.compareTo(e2.name)));
        System.out.println("Sorting by alphabetical order : "+l);

    }

}
