import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        ArrayList al2=new ArrayList();
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al1.addAll(al2);
        System.out.println(al1);



    }
}
