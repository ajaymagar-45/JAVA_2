package JAVA_8.Streams;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList();
        l.add(5);
        l.add(12);
        l.add(45);
        l.add(23);
        l.add(76);
        l.add(65);
        l.add(43);
        l.add(45);
        l.add(34);
        System.out.println("Insertion order  : " + l);
        int l1=l.stream().sorted().min((i1, i2)->i1.compareTo(i2)).get();
        System.out.println("Minimum in  given list : "+l1);
        int l2=l.stream().min((i1,i2)->i2-i1).get();
        System.out.println("Maximum in given list : " + l2);

    }
}
