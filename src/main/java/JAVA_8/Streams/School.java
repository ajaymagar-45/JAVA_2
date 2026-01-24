package JAVA_8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class School {
int rollno;
String name;
char division;
float marks;
    public  School(int rollno,String name,char division,float marks){
            this.rollno=rollno;
            this.name=name;
            this.division=division;
            this.marks=marks;
        }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno +" "+name +" " +division +" "+marks;
    }

    public static void main(String[] args) {
        List<School>ll=new ArrayList<>();
        ll.add(new School(101,"Shravan Verama",'A',78.78f));
        ll.add(new School(112,"Ram Jadhav",'C',86.65f));
        ll.add(new School(104,"Ramesh Yadav",'D',65.79f));
        ll.add(new School(116,"Kamal Shinde",'F',95.04f));
        ll.add(new School(114,"Rahul kadam",'B',67.65f));
        ll.add(new School(117,"Ganesh Deshmukh",'E',86.65f));
        ll.add(new School(119,"Tejas Shinde",'f',64.8f));
        ll.stream().forEach(System.out::print);
//        System.out.println(no);
//        ll.stream().sorted(Comparator.comparingInt(School::getRollno).reversed()).collect(Collectors.toList()).forEach(System.out::println);
//        ll.stream().sorted(Comparator.comparing(School::getDivision)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
