package Collection.ArrayList;
import java.util.Comparator;
import java.util.*;
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class IdComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.id-s2.id;
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;   // ascending order
    }
}

public class ImplementingComparatorForCustomSorting {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Summit", 22));
        list.add(new Student(102, "Ganesh", 19));
        list.add(new Student(103, "Aryan", 25));
        list.add(new Student(115, "Ram", 24));
        list.add(new Student(132, "Tanmay", 17));
        list.add(new Student(126, "Suresh", 23));
        list.add(new Student(178, "Gautam", 27));
        list.add(new Student(114, "Pratik", 19));
        list.add(new Student(106, "Nayan", 26));

        Collections.sort(list, new AgeComparator());
        Collections.sort(list,new IdComparator());

        for (Student s2 : list) {
            System.out.println("Sorting By Student's age: "+ s2.id + " " + s2.name + " " + s2.age);

        }
        System.out.println(" *************************************");
        for(Student s1:list){
            System.out.println("Sorting by Student's id :" + s1.id+ " " + s1.name +" " +s1.age);

        }
    }
}



