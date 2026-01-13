package JAVA_8;


import java.util.function.Function;
import java.util.function.Predicate;

public class Student_Function {
    String name;
    int marks;
    Student_Function(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student_Function{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        Function<Student_Function,String>f=sf->{

            int marks=sf.marks;
            String grade="";
            if(marks>=80) grade="Grade A";
            else if(marks>=60) grade="Grade B";
           else if(marks>=50) grade="Grade A";
           else if(marks>=35) grade="Grade A";
           else grade="E";
            return grade;

        };
        Predicate<Student_Function>p=s->s.marks>=60;
        Student_Function[] sf=new Student_Function[6];
        sf[0]=new Student_Function("Ajay",80);
        sf[1]=new Student_Function("Rahul",65);
        sf[2]=new Student_Function("Shyam",70);
        sf[3]=new Student_Function("Ganesh",90);
        sf[4]=new Student_Function("Naman",85);
        sf[5]=new Student_Function("Rudra",65);
        for(Student_Function s1:sf){
            if(p.test(s1)) {
                System.out.println("Student Name:" + s1.name);
                System.out.println("Student Marks:" + s1.marks);
                System.out.println("Student Grade:" + f.apply(s1));
                System.out.println();
            }
        }



    }
}
