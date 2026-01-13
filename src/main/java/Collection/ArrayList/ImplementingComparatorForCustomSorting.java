package Collection.ArrayList;

import java.util.*;

/* Student class with private fields, getters and setters */
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/* Comparator for sorting by ID */
class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (s1.getId() - s2.getId());
    }
}

/* Comparator for sorting by Age */
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
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

        // Sorting by Age
        Collections.sort(list, new AgeComparator());
        for (Student s : list) {
            System.out.println(
                    "Sorting By Student's age: " +
                            s.getId() + " " + s.getName() + " " + s.getAge()
            );
        }

        System.out.println("*************************************");

        // Sorting by ID
        Collections.sort(list, new IdComparator());
        for (Student s : list) {
            System.out.println(
                    "Sorting by Student's id: " +
                            s.getId() + " " + s.getName() + " " + s.getAge()
            );
        }
    }
}
