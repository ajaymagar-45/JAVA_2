package JAVA_8.Streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Map_1 {

    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList();
        l.add(60);
        l.add(25);
        l.add(78);
        l.add(55);
        l.add(45);
        l.add(64);
        l.add(19);
        l.add(89);
        l.add(90);
        l.add(82);
        System.out.println(l);
        List<Integer> graceMarks= l.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("Grace marks : "+graceMarks);
        long noOfFailedStudent=l.stream().filter(i->i<50).count();
        System.out.println("Implementing Count method to get the count of failed students : "+noOfFailedStudent);
        //Sorted list
        List<Integer> sortedList=l.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List : "+sortedList);
        System.out.println(   );
        System.out.println(    );
        List<Integer> ownSorting=l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println("Our own custom sorting : "+ownSorting);
        System.out.println();
        System.out.println();
        
        //By using compareTo method of comparable interface
        List<Integer>dNSO=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Default natural sorting by using compareTo method of Comparable  interface : "+dNSO);
        List<Integer>reverseOfDNSO=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());


        System.out.println("We will get the reverse output of default natural sorting order by placing a single - symbol : "+ reverseOfDNSO);
        List<Integer>l5=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(l5);

    }
}
