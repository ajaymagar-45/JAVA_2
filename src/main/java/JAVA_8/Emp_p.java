package JAVA_8;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Emp_p {
    String name;
    int salary;

    Emp_p(String name,int salary){
        this.name=name;
        this.salary=salary;

    }

    public static void main(String[] args) {
        ArrayList<Emp_p> a=new ArrayList<>();
        a.add(new Emp_p("Ajay",75000));
        a.add(new Emp_p("Raj",60000));
        a.add(new Emp_p("Ramesh",50000));
        a.add(new Emp_p("Rahul",65000));
        a.add(new Emp_p("Suresh",80000));
        a.add(new Emp_p("Kamal",75000));

        Predicate<Emp_p> p=e->e.salary>60000;
        for(Emp_p p1:a){
            if(p.test(p1)){
                System.out.println(p1.name +" " +p1.salary);
            }

        }

    }
}
