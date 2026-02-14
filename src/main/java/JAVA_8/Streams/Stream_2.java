package JAVA_8.Streams;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream_2 {
    public static void main(String[] args) {
        List<String> l= new ArrayList();
        l.add("Ajay");
        l.add("Ravi");
        l.add("Krushana");
        l.add("Om");
        l.add("Ashish");
        l.add("Vishal");
        System.out.println("Output in insertion order :  "+l);
        List<String>l2=l.stream().sorted().collect(Collectors.toList());
        System.out.println(" Output inDefault sorting order : " +l2);

        List<String> l3=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Output in custom sorting order : " +l3);
    }
}
