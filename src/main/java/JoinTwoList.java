import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        al1.toArray();
        for (Object s:al1)
            System.out.println(s);
        ArrayList al2=new ArrayList();
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al2.add(7);
        al1.remove(1);
        al1.set(1,100.99);
       al1.addAll(al2);

       System.out.println(al1);
        System.out.println("First occurance of 7 : "+al2.indexOf(7));
        System.out.println("last occurance of 7 : "+ al2.lastIndexOf(7));


    }
}
